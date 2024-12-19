/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of an issue resolution.
 *
 * @param description, optional, The description of the issue resolution.
 * @param id, optional, The ID of the issue resolution.
 * @param name, optional, The name of the issue resolution.
 * @param self, optional, The URL of the issue resolution.
 */
@Serializable
data class Resolution(
    @SerialName("description") val description: String? = null,
    @SerialName("id") val id: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("self") val self: String? = null
)