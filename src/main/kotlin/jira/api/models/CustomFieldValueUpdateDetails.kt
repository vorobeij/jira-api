/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of updates for a custom field.
 *
 * @param updates, optional, The list of custom field update details.
 */
@Serializable
data class CustomFieldValueUpdateDetails(
    @SerialName("updates") val updates: List<CustomFieldValueUpdate>? = null
)