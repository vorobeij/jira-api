/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The description of the page of issues loaded by the provided JQL query.This bean will be replacing IssuesJqlMetaDataBean bean as part of new `evaluate` endpoint
 *
 * @param nextPageToken, required, Next Page token for the next page of issues.
 */
@Serializable
data class JExpEvaluateIssuesJqlMetaDataBean(
    @SerialName("nextPageToken") val nextPageToken: String
)