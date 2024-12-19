/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The details of a transition screen.
 *
 * @param id, required, The ID of the screen.
 * @param name, optional, The name of the screen.
 */
@Serializable
data class TransitionScreenDetails(
    @SerialName("id") val id: String,
    @SerialName("name") val name: String? = null
)