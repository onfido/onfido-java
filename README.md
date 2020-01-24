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

## Resources

All resources share the same interface when making API calls. Use `.create` to create a resource, `.find` to find one, and `.list` to fetch all resources.

#### Applicants

Applicants are the object upon which Onfido checks are performed.

```java
onfido.applicant.create(<REQUEST_BODY_HERE>)                         # => Creates an applicant
onfido.applicant.update(<APPLICANT_ID_HERE>, <REQUEST_BODY_HERE>)    # => Updates an applicant
onfido.applicant.destroy(<APPLICANT_ID_HERE>)                        # => Schedule an applicant for deletion
onfido.applicant.restore(<APPLICANT_ID_HERE>)                        # => Restore an applicant scheduled for deletion
onfido.applicant.find(<APPLICANT_ID_HERE>)                           # => Finds a single applicant
onfido.applicant.list()                                              # => Returns all applicants
```

**Note:** Calling `onfido.applicant.destroy()` adds the applicant and all associated documents, photos, videos, checks, and reports to the deletion queue. They will be deleted 20 days after the request is made. An applicant that is scheduled for deletion can be restored but applicants that have been permanently deleted cannot.
See https://documentation.onfido.com/#delete-applicant for more information.

#### Documents

Documents provide supporting evidence for Onfido checks.

```java
onfido.document.upload(<INPUT_STREAM_FROM_FILE_HERE>, <FILE_NAME_HERE>, <REQUEST_BODY_HERE>) # => Creates a document
onfido.document.find(<DOCUMENT_ID_HERE>)                                                     # => Finds a document
onfido.document.download(<DOCUMENT_ID_HERE>)                                                 # => Downloads a document as a binary data
onfido.document.list(<APPLICANT_ID_HERE>)                                                    # => Returns all applicant's documents
```

#### Live photos

Live photos, like documents, can provide supporting evidence for Onfido checks.

```java
onfido.live_photo.upload(<INPUT_STREAM_FROM_FILE_HERE>, <FILE_NAME_HERE>, <REQUEST_BODY_HERE>) # => Creates a live photo
onfido.live_photo.find(<LIVE_PHOTO_ID_HERE>)                                                   # => Finds a live photo
onfido.live_photo.download(<LIVE_PHOTO_ID_HERE>)                                               # => Downloads a live photo as binary data
onfido.live_photo.list(<APPLICANT_ID_HERE>)                                                    # => Returns all applicant's live photos
```

#### Checks

Checks are performed on an applicant. A check consists of one or more reports.

```java
onfido.check.create(<APPLICANT_ID_HERE>, <STRING_ARRAY_OF_REPORT_NAMES_HERE>) 
onfido.check.find(<CHECK_ID_HERE>)
onfido.check.resume(<CHECK_ID_HERE>)
onfido.check.list(<APPLICANT_ID_HERE>)
```

#### Reports

Reports provide details of the results of some part of a "check". They are
created when a check is created, so the Onfido API only provides support for
finding and listing them. For paused reports specifically, additional support for resuming and
 cancelling reports is also available.

```java
onfido.report.find(<REPORT_ID_HERE>)
onfido.report.list(<CHECK_ID_HERE>)
onfido.report.resume(<REPORT_ID_HERE>)
onfido.report.cancel(<REPORT_ID_HERE>)
```

#### Address Lookups

Onfido provides an address lookup service, to help ensure well-formatted
addresses are provided when creating "applicants". To search for addresses
by postcode, use:

```java
onfido.address.pick(<POSTCODE_HERE>)
```

#### SDK Tokens

Onfido allows you to generate JSON Web Tokens via the API in order to authenticate
with Onfido"s [Web SDK](https://github.com/onfido/onfido-sdk-ui).

```java
onfido.sdk_token.create(<APPLICANT_ID_HERE>, <REFFERER_HERE>)
```

## Webhooks

When you first register a webhook using `onfido.webhook.create(<REQUEST_BODY_HERE>)`, the returned `Webhook.java` object has a `.token` field containing the webhook's token.

Events sent to your application will have an X-SHA2-Signature header in the request, containing the HMAC. This provided signature [should](https://onfido.com/documentation#webhook-security) be compared to one you generate yourself with the token to check that a webhook is a genuine request from Onfido. This check can be performed by the `WebhookEventVerifier.java` class.

```java
WebhookEventVerifier verifier = new WebhookEventVerifier(<WEBHOOK_TOKEN_HERE>);
verifier.readPayload(<RAW_JSON_RESPONSE_BODY_HERE>, <X_SIGNATURE_HEADER_HERE>)
```

## Contributing

1. Fork it ( https://github.com/onfido/onfido/fork )
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Commit your changes (`git commit -am 'Add some feature'`)
4. Push to the branch (`git push origin my-new-feature`)
5. Create a new Pull Request


## More Documentation

More documentation and code examples can be found at <https://documentation.onfido.com>

