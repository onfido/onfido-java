# Work In Progress - Onfido Java Library

The official Java library for integrating with the Onfido API.

Documentation can be found at <https://documentation.onfido.com>

This library is only for use on the backend, as it uses Onfido API tokens which must be kept secret. If you do need to collect applicant data in the frontend of your application, we recommend that you use one of [the Onfido SDKs](https://developers.onfido.com/sdks/).

## Installation

_Coming soon_

## Getting Started

Import the `Onfido` object, this is the main object used for interfacing with the API:

```java
import com.onfido.Onfido;
```

Instantiate and configure an `Onfido` instance with your API token, and region if necessary:

```java
Onfido onfido = Onfido.builder()
                .apiToken(<YOUR_API_TOKEN_HERE>)
                .regionUS() // Defaults to EU region, add this to switch to US
                .build();
```

## Making a call to the API

Using your configured and instantiated instance of the `Onfido` object you can make calls to the API by calling one of the methods on the resources inside of it. For example:

```java
onfido.applicant.create(<REQUEST_BODY_HERE>);
```

All request bodies can be created using a builder pattern on the `Request` subclass of the desired resource. For example in the request above an `Applicant.Request` object is needed as the body, this would look something like:

```java
Applicant.request().firstName("First").lastName("Last");
```

The above will return an Applicant.Request object that can be provided to the `create()` method as the request body, so a full call to to the API will look something like:

```java
Applicant newApplicant = onfido.applicant.create(
    Applicant.request().firstName("First").lastName("Last")
);
```

The above method will return the corresponding resource object, as most methods will. In this particular case an `Applicant` object will return with all information present for the newly created applicant. To access the information call the getter of the desired property on the object, for example:

```java
newApplicant.getFirstName();
```

## Resources

All resources share the same interface when making API calls. Use `.create` to create a resource, `.find` to find one, and `.list` to fetch all resources.

#### Applicants

Applicants are the object upon which Onfido checks are performed.

```java
onfido.applicant.create(requestBody)                    # => Creates an applicant
onfido.applicant.update("applicant_id", requestBody)    # => Updates an applicant
onfido.applicant.destroy("applicant_id")                # => Schedule an applicant for deletion
onfido.applicant.restore("applicant_id")                # => Restore an applicant scheduled for deletion
onfido.applicant.find("applicant_id")                   # => Finds a single applicant
onfido.applicant.list()                                 # => Returns all applicants
```

**Note:** Calling `onfido.applicant.destroy()` adds the applicant and all associated documents, photos, videos, checks, and reports to the deletion queue. They will be deleted 20 days after the request is made. An applicant that is scheduled for deletion can be restored but applicants that have been permanently deleted cannot.
See https://documentation.onfido.com/#delete-applicant for more information.

#### Documents

Documents provide supporting evidence for Onfido checks.

```java
onfido.document.upload(inputStream, "fileName", requestBody) # => Creates a document
onfido.document.find("document_id")                          # => Finds a document
onfido.document.download("document_id")                      # => Downloads a document as a binary data
onfido.document.list("applicant_id")                         # => Returns all applicant's documents
```

**Note:** The first parameter in the upload method should be an `InputStream` created from the desired file to upload.
 
**Note:** The download method returns the file in the form of a `InputStream`.

#### Live Photos

Live Photos, like documents, can provide supporting evidence for Onfido checks.

```java
onfido.live_photo.upload(inputStream, "fileName", requestBody) # => Creates a live photo
onfido.live_photo.find("live_photo_id")                        # => Finds a live photo
onfido.live_photo.download("live_photo_id")                    # => Downloads a live photo as binary data
onfido.live_photo.list("applicant_id")                         # => Returns all applicant's live photos
```

**Note:** The first parameter in the upload method should be an `InputStream` created from the desired file to upload.
 
**Note:** The download method returns the file in the form of a `InputStream`.

#### Checks

Checks are requests for Onfido to check an applicant, by commissioning one or
more "reports" on them.

```java
onfido.check.create("applicant_id", reportNamesArray) 
onfido.check.find("check_id")
onfido.check.resume("check_id")
onfido.check.list("applicant_id")
```

#### Reports

Reports provide details of the results of some part of a "check". They are
created when a check is created, so the Onfido API only provides support for
finding and listing them. For paused reports specifically, additional support for resuming and
 cancelling reports is also available.

```java
onfido.report.find("report_id")
onfido.report.list("check_id")
onfido.report.resume("report_id")
onfido.report.cancel("report_id")
```

#### Address Lookups

Onfido provides an address lookup service, to help ensure well-formatted
addresses are provided when creating "applicants". To search for addresses
by postcode, use:

```java
onfido.address.pick("SE1 4NG")
```

#### Webhook Endpoints

Onfido allows you to set up and view your webhook endpoints via the API, as well
as through the dashboard.

```java
onfido.webhook.create(requestBody)        # => Creates a webhook endpoint
onfido.webhook.find("webhook_id")         # => Finds a single webhook endpoint
onfido.webhook.list()                     # => Returns all webhook endpoints
```

#### SDK Tokens

Onfido allows you to generate JSON Web Tokens via the API in order to authenticate
with Onfido"s [JavaScript SDK](https://github.com/onfido/onfido-sdk-ui).

```java
onfido.sdk_token.create(applicant_id: "applicant_id", referrer: "referrer")
```

## Webhooks

Each webhook endpoint has a secret token, generated automatically and [exposed](https://onfido.com/documentation#register-webhook) in the API. When sending a request, Onfido includes a signature computed using the request body and this token in the `X-Signature` header.

This provided signature [should](https://onfido.com/documentation#webhook-security) be compared to one you generate yourself with the token to check that a webhook is a genuine request from Onfido. This check can be performed by the `WebhookEventVerifier` class.

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

