/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param statuses, optional, List of updated statuses.
 * @param taskId, optional, If there is a [asynchronous task](#async-operations) operation, as a result of this update.
 * @param workflows, optional, List of updated workflows.
 */
@Serializable
data class WorkflowUpdateResponse(
    @SerialName("statuses") val statuses: List<JiraWorkflowStatus>? = null,
    @SerialName("taskId") val taskId: String? = null,
    @SerialName("workflows") val workflows: List<JiraWorkflow>? = null
)