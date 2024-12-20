/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param dateCustomFieldId, optional, A date custom field ID. This is required if the type is "DateCustomField".
 * @param type, required, The date field type. This must be "DueDate", "TargetStartDate", "TargetEndDate" or "DateCustomField".
 */
@Serializable
data class CreateDateFieldRequest(
    @SerialName("dateCustomFieldId") val dateCustomFieldId: Long? = null,
    @SerialName("type") val type: String
)