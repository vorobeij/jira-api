/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details about an issue event.
 *
 * @param id, optional, The ID of the event.
 * @param name, optional, The name of the event.
 */
@Serializable
data class IssueEvent(
    @SerialName("id") val id: Long? = null,
    @SerialName("name") val name: String? = null
)