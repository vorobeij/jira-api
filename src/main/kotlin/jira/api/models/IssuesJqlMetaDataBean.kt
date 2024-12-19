/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The description of the page of issues loaded by the provided JQL query.
 *
 * @param count, required, The number of issues that were loaded in this evaluation.
 * @param maxResults, required, The maximum number of issues that could be loaded in this evaluation.
 * @param startAt, required, The index of the first issue.
 * @param totalCount, required, The total number of issues the JQL returned.
 * @param validationWarnings, optional, Any warnings related to the JQL query. Present only if the validation mode was set to `warn`.
 */
@Serializable
data class IssuesJqlMetaDataBean(
    @SerialName("count") val count: Int,
    @SerialName("maxResults") val maxResults: Int,
    @SerialName("startAt") val startAt: Long,
    @SerialName("totalCount") val totalCount: Long,
    @SerialName("validationWarnings") val validationWarnings: List<String>? = null
)