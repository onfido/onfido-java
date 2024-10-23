# Migration Guide

## Upgrading from 4.x to 5.x

### Core Resources

- Applicants
  - Replace broken `ConsentsBuilder` object with a list of `ApplicantConsentBuilder` ones
- Workflow Runs
  - Rename `WorkflowRunSharedLink` object into `WorkflowRunLink`
  - Merge and rename `WorkflowRun.StatusEnum` and `WorkflowRunResponse.StatusEnum` enum into `WorkflowRunStatus` enum for storing status information
  - Rename `WorkflowRunResponseError` object into `WorkflowRunError`
- Documents
  - Reuse already existent `DocumentTypes` enum when uploading documents

### Other Endpoints

- Webhooks
  - Define `WebhookEventObjectStatus` enum to collect webhook event object's status
  - Define `WebhookEventResourceType` enum to collect webhhok event resource's type
  - Define `WebhookEventPayloadResource` object to store webhook payload's contents
- Checks
  - Rename `Check.StatusEnum` enum into `CheckStatus` for accessing checks status
- Reports
  - Remove deprecated properties from `DeviceIntelligenceBreakdownPropertiesDevice` object: `trueOs`, `osAnomaly`, `rooted` and `remoteSoftware`
  - Remove deprecated properties from `DeviceIntelligenceBreakdownPropertiesIp` object: `vpnDetection`, `proxyDetection` and `type`
  - Deprecate `records` object from `WatchlistStandardProperties` and `WatchlistAmlProperties` objects (includes `WatchlistPepsOnly` and `WatchlistSanctionsOnly` ones)

### OpenAPI generator

- Version upgraded from 7.6.0 to 7.9.0
  - Some dependencies were update, notabily `jakarta.*` replaced `javax.*` ones
  - Use `ISO8601Utils` library instead of `sdf` for date and time parsing
