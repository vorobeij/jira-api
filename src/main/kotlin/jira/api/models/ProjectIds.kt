/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A list of project IDs.
 *
 * @param projectIds, required, The IDs of projects.
 */
@Serializable
data class ProjectIds(
    @SerialName("projectIds") val projectIds: List<String>
)