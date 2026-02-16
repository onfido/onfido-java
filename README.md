# Onfido Java Library

The official Java library for integrating with the Onfido API.

Documentation is available at <https://documentation.onfido.com>.

This library is for backend use only, as it requires secret Onfido API tokens and should not be used in the frontend due to security reasons.

If you need to collect applicant data in the frontend of your application, we recommend that you use the Onfido SDKs:

- [iOS](https://github.com/onfido/onfido-ios-sdk)
- [Android](https://github.com/onfido/onfido-android-sdk)
- [Web](https://github.com/onfido/onfido-sdk-ui)
- [React Native](https://github.com/onfido/react-native-sdk)

This version uses Onfido API v3.6. Refer to our [API versioning guide](https://developers.onfido.com/guide/api-versioning-policy#client-libraries) for details. The guide explains which client library versions use which API versions.

![Build Status](https://github.com/onfido/onfido-java/actions/workflows/maven.yml/badge.svg)

## Installation & Usage

### Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

### Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [Maven Central Publishing Guide](https://central.sonatype.org/publish/publish-portal-guide/#introduction) for more information on publishing to Maven Central.

#### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.onfido</groupId>
  <artifactId>onfido-api-java</artifactId>
  <version>7.0.0</version>
  <scope>compile</scope>
</dependency>
```

#### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'onfido-api-java' jar has been published to maven central.
    mavenLocal()       // Needed if the 'onfido-api-java' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.onfido:onfido-api-java:7.0.0"
  }
```

#### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/onfido-api-java-7.0.0.jar`
- `target/lib/*.jar`

The latest version can be found at <https://search.maven.org/artifact/com.onfido/onfido-api-java/7.0.0/jar>.

## Getting Started

Import the `DefaultApi` object, this is the main object used for interfacing with the API:

```java
import com.onfido.api.DefaultApi;
import com.onfido.ApiClient.Region;
import com.onfido.Configuration;

import com.onfido.ApiException;
import com.onfido.OnfidoInvalidSignatureError;
```

Instantiate and configure an `Onfido` instance with your API token, and region if necessary:

```java
DefaultApi onfido = new DefaultApi(Configuration.getDefaultApiClient()
                      .setApiToken(System.getenv("ONFIDO_API_TOKEN"))
                      .setRegion(Region.EU)     // Supports `EU`, `US` and `CA`
                      .setConnectTimeout(60_000)
                      .setReadTimeout(60_000)
                      .setProxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port))));   // Optionally define a connection proxy with the specified host and port
```

NB: By default, the connection and read timeout values are set to 30 seconds. You can adjust these values as shown in the configuration section.

### Making a call to the API

Most of the request bodies can be created using a builder pattern, this would look something like:

```java
new ApplicantBuilder().firstName("First").lastName("Last");
```

The above will return an `ApplicantBuilder` object that can be provided to the `createApplicant()` method as the request body, a full call to the API will look something like:

```java
try {
   Applicant applicant = onfido.createApplicant(new ApplicantBuilder()
                                                   .firstName("First")
                                                   .lastName("Last"));

   //  To access the information call the getter of the desired property on the object, for example:
   applicant.getFirstName();

   // ...

} catch (ApiException e) {
    // An error response was received from the Onfido API, extra info is available.
    System.out.println(e.getMessage());
    System.out.println(e.getCode());
} catch( javax.ws.rs.ProcessingException e ) {
    // No response was received for some reason e.g. a network error.
    System.out.println(e.getMessage());
}
```

### Webhook event verification

Webhook events payload needs to be verified before it can be accessed. Verifying webhook payloads is crucial for security reasons, as it ensures that the payloads are indeed from Onfido and have not been tampered with. The library allows you to easily decode the payload and verify its signature before returning it as an object for user convenience:

```java
try {
   WebhookEventVerifier verifier = new WebhookEventVerifier(
      System.getenv("ONFIDO_WEBHOOK_SECRET_TOKEN")
   );

   String signature = "a0...760e";

   WebhookEvent event = verifier.readPayload("{\"payload\":{\"r...3\"}}", signature);
} catch( OnfidoInvalidSignatureError e ) {
   // Invalid webhook signature
}
```

### Recommendations

#### Don't share DefaultApi among different threads

It's recommended to create an instance of `DefaultApi` per thread in a multithreaded environment to avoid potential issues.

#### Do not use additional properties

Except for retrieving Task object's outputs, avoid using `getAdditionalProperty()` or `getAdditionalProperties()` methods to access undefined properties to prevent breaking changes when these fields appear.

#### Use the linter when contributing

When contributing to the project, run the linter to ensure code quality:

```bash
google-java-format -i $(git ls-files src/test/\*.java)
```

## Contributing

This library is automatically generated using [OpenAPI Generator](https://openapi-generator.tech) (version: 7.16.0); therefore, all contributions (except test files) should target the [Onfido OpenAPI specification repository](https://github.com/onfido/onfido-openapi-spec/tree/master) instead of this repository. Please follow the contribution guidelines provided in the OpenAPI specification repository.

For contributions to the tests instead, please follow the steps below:

1. Fork the [repository](https://github.com/onfido/onfido-java/fork)
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Make your changes
4. Commit your changes (`git commit -am 'Add detailed description of the feature'`)
5. Push to the branch (`git push origin my-new-feature`)
6. Create a new Pull Request

## Versioning policy

Versioning helps manage changes and ensures compatibility across different versions of the library.

[Semantic Versioning](https://semver.org) policy is used for library versioning, following the guidelines and limitations outlined below:

- MAJOR versions (x.0.0) may:
  - target a new API version
  - include non-backward compatible change
- MINOR versions (0.x.0) may:
  - add a new functionality, non-mandatory parameter or property
  - deprecate an old functionality
  - include non-backward compatible change to a functionality which is:
    - labelled as alpha or beta
    - completely broken and not usable
- PATCH version (0.0.x) will:
  - fix a bug
  - include backward compatible changes only

## More documentation

Additional documentation and code examples can be found at <https://documentation.onfido.com>.

## Support

Should you encounter any technical issues during integration, please contact Onfido's Customer Support team via the [Customer Experience Portal](https://public.support.onfido.com/) which also includes support documentation.
