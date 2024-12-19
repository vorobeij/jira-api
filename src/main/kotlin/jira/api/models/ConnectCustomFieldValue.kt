/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A list of custom field details.
 *
 * @param _type, required, The type of custom field.
 * @param fieldID, required, The custom field ID.
 * @param issueID, required, The issue ID.
 * @param number, optional, The value of number type custom field when `_type` is `NumberIssueField`.
 * @param optionID, optional, The value of single select and multiselect custom field type when `_type` is `SingleSelectIssueField` or `MultiSelectIssueField`.
 * @param richText, optional, The value of richText type custom field when `_type` is `RichTextIssueField`.
 * @param string, optional, The value of string type custom field when `_type` is `StringIssueField`.
 * @param text, optional, The value of of text custom field type when `_type` is `TextIssueField`.
 */
@Serializable
data class ConnectCustomFieldValue(
    @SerialName("_type") val _type: String,
    @SerialName("fieldID") val fieldID: Int,
    @SerialName("issueID") val issueID: Int,
    @SerialName("number") val number: Float? = null,
    @SerialName("optionID") val optionID: String? = null,
    @SerialName("richText") val richText: String? = null,
    @SerialName("string") val string: String? = null,
    @SerialName("text") val text: String? = null
)