/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of the issue creation metadata for an issue type.
 *
 * @param avatarId, optional, The ID of the issue type's avatar.
 * @param description, optional, The description of the issue type.
 * @param entityId, optional, Unique ID for next-gen projects.
 * @param expand, optional, Expand options that include additional issue type metadata details in the response.
 * @param fields, optional, List of the fields available when creating an issue for the issue type.
 * @param hierarchyLevel, optional, Hierarchy level of the issue type.
 * @param iconUrl, optional, The URL of the issue type's avatar.
 * @param id, optional, The ID of the issue type.
 * @param name, optional, The name of the issue type.
 * @param scope, optional, Details of the next-gen projects the issue type is available in.
 * @param self, optional, The URL of these issue type details.
 * @param subtask, optional, Whether this issue type is used to create subtasks.
 */
@Serializable
data class IssueTypeIssueCreateMetadata(
    @SerialName("avatarId") val avatarId: Long? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("entityId") val entityId: String? = null,
    @SerialName("expand") val expand: String? = null,
    @SerialName("fields") val fields: fields? = null,
    @SerialName("hierarchyLevel") val hierarchyLevel: Int? = null,
    @SerialName("iconUrl") val iconUrl: String? = null,
    @SerialName("id") val id: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("scope") val scope: Scope? = null,
    @SerialName("self") val self: String? = null,
    @SerialName("subtask") val subtask: Boolean? = null
)