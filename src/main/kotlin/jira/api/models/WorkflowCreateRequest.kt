/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The create workflows payload.
 *
 * @param workflowScope, optional, The scope of the workflow.
 * @param statuses, required, The statuses to associate with the workflows.
 * @param workflows, required, The details of the workflows to create.
 */
@Serializable
data class WorkflowCreateRequest(
    @SerialName("workflowScope") val workflowScope: WorkflowScope? = null,
    @SerialName("statuses") val statuses: List<WorkflowStatusUpdate>,
    @SerialName("workflows") val workflows: List<WorkflowCreate>
)