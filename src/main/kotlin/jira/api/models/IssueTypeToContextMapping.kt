/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Mapping of an issue type to a context.
 *
 * @param contextId, required, The ID of the context.
 * @param isAnyIssueType, optional, Whether the context is mapped to any issue type.
 * @param issueTypeId, optional, The ID of the issue type.
 */
@Serializable
data class IssueTypeToContextMapping(
    @SerialName("contextId") val contextId: String,
    @SerialName("isAnyIssueType") val isAnyIssueType: Boolean? = null,
    @SerialName("issueTypeId") val issueTypeId: String? = null
)