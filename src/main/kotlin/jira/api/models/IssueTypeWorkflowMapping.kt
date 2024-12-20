/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details about the mapping between an issue type and a workflow.
 *
 * @param issueType, optional, The ID of the issue type. Not required if updating the issue type-workflow mapping.
 * @param updateDraftIfNeeded, optional, Set to true to create or update the draft of a workflow scheme and update the mapping in the draft, when the workflow scheme cannot be edited. Defaults to `false`. Only applicable when updating the workflow-issue types mapping.
 * @param workflow, optional, The name of the workflow.
 */
@Serializable
data class IssueTypeWorkflowMapping(
    @SerialName("issueType") val issueType: String? = null,
    @SerialName("updateDraftIfNeeded") val updateDraftIfNeeded: Boolean? = null,
    @SerialName("workflow") val workflow: String? = null
)