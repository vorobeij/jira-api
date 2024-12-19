/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Project ID details.
 *
 * @param id, required, The ID of the project.
 */
@Serializable
data class ProjectId(
    @SerialName("id") val id: String
)