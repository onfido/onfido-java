# Migration Guide

This guide provides detailed instructions on how to upgrade between different
major versions of the client library.

It covers changes in core resources, other endpoints, and the OpenAPI generator,
ensuring a smooth transition between versions.

## Upgrading from 6.x to 7.x

### API Method Invocation

- All API methods now return request builder objects requiring `.execute()` call
- Optional parameters are set via fluent setter methods instead of method parameters
- This change prevents breaking changes when new optional parameters are added

Example migration:
```java
// Before (6.x)
Applicant applicant = onfido.findApplicant(applicantId);
List<WorkflowRun> runs = onfido.listWorkflowRuns(applicantId, status, page, perPage);

// After (7.x)
Applicant applicant = onfido.findApplicant(applicantId).execute();
List<WorkflowRun> runs = onfido.listWorkflowRuns()
    .applicantId(applicantId)
    .status(status)
    .page(page)
    .perPage(perPage)
    .execute();
```

Note: Some list methods return wrapper objects (e.g., `ChecksList`) with
accessor methods like `getChecks()` to retrieve the actual list.

## Upgrading from 5.x to 6.x

### Core Resources

- Workflow Runs
  - Add `applicantId` parameter to `listWorkflowRuns` method to filter workflow
    runs by applicant ID
- Documents
  - Suppress `DocumentFileTypeEnum`, allowing any string as file type

### Other Endpoints

- Webhooks
  - Drop `WORKFLOW_SIGNED_EVIDENCE_FILE_CREATED` enum value from `WebhookEventType`
    enum
  - Allow `readPayload` function for webhook event verification to also throw
    `JsonParseException` exception.
  - Make `href` property in `WebhookEventPayloadObject` optional
- Reports
  - Allow the deprecated `records` property in `WatchlistAml` and
    `WatchlistStandard` reports to be any object, and not just a string
  - Remove `documents` property (incl. `getDocuments()` accessors) from all
    reports except Document and Facial Similarity reports

### OpenAPI generator

- Version upgraded from `7.9.0` to `7.11.0`
  - All properties got annotated with `@javax.annotation.Nullable` or
    `@javax.annotation.Nonnull` depending on their OpenAPI definition

## Upgrading from 4.x to 5.x

### Core Resources

- Applicants
  - Replace `ConsentsBuilder` object with a list of `ApplicantConsentBuilder` ones
- Workflow Runs
  - Rename `WorkflowRunSharedLink` object into `WorkflowRunLink`
  - Merge and rename `WorkflowRun.StatusEnum` and `WorkflowRunResponse.StatusEnum`
    enum into `WorkflowRunStatus` enum for storing status information
  - Rename `WorkflowRunResponseError` object into `WorkflowRunError`
- Documents
  - Reuse already existent `DocumentTypes` enum when uploading documents

### Other Endpoints

- Webhooks
  - Define `WebhookEventObjectStatus` enum to collect webhook event object's status
  - Define `WebhookEventResourceType` enum to collect webhook event resource's type
  - Define `WebhookEventPayloadResource` object to store webhook payload's contents
- Checks
  - Rename `Check.StatusEnum` enum into `CheckStatus` for accessing checks status
- Reports
  - Remove deprecated properties from `DeviceIntelligenceBreakdownPropertiesDevice`
    object: `trueOs`, `osAnomaly`, `rooted` and `remoteSoftware`
  - Remove deprecated properties from `DeviceIntelligenceBreakdownPropertiesIp`
    object: `vpnDetection`, `proxyDetection` and `type`
  - Deprecate `records` object from `WatchlistStandardProperties` and
    `WatchlistAmlProperties` objects (includes `WatchlistPepsOnly` and
    `WatchlistSanctionsOnly` ones)

### OpenAPI generator

- Version upgraded from `7.6.0` to `7.9.0`
  - Some dependencies were update, notably `jakarta.*` replaced `javax.*` ones
  - Use `ISO8601Utils` library instead of `sdf` for date and time parsing
