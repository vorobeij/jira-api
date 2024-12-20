/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of a screen scheme.
 *
 * @param description, optional, The description of the screen scheme. The maximum length is 255 characters.
 * @param name, required, The name of the screen scheme. The name must be unique. The maximum length is 255 characters.
 * @param screens, required, The IDs of the screens for the screen types of the screen scheme. Only screens used in classic projects are accepted.
 */
@Serializable
data class ScreenSchemeDetails(
    @SerialName("description") val description: String? = null,
    @SerialName("name") val name: String,
    @SerialName("screens") val screens: ScreenTypes
)