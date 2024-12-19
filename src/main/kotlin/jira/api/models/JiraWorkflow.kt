/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of a workflow.
 *
 * @param created, optional, The creation date of the workflow.
 * @param description, optional, The description of the workflow.
 * @param id, optional, The ID of the workflow.
 * @param isEditable, optional, Indicates if the workflow can be edited.
 * @param name, optional, The name of the workflow.
 * @param workflowScope, optional, The scope of the workflow.
 * @param workflowLayout, optional, The starting point for the statuses in the workflow.
 * @param statuses, optional, The statuses referenced in this workflow.
 * @param taskId, optional, If there is a current [asynchronous task](#async-operations) operation for this workflow.
 * @param transitions, optional, The transitions of the workflow. Note that a transition can have either the deprecated `to`/`from` fields or the `toStatusReference`/`links` fields, but never both nor a combination.
 * @param updated, optional, The last edited date of the workflow.
 * @param usages, optional, Use the optional `workflows.usages` expand to get additional information about the projects and issue types associated with the requested workflows.
 * @param documentVersion, optional, The current version details of this workflow scheme.
 */
@Serializable
data class JiraWorkflow(
    @SerialName("created") val created: String? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("id") val id: String? = null,
    @SerialName("isEditable") val isEditable: Boolean? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("workflowScope") val workflowScope: WorkflowScope? = null,
    @SerialName("workflowLayout") val workflowLayout: WorkflowLayout? = null,
    @SerialName("statuses") val statuses: List<WorkflowReferenceStatus>? = null,
    @SerialName("taskId") val taskId: String? = null,
    @SerialName("transitions") val transitions: List<WorkflowTransitions>? = null,
    @SerialName("updated") val updated: String? = null,
    @SerialName("usages") val usages: List<ProjectIssueTypes>? = null,
    @SerialName("documentVersion") val documentVersion: DocumentVersion? = null
)