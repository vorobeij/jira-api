/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 *
 * @param global, optional, Defines the behavior of the option within the global context. If this property is set, even if set to an empty object, then the option is available in all projects.
 * @param projects, optional, DEPRECATED
 * @param projects2, optional, Defines the projects in which the option is available and the behavior of the option within each project. Specify one object per project. The behavior of the option in a project context overrides the behavior in the global context.
 */
@Serializable
data class IssueFieldOptionScopeBean(
    @SerialName("global") val global: global? = null,
    @SerialName("projects") val projects: List<Long>? = null,
    @SerialName("projects2") val projects2: List<ProjectScopeBean>? = null
)