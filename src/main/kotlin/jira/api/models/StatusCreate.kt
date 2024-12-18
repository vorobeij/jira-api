/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of the status being created.
 *
 * @param description, optional, The description of the status.
 * @param name, required, The name of the status.
 * @param statusCategory, required, The category of the status.
 */
@Serializable
data class StatusCreate(
    @SerialName("description") val description: String? = null,
    @SerialName("name") val name: String,
    @SerialName("statusCategory") val statusCategory: String
)