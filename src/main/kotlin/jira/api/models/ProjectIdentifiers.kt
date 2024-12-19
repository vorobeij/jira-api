/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Identifiers for a project.
 *
 * @param id, required, The ID of the created project.
 * @param key, required, The key of the created project.
 * @param self, required, The URL of the created project.
 */
@Serializable
data class ProjectIdentifiers(
    @SerialName("id") val id: Long,
    @SerialName("key") val key: String,
    @SerialName("self") val self: String
)