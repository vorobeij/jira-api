/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The default text for a Forge collection of strings custom field.
 *
 * @param type, required
 * @param values, optional, List of string values. The maximum length for a value is 254 characters.
 */
@Serializable
data class CustomFieldContextDefaultValueForgeMultiStringField(
    @SerialName("type") val type: String,
    @SerialName("values") val values: List<String>? = null
)