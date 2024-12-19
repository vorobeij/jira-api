/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of the group associated with the role.
 *
 * @param displayName, optional, The display name of the group.
 * @param groupId, optional, The ID of the group.
 * @param name, optional, The name of the group. As a group's name can change, use of `groupId` is recommended to identify the group.
 */
@Serializable
data class ProjectRoleGroup(
    @SerialName("displayName") val displayName: String? = null,
    @SerialName("groupId") val groupId: String? = null,
    @SerialName("name") val name: String? = null
)