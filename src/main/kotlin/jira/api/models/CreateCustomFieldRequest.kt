/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param customFieldId, required, The custom field ID.
 * @param filter, optional, Allows filtering issues based on their values for the custom field.
 */
@Serializable
data class CreateCustomFieldRequest(
    @SerialName("customFieldId") val customFieldId: Long,
    @SerialName("filter") val filter: Boolean? = null
)