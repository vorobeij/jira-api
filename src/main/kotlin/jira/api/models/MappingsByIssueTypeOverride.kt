/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Overrides, for the selected issue types, any status mappings provided in `statusMappingsByWorkflows`. Status mappings are required when the new workflow for an issue type doesn't contain all statuses that the old workflow has. Status mappings can be provided by a combination of `statusMappingsByWorkflows` and `statusMappingsByIssueTypeOverride`.
 *
 * @param issueTypeId, required, The ID of the issue type for this mapping.
 * @param statusMappings, required, The list of status mappings.
 */
@Serializable
data class MappingsByIssueTypeOverride(
    @SerialName("issueTypeId") val issueTypeId: String,
    @SerialName("statusMappings") val statusMappings: List<WorkflowAssociationStatusMapping>
)