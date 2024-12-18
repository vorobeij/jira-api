/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A list of issues suggested for use in auto-completion.
 *
 * @param sections, optional, A list of issues for an issue type suggested for use in auto-completion.
 */
@Serializable
data class IssuePickerSuggestions(
    @SerialName("sections") val sections: List<IssuePickerSuggestionsIssueType>? = null
)