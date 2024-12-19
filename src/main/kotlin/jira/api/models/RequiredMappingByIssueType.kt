/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The list of required status mappings by issue type.
 *
 * @param issueTypeId, optional, The ID of the issue type.
 * @param statusIds, optional, The status IDs requiring mapping.
 */
@Serializable
data class RequiredMappingByIssueType(
    @SerialName("issueTypeId") val issueTypeId: String? = null,
    @SerialName("statusIds") val statusIds: List<String>? = null
)