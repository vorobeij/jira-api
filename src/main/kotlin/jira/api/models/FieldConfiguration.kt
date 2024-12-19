/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of a field configuration.
 *
 * @param description, required, The description of the field configuration.
 * @param id, required, The ID of the field configuration.
 * @param isDefault, optional, Whether the field configuration is the default.
 * @param name, required, The name of the field configuration.
 */
@Serializable
data class FieldConfiguration(
    @SerialName("description") val description: String,
    @SerialName("id") val id: Long,
    @SerialName("isDefault") val isDefault: Boolean? = null,
    @SerialName("name") val name: String
)