/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param fieldId, required
 * @param jiraVersionField, optional
 */
@Serializable
data class JiraSingleVersionPickerField(
    @SerialName("fieldId") val fieldId: String,
    @SerialName("jiraVersionField") val jiraVersionField: JiraVersionField? = null
)