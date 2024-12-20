/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The update workflows payload.
 *
 * @param statuses, required, The statuses to associate with the workflows.
 * @param workflows, required, The details of the workflows to update.
 */
@Serializable
data class WorkflowUpdateRequest(
    @SerialName("statuses") val statuses: List<WorkflowStatusUpdate>,
    @SerialName("workflows") val workflows: List<WorkflowUpdate>
)