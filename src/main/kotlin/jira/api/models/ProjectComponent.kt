/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * Details about a project component.
 *
 * @param ari, optional, Compass component's ID. Can't be updated. Not required for creating a Project Component.
 * @param assignee, optional, The details of the user associated with `assigneeType`, if any. See `realAssignee` for details of the user assigned to issues created with this component.
 * @param assigneeType, optional, The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Can take the following values:

 *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.
 *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.
 *  `UNASSIGNED` an assignee is not set for issues created with this component.
 *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.

Default value: `PROJECT_DEFAULT`.
Optional when creating or updating a component.
 * @param description, optional, The description for the component. Optional when creating or updating a component.
 * @param id, optional, The unique identifier for the component.
 * @param isAssigneeTypeValid, optional, Whether a user is associated with `assigneeType`. For example, if the `assigneeType` is set to `COMPONENT_LEAD` but the component lead is not set, then `false` is returned.
 * @param lead, optional, The user details for the component's lead user.
 * @param leadAccountId, optional, The accountId of the component's lead user. The accountId uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
 * @param leadUserName, optional, This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
 * @param metadata, optional, Compass component's metadata. Can't be updated. Not required for creating a Project Component.
 * @param name, optional, The unique name for the component in the project. Required when creating a component. Optional when updating a component. The maximum length is 255 characters.
 * @param project, optional, The key of the project the component is assigned to. Required when creating a component. Can't be updated.
 * @param projectId, optional, The ID of the project the component is assigned to.
 * @param realAssignee, optional, The user assigned to issues created with this component, when `assigneeType` does not identify a valid assignee.
 * @param realAssigneeType, optional, The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the `assigneeType`. For example, `assigneeType` is set to `COMPONENT_LEAD` but no component lead is set. This property is set to one of the following values:

 *  `PROJECT_LEAD` when `assigneeType` is `PROJECT_LEAD` and the project lead has permission to be assigned issues in the project that the component is in.
 *  `COMPONENT_LEAD` when `assignee`Type is `COMPONENT_LEAD` and the component lead has permission to be assigned issues in the project that the component is in.
 *  `UNASSIGNED` when `assigneeType` is `UNASSIGNED` and Jira is configured to allow unassigned issues.
 *  `PROJECT_DEFAULT` when none of the preceding cases are true.
 * @param self, optional, The URL of the component.
 */
@Serializable
data class ProjectComponent(
    @SerialName("ari") val ari: String? = null,
    @SerialName("assignee") val assignee: assignee? = null,
    @SerialName("assigneeType") val assigneeType: String? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("id") val id: String? = null,
    @SerialName("isAssigneeTypeValid") val isAssigneeTypeValid: Boolean? = null,
    @SerialName("lead") val lead: lead? = null,
    @SerialName("leadAccountId") val leadAccountId: String? = null,
    @SerialName("leadUserName") val leadUserName: String? = null,
    @SerialName("metadata") val metadata: metadata? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("project") val project: String? = null,
    @SerialName("projectId") val projectId: Long? = null,
    @SerialName("realAssignee") val realAssignee: realAssignee? = null,
    @SerialName("realAssigneeType") val realAssigneeType: String? = null,
    @SerialName("self") val self: String? = null
)