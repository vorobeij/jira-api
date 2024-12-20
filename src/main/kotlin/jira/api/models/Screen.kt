/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A screen.
 *
 * @param description, optional, The description of the screen.
 * @param id, optional, The ID of the screen.
 * @param name, optional, The name of the screen.
 * @param scope, optional, The scope of the screen.
 */
@Serializable
data class Screen(
    @SerialName("description") val description: String? = null,
    @SerialName("id") val id: Long? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("scope") val scope: Scope? = null
)