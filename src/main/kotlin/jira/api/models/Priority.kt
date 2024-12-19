/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An issue priority.
 *
 * @param avatarId, optional, The avatarId of the avatar for the issue priority. This parameter is nullable and when set, this avatar references the universal avatar APIs.
 * @param description, optional, The description of the issue priority.
 * @param iconUrl, optional, The URL of the icon for the issue priority.
 * @param id, optional, The ID of the issue priority.
 * @param isDefault, optional, Whether this priority is the default.
 * @param name, optional, The name of the issue priority.
 * @param schemes, optional, Priority schemes associated with the issue priority.
 * @param self, optional, The URL of the issue priority.
 * @param statusColor, optional, The color used to indicate the issue priority.
 */
@Serializable
data class Priority(
    @SerialName("avatarId") val avatarId: Long? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("iconUrl") val iconUrl: String? = null,
    @SerialName("id") val id: String? = null,
    @SerialName("isDefault") val isDefault: Boolean? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("schemes") val schemes: ExpandPrioritySchemePage? = null,
    @SerialName("self") val self: String? = null,
    @SerialName("statusColor") val statusColor: String? = null
)