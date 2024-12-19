/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param attributes, optional, Defines the behavior of the option in the project.If notSelectable is set, the option cannot be set as the field's value. This is useful for archiving an option that has previously been selected but shouldn't be used anymore.If defaultValue is set, the option is selected by default.
 * @param id, optional, The ID of the project that the option's behavior applies to.
 */
@Serializable
data class ProjectScopeBean(
    @SerialName("attributes") val attributes: List<String>? = null,
    @SerialName("id") val id: Long? = null
)