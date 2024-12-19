/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * The statuses referenced in the workflow.
 *
 * @param approvalConfiguration, optional, The approval configuration of a status within a workflow. Applies only to Jira Service Management approvals.
 * @param deprecated, optional, Indicates if the status is deprecated.
 * @param workflowStatusLayout, optional, The x and y location of the status in the workflow.
 * @param properties, optional, The properties associated with the status.
 * @param statusReference, optional, The reference of the status.
 */
@Serializable
data class WorkflowReferenceStatus(
    @SerialName("approvalConfiguration") val approvalConfiguration: ApprovalConfiguration? = null,
    @SerialName("deprecated") val deprecated: Boolean? = null,
    @SerialName("workflowStatusLayout") val workflowStatusLayout: WorkflowStatusLayout? = null,
    @SerialName("properties") val properties: properties? = null,
    @SerialName("statusReference") val statusReference: String? = null
)