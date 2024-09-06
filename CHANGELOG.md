# Changelog

## v4.2.0 6th September 2024

- Release based on Onfido OpenAPI spec version [v3.4.0](https://github.com/onfido/onfido-openapi-spec/releases/tag/v3.4.0):
  - SDK Token: Remove UUID format from application_id. by @tomw1994991 in https://github.com/onfido/onfido-openapi-spec/pull/116

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
