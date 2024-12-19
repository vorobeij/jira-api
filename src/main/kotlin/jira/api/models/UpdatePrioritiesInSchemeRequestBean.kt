/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * Update priorities in a scheme
 *
 * @param add, optional, Priorities to add to a scheme
 * @param remove, optional, Priorities to remove from a scheme
 */
@Serializable
data class UpdatePrioritiesInSchemeRequestBean(
    @SerialName("add") val add: add? = null,
    @SerialName("remove") val remove: remove? = null
)