/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details about data policies for a list of projects.
 *
 * @param projectDataPolicies, optional, List of projects with data policies.
 */
@Serializable
data class ProjectDataPolicies(
    @SerialName("projectDataPolicies") val projectDataPolicies: List<ProjectWithDataPolicy>? = null
)