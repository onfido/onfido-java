# Work In Progress - Onfido Java Library

The official Java library for integrating with the Onfido API.

:warning: Under Construction :warning:

Documentation can be found at <https://documentation.onfido.com>

## Installation

For Maven projects, add the below to your pom file:
```xml
<dependency>
      <groupId>com.onfido</groupId>
      <artifactId>onfido-api-java</artifactId>
      <version>LATEST_VERSION_HERE</version>
</dependency>
```

For Gradle projects add the below to your build.gradle file:
```xml
implementation 'com.onfido:onfido-api-java:LATEST_VERSION_HERE'
```

The latest version can be found at: https://search.maven.org/artifact/com.onfido/onfido-api-java

## Getting Started

Import the `Onfido` object, this is the main object used for interfacing with the API:

```java
import com.onfido.Onfido;

import com.onfido.exceptions.ApiException;
import com.onfido.exceptions.OnfidoException;
```

Instantiate and configure an `Onfido` instance with your API token, and region if necessary:

```java
Onfido onfido = Onfido.builder()
                .apiToken(<YOUR_API_TOKEN_HERE>)
                .regionUS() // Defaults to EU region, add this to switch to US
                .build();
```

## Making a call to the API

Using your configured and instantiated instance of the `Onfido` object you can make calls to the API by calling one of the methods on the resources inside of it. For example, to create an applicant:

```java
onfido.applicant.create(<REQUEST_BODY_HERE>);
```

All request bodies can be created using a builder pattern on the `Request` subclass of the desired resource. For example in the request above an `Applicant.Request` object is needed as the body, this would look something like:

```java
Applicant.request().firstName("First").lastName("Last");
```

The above will return an `Applicant.Request` object that can be provided to the `create()` method as the request body, so a full call to to the API will look something like:

```java
try {
    Applicant newApplicant = onfido.applicant.create(
            Applicant.request().firstName("First").lastName("Last")
    );
} catch (ApiException e) {
    // An error response was received from the Onfido API, extra info is available.
    System.out.println(e.getMessage());
    System.out.println(e.getType());
    System.out.println(e.isClientError());
} catch (OnfidoException e) {
    // No response was received for some reason e.g. a network error.
    System.out.println(e.getMessage());
}
```

The above method will return the corresponding resource object, as most methods will. In this particular case an `Applicant` object will return with all information present for the newly created applicant. To access the information call the getter of the desired property on the object, for example:

```java
newApplicant.getFirstName();
```

## Contributing

1. Fork it (<https://github.com/onfido/onfido/fork>)
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Commit your changes (`git commit -am 'Add some feature'`)
4. Push to the branch (`git push origin my-new-feature`)
5. Create a new Pull Request

## More Documentation

More documentation and code examples can be found at <https://documentation.onfido.com>
