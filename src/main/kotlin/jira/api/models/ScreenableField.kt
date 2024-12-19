/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A screen tab field.
 *
 * @param id, optional, The ID of the screen tab field.
 * @param name, optional, The name of the screen tab field. Required on create and update. The maximum length is 255 characters.
 */
@Serializable
data class ScreenableField(
    @SerialName("id") val id: String? = null,
    @SerialName("name") val name: String? = null
)