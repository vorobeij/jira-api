/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * The default value for a Forge object custom field.
 *
 * @param object, optional, The default JSON object.
 * @param type, required
 */
@Serializable
data class CustomFieldContextDefaultValueForgeObjectField(
    @SerialName("object") val object: object? = null,
@SerialName("type")
val type: String
)