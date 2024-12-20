/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * Details about a workflow scheme.
 *
 * @param defaultWorkflow, optional, The name of the default workflow for the workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira. If `defaultWorkflow` is not specified when creating a workflow scheme, it is set to *Jira Workflow (jira)*.
 * @param description, optional, The description of the workflow scheme.
 * @param draft, optional, Whether the workflow scheme is a draft or not.
 * @param id, optional, The ID of the workflow scheme.
 * @param issueTypeMappings, optional, The issue type to workflow mappings, where each mapping is an issue type ID and workflow name pair. Note that an issue type can only be mapped to one workflow in a workflow scheme.
 * @param issueTypes, optional, The issue types available in Jira.
 * @param lastModified, optional, The date-time that the draft workflow scheme was last modified. A modification is a change to the issue type-project mappings only. This property does not apply to non-draft workflows.
 * @param lastModifiedUser, optional, The user that last modified the draft workflow scheme. A modification is a change to the issue type-project mappings only. This property does not apply to non-draft workflows.
 * @param name, optional, The name of the workflow scheme. The name must be unique. The maximum length is 255 characters. Required when creating a workflow scheme.
 * @param originalDefaultWorkflow, optional, For draft workflow schemes, this property is the name of the default workflow for the original workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira.
 * @param originalIssueTypeMappings, optional, For draft workflow schemes, this property is the issue type to workflow mappings for the original workflow scheme, where each mapping is an issue type ID and workflow name pair. Note that an issue type can only be mapped to one workflow in a workflow scheme.
 * @param self, optional
 * @param updateDraftIfNeeded, optional, Whether to create or update a draft workflow scheme when updating an active workflow scheme. An active workflow scheme is a workflow scheme that is used by at least one project. The following examples show how this property works:

 *  Update an active workflow scheme with `updateDraftIfNeeded` set to `true`: If a draft workflow scheme exists, it is updated. Otherwise, a draft workflow scheme is created.
 *  Update an active workflow scheme with `updateDraftIfNeeded` set to `false`: An error is returned, as active workflow schemes cannot be updated.
 *  Update an inactive workflow scheme with `updateDraftIfNeeded` set to `true`: The workflow scheme is updated, as inactive workflow schemes do not require drafts to update.

Defaults to `false`.
 */
@Serializable
data class WorkflowScheme(
    @SerialName("defaultWorkflow") val defaultWorkflow: String? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("draft") val draft: Boolean? = null,
    @SerialName("id") val id: Long? = null,
    @SerialName("issueTypeMappings") val issueTypeMappings: issueTypeMappings? = null,
    @SerialName("issueTypes") val issueTypes: issueTypes? = null,
    @SerialName("lastModified") val lastModified: String? = null,
    @SerialName("lastModifiedUser") val lastModifiedUser: User? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("originalDefaultWorkflow") val originalDefaultWorkflow: String? = null,
    @SerialName("originalIssueTypeMappings") val originalIssueTypeMappings: originalIssueTypeMappings? = null,
    @SerialName("self") val self: String? = null,
    @SerialName("updateDraftIfNeeded") val updateDraftIfNeeded: Boolean? = null
)