package com.onfido;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import com.onfido.models.Model;
import com.onfido.models.ModelJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.project.MavenProject;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "generate", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class GenerateModelsMojo extends AbstractMojo {
  @Parameter(defaultValue = "${project}", readonly = true)
  private MavenProject project;

  @Parameter(defaultValue = "${project.build.directory}/generated-sources/models")
  private File outputDirectory;

  @Parameter(required = true)
  private String packageName;

  @Parameter(required = true)
  private File modelsDirectory;

  @Parameter(required = true)
  private File templatesDirectory;

  private Path packageOutputDirectoryPath;
  private JsonAdapter<Model> jsonAdapter;
  private MustacheFactory mustacheFactory;

  public void execute() throws MojoExecutionException {
    getLog().info("Generating model classes");
    setup();

    try {
      Map<String, Mustache> templatesByName = compileTemplates();
      List<Path> modelPaths = getFilePaths(modelsDirectory.toPath(), ".json");

      for (Path modelPath : modelPaths) {
        Model model = readJson(modelPath);

        for (Map.Entry<String, Mustache> templateEntry : templatesByName.entrySet()) {
          String fileName = templateEntry.getKey().replace("Model", model.className) + ".java";
          writeRenderedTemplate(fileName, templateEntry.getValue(), model);
        }
      }
    } catch(IOException e) {
      throw new MojoExecutionException(e.getMessage(), e);
    }

    project.addCompileSourceRoot(outputDirectory.getPath());
  }

  private void setup() {
    String packagePath = packageName.replace(".", File.separator);
    File outputDirectoryWithPackage = new File(outputDirectory, packagePath);
    outputDirectoryWithPackage.mkdirs();
    packageOutputDirectoryPath = Paths.get(outputDirectoryWithPackage.getPath());

    mustacheFactory = new DefaultMustacheFactory(templatesDirectory);

    Moshi moshi = new Moshi.Builder().add(new ModelJsonAdapter()).build();
    jsonAdapter = moshi.adapter(Model.class);
  }

  private Map<String, Mustache> compileTemplates() throws IOException {
    List<Path> templatePaths = getFilePaths(templatesDirectory.toPath(), ".mustache");
    Map<String, Mustache> templatesByName = new HashMap<String, Mustache>();

    for (Path templatePath : templatePaths) {
      String name = templatePath.toFile().getName();
      Mustache template = mustacheFactory.compile(name);
      templatesByName.put(name.replace(".mustache", ""), template);
    }

    return templatesByName;
  }

  private List<Path> getFilePaths(Path directory, String extension) throws IOException {
    return Files.list(directory)
      .filter(path -> path.toString().endsWith(extension))
      .collect(Collectors.toList());
  }

  private Model readJson(Path path) throws IOException {
    String rawJson = new String(Files.readAllBytes(path));
    return jsonAdapter.fromJson(rawJson);
  }

  private void writeRenderedTemplate(String fileName, Mustache template, Model model) throws IOException {
    Path path = packageOutputDirectoryPath.resolve(fileName);
    Writer writer = Files.newBufferedWriter(path);
    template.execute(writer, model).close();
  }
}
