# Work In Progress - Onfido Java Library

The official Java library for integrating with the Onfido API.

:warning: Under Construction :warning:

Documentation can be found at <https://documentation.onfido.com>

## Installation

_Coming soon_

## Getting Started

Import the `Onfido.java` object, this is the main object used for interfacing with the API:

```java
import com.onfido.Onfido;
```

Instantiate and configure an `Onfido.java` instance with your API token, and region if necessary:

```java
Onfido onfido = Onfido.builder()
                .apiToken(<YOUR_API_TOKEN_HERE>)
                .regionUS() // Defaults to EU region, add this to switch to US
                .build();
```

## Making a call to the API

Using your configured and instantiated instance of the `Onfido.java` object you can make calls to the API by calling one of the methods on the resources inside of it. For example, to create an applicant:

```java
onfido.applicant.create(<REQUEST_BODY_HERE>);
```

All request bodies can be created using a builder pattern on the `Request.java` subclass of the desired resource. For example in the request above an `Applicant.Request.java` object is needed as the body, this would look something like:

```java
Applicant.request().firstName("First").lastName("Last");
```

The above will return an `Applicant.Request.java` object that can be provided to the `create()` method as the request body, so a full call to to the API will look something like:

```java
Applicant newApplicant = onfido.applicant.create(
    Applicant.request().firstName("First").lastName("Last")
);
```

The above method will return the corresponding resource object, as most methods will. In this particular case an `Applicant.java` object will return with all information present for the newly created applicant. To access the information call the getter of the desired property on the object, for example:

```java
newApplicant.getFirstName();
```

## Contributing

1. Fork it ( https://github.com/onfido/onfido/fork )
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Commit your changes (`git commit -am 'Add some feature'`)
4. Push to the branch (`git push origin my-new-feature`)
5. Create a new Pull Request


## More Documentation

More documentation and code examples can be found at <https://documentation.onfido.com>

