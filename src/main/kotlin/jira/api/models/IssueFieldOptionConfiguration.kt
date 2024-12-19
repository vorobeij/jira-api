/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of the projects the option is available in.
 *
 * @param attributes, optional, DEPRECATED
 * @param scope, optional, Defines the projects that the option is available in. If the scope is not defined, then the option is available in all projects.
 */
@Serializable
data class IssueFieldOptionConfiguration(
    @SerialName("attributes") val attributes: List<String>? = null,
    @SerialName("scope") val scope: IssueFieldOptionScopeBean? = null
)