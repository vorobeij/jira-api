/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details about a component with a count of the issues it contains.
 *
 * @param assignee, optional, The details of the user associated with `assigneeType`, if any. See `realAssignee` for details of the user assigned to issues created with this component.
 * @param assigneeType, optional, The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Takes the following values:

 *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.
 *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.
 *  `UNASSIGNED` an assignee is not set for issues created with this component.
 *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.
 * @param description, optional, The description for the component.
 * @param id, optional, The unique identifier for the component.
 * @param isAssigneeTypeValid, optional, Whether a user is associated with `assigneeType`. For example, if the `assigneeType` is set to `COMPONENT_LEAD` but the component lead is not set, then `false` is returned.
 * @param issueCount, optional, Count of issues for the component.
 * @param lead, optional, The user details for the component's lead user.
 * @param name, optional, The name for the component.
 * @param project, optional, The key of the project to which the component is assigned.
 * @param projectId, optional, Not used.
 * @param realAssignee, optional, The user assigned to issues created with this component, when `assigneeType` does not identify a valid assignee.
 * @param realAssigneeType, optional, The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the `assigneeType`. For example, `assigneeType` is set to `COMPONENT_LEAD` but no component lead is set. This property is set to one of the following values:

 *  `PROJECT_LEAD` when `assigneeType` is `PROJECT_LEAD` and the project lead has permission to be assigned issues in the project that the component is in.
 *  `COMPONENT_LEAD` when `assignee`Type is `COMPONENT_LEAD` and the component lead has permission to be assigned issues in the project that the component is in.
 *  `UNASSIGNED` when `assigneeType` is `UNASSIGNED` and Jira is configured to allow unassigned issues.
 *  `PROJECT_DEFAULT` when none of the preceding cases are true.
 * @param self, optional, The URL for this count of the issues contained in the component.
 */
@Serializable
data class ComponentWithIssueCount(
    @SerialName("assignee") val assignee: User? = null,
    @SerialName("assigneeType") val assigneeType: String? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("id") val id: String? = null,
    @SerialName("isAssigneeTypeValid") val isAssigneeTypeValid: Boolean? = null,
    @SerialName("issueCount") val issueCount: Long? = null,
    @SerialName("lead") val lead: User? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("project") val project: String? = null,
    @SerialName("projectId") val projectId: Long? = null,
    @SerialName("realAssignee") val realAssignee: User? = null,
    @SerialName("realAssigneeType") val realAssigneeType: String? = null,
    @SerialName("self") val self: String? = null
)