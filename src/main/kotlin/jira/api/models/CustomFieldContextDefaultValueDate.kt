/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The default value for a Date custom field.
 *
 * @param date, optional, The default date in ISO format. Ignored if `useCurrent` is true.
 * @param type, required
 * @param useCurrent, optional, Whether to use the current date.
 */
@Serializable
data class CustomFieldContextDefaultValueDate(
    @SerialName("date") val date: String? = null,
    @SerialName("type") val type: String,
    @SerialName("useCurrent") val useCurrent: Boolean = false
)