/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details about the server Jira is running on.
 *
 * @param id, optional, The ID of the transition property.
 * @param key, optional, The key of the transition property. Also known as the name of the transition property.
 * @param value, required, The value of the transition property.
 */
@Serializable
data class WorkflowTransitionProperty(
    @SerialName("id") val id: String? = null,
    @SerialName("key") val key: String? = null,
    @SerialName("value") val value: String
)