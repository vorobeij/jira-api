/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * The details of a transition status.
 *
 * @param id, required, The ID of the status.
 * @param properties, optional, The properties of the status.
 */
@Serializable
data class CreateWorkflowStatusDetails(
    @SerialName("id") val id: String,
    @SerialName("properties") val properties: properties? = null
)