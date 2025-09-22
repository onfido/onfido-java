# Changelog

## v6.5.0 22nd September 2025

- Release based on Onfido OpenAPI spec version [v5.5.0](https://github.com/onfido/onfido-openapi-spec/releases/tag/v5.5.0):
  - [SIG-3128] Add ssn breakdowns to IDR enhanced report
  - Persist python and urllib3 version update to solve onfido-python vulnerability

## v6.4.0 28th July 2025

- Release based on Onfido OpenAPI spec version [v5.4.0](https://github.com/onfido/onfido-openapi-spec/releases/tag/v5.4.0):
  - [ENT-26] Add AES document download endpoint
- [ENT-26] Add AES documents test

## v6.2.0 6th June 2025

- Release based on Onfido OpenAPI spec version [v5.2.0](https://github.com/onfido/onfido-openapi-spec/releases/tag/v5.2.0):
  - [BIO-7260] Add report configuration (including use_case) to checks
  - Persist nexus-staging-maven-plugin update

## v6.1.0 14th May 2025

- Release based on Onfido OpenAPI spec version [v5.1.0](https://github.com/onfido/onfido-openapi-spec/releases/tag/v5.1.0):
  - CAT-1760: create get applicant consents endpoint
  - [CAT-1911] Fix document_with_driving_licence_information to be a list of objects
  - [AF-1390] Fix: Device Intelligence Report Schema
  - [CAT-1944] Add OAuth fields for Webhook authentication
  - Fix storage of device_fingerprint_reuse breakdown and properties as float
  - Add .markdownlint.json to templates

## v6.0.0 21st February 2025

- Release based on Onfido OpenAPI spec version [v5.0.0](https://github.com/onfido/onfido-openapi-spec/releases/tag/v5.0.0):
  - Denote webhook event payload.object.href as a not required property
  - Show additional information on JSON decoding issue
  - [CAT-1593] Drop invalid enum value from webhook event type
  - Add applicant_id in GET /workflow_runs
  - [CAT-1694] Define document file type as free text
  - [DOCCAP-2513] Add download-nfc-face endpoint
  - [CAT-1719] Don't impose a type on deprecated records property in watchlist reports
  - [CAT-1728] Don't catch JSON decoding error on webhook event verification
  - Remove documents property for reports where it's not applicable
  - Update openapi generator version to v7.10.0 (was v7.9.0)
  - Update openapi generator version to v7.11.0 (was v7.10.0)
- Add tests for Download NFC Face endpoint
- Update Sonatype Staging Maven plugin version to allow delivery
- [Migration Guide](MIGRATION.md#upgrading-from-5x-to-6x)

## v5.6.0 28th January 2025

- Release based on Onfido OpenAPI spec version [v4.6.0](https://github.com/onfido/onfido-openapi-spec/releases/tag/v4.6.0):
  - [STUDIO-4308] Add driving_license to id_number enum
  - [CAT-1634] Add proxy configuration support to Java client library
  - Update README files (including templated ones)
  - Add customer_user_id in the webhook event resource
- test: wait for evidence folder to be available

## v5.5.0 8th January 2025

- Release based on Onfido OpenAPI spec version [v4.5.0](https://github.com/onfido/onfido-openapi-spec/releases/tag/v4.5.0):
  - [STUDIO-4305] Add download evidence folder path

## v5.4.0 20th December 2024

- Release based on Onfido OpenAPI spec version [v4.4.0](https://github.com/onfido/onfido-openapi-spec/releases/tag/v4.4.0):
  - [CAT-1593] Fix missing webhook type and evidence folder webhook
  - [CAT-1590] Allow any type for the workflow task output

## v5.3.0 27th November 2024

- Release based on Onfido OpenAPI spec version [v4.3.0](https://github.com/onfido/onfido-openapi-spec/releases/tag/v4.3.0):
  - [CAT-1581] Revert "[CAT-1528] Fix barcode field in document properties object"

## v5.2.0 19th November 2024

- Release based on Onfido OpenAPI spec version [v4.2.0](https://github.com/onfido/onfido-openapi-spec/releases/tag/v4.2.0):
  - feat: add new fields to facial similarity report objects
  - [CAT-1552] Add missing document types

## v5.1.0 8th November 2024

- Release based on Onfido OpenAPI spec version [v4.1.0](https://github.com/onfido/onfido-openapi-spec/releases/tag/v4.1.0):
  - [CAT-1528] Fix barcode field in document properties object

## v5.0.0 23rd October 2024

- Release based on Onfido OpenAPI spec version [v4.0.0](https://github.com/onfido/onfido-openapi-spec/releases/tag/v4.0.0):
  - [CAT-1379] Add a few missing properties and make toJson working with unknown fields
  - [CAT-1447] Fix applicant consents
  - [CAT-1379] Fix check creation, remove some deprecated properties and deprecate others
  - Use document-type enum for document upload
  - [CAT-1306] Add webhooks event resource
  - Upgrade OpenAPI generator to v7.9.0 (was v7.6.0)
  - [Migration Guide](MIGRATION.md#upgrading-from-4x-to-5x)

## v4.3.0 20th September 2024

- Release based on Onfido OpenAPI spec version [v3.5.0](https://github.com/onfido/onfido-openapi-spec/releases/tag/v3.5.0):
  - [CAT-1376] Add record item object definition for watchlist enhanced properties field

## v4.2.0 6th September 2024

- Release based on Onfido OpenAPI spec version [v3.4.0](https://github.com/onfido/onfido-openapi-spec/releases/tag/v3.4.0):
  - SDK Token: Remove UUID format from application_id

## v4.1.0 24th July 2024

- Release based on Onfido OpenAPI spec version [v3.3.0](https://github.com/onfido/onfido-openapi-spec/releases/tag/v3.3.0):
  - Expose `customer_user_id` in `workflow_runs`
  - adding sdk_token to workflow run schema

## v4.0.0 17th July 2024

- Release based on Onfido OpenAPI spec version [v3.2.0](https://github.com/onfido/onfido-openapi-spec/releases/tag/v3.2.0):
  - [CAT-1289] Document report's properties: Add middle name
  - chore(qes): add documents endpoint
  - [CAT-1297] Webhook Event: remove uuid format from object.id
  - fix(qes): fix download document http method
  - Add started_at_iso8601 field in webhook event
  - add jpeg file type for documents

## v3.3.0 2nd July 2024

- Release based on Onfido OpenAPI spec version [v3.1.0](https://github.com/onfido/onfido-openapi-spec/releases/tag/v3.1.0):
  - Add missing fields in document report's properties

## v3.2.0 24th June 2024

- Library has been rebuilt from scratch and automatically generated on [Onfido OpenAPI Spec](https://github.com/onfido/onfido-openapi-spec) (release [v3.0.0](https://github.com/onfido/onfido-openapi-spec/releases/tag/v3.0.0))
- Integration tests have been refreshed and API coverage increased

## v3.1.0 13th May 2024 (pre-release)

- Include `nexus-staging-maven-plugin` only when necessary

## v3.0.0 10th May 2024 (pre-release)

- Make library auto-generated and based on [Onfido OpenAPI spec](https://github.com/onfido/onfido-openapi-spec)
