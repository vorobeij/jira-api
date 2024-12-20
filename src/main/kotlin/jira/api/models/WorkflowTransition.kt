/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A workflow transition.
 *
 * @param id, required, The transition ID.
 * @param name, required, The transition name.
 */
@Serializable
data class WorkflowTransition(
    @SerialName("id") val id: Int,
    @SerialName("name") val name: String
)