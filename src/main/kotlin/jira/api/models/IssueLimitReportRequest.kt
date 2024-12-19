/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 *
 * @param issuesApproachingLimitParams, optional, A list of fields and their respective approaching limit threshold. Required for querying issues approaching limits. Optional for querying issues breaching limits. Accepted fields are: `comment`, `worklog`, `attachment`, `remoteIssueLinks`, and `issuelinks`. Example: `{"issuesApproachingLimitParams": {"comment": 4500, "attachment": 1800}}`
 */
@Serializable
data class IssueLimitReportRequest(
    @SerialName("issuesApproachingLimitParams") val issuesApproachingLimitParams: issuesApproachingLimitParams? = null
)