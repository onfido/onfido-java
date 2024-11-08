# Onfido Java Library

The official Java library for integrating with the Onfido API.

Documentation can be found at <https://documentation.onfido.com>.

This library is only for use on the backend, as it uses Onfido API tokens which must be kept secret. If you do need to collect applicant data in the frontend of your application, we recommend that you use the Onfido SDKs: [iOS](https://github.com/onfido/onfido-ios-sdk), [Android](https://github.com/onfido/onfido-android-sdk), [Web](https://github.com/onfido/onfido-sdk-ui), and [React Native](https://github.com/onfido/react-native-sdk).

This version uses Onfido API v3.6. Refer to our [API versioning guide](https://developers.onfido.com/guide/api-versioning-policy#client-libraries) for details of which client library versions use which versions of the API.

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

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

#### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.onfido</groupId>
  <artifactId>onfido-api-java</artifactId>
  <version>5.1.0</version>
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
     implementation "com.onfido:onfido-api-java:5.1.0"
  }
```

#### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/onfido-api-java-5.1.0.jar`
- `target/lib/*.jar`

The latest version can be found at: https://search.maven.org/artifact/com.onfido/5.1.0

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
                      .setReadTimeout(60_000));
```

NB: by default, timeout values are set to 30 seconds.

### Making a call to the API

Most of the request bodies can be created using a builder pattern, this would look something like:

```java
new ApplicantBuilder().firstName("First").lastName("Last");
```

The above will return an `Applicant.Request` object that can be provided to the `create()` method as the request body, so a full call to to the API will look something like:

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

Webhook events payload needs to be verified before it can be accessed. Library allows to easily decode the payload and verify its signature before returning it as an object for user convenience:

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

### Don't share DefaultApi among different threads

It's recommended to create an instance of `DefaultApi` per thread in a multithreaded environment to avoid any potential issues.

#### Do not use additional properties

Retain from using `getAdditionalProperty()` or `getAdditionalProperties()` methods to access not defined properties to avoid breaking changes when these fields will appear.

## Contributing

This library is automatically generated using [OpenAPI Generator](https://openapi-generator.tech) (version: 7.9.0); therefore all the contributions, except tests files, should target [Onfido OpenAPI specification repository](https://github.com/onfido/onfido-openapi-spec/tree/master) instead of this repository.

For contributions to the tests instead, please follow the steps below:

1. [Fork](https://github.com/onfido/onfido-java/fork) repository
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Make your changes
4. Commit your changes (`git commit -am 'Add some feature'`)
5. Push to the branch (`git push origin my-new-feature`)
6. Create a new Pull Request

## Versioning policy

[Semantic Versioning](https://semver.org) policy is used for library versioning, following guidelines and limitations below:

- MAJOR versions (x.0.0) might:
  - target a new API version
  - include non-backward compatible change
- MINOR versions (0.x.0) might:
  - add a new functionality, non-mandatory parameter or property
  - deprecate an old functionality
  - include non-backward compatible change to a functionality which is:
    - labelled as alpha or beta
    - completely broken and not usable
- PATCH version (0.0.x) might:
  - fix a bug
  - include backward compatible changes only

## More documentation

More documentation and code examples can be found at <https://documentation.onfido.com>.

## Support

Should you encounter any technical issues during integration, please contact Onfido's Customer Support team via the [Customer Experience Portal](https://public.support.onfido.com/) which also includes support documentation.
