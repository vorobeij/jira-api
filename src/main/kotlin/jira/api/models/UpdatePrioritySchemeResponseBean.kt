/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of the updated priority scheme.
 *
 * @param prioritySchemeWithPaginatedPrioritiesAndProjects, optional, A priority scheme with paginated priorities and projects.
 * @param task, optional, The in-progress issue migration task.
 */
@Serializable
data class UpdatePrioritySchemeResponseBean(
    @SerialName("prioritySchemeWithPaginatedPrioritiesAndProjects") val prioritySchemeWithPaginatedPrioritiesAndProjects: PrioritySchemeWithPaginatedPrioritiesAndProjects? = null,
    @SerialName("task") val task: TaskProgressBeanJsonNode? = null
)