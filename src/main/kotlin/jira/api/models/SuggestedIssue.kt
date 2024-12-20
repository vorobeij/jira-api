/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An issue suggested for use in the issue picker auto-completion.
 *
 * @param id, optional, The ID of the issue.
 * @param img, optional, The URL of the issue type's avatar.
 * @param key, optional, The key of the issue.
 * @param keyHtml, optional, The key of the issue in HTML format.
 * @param summary, optional, The phrase containing the query string in HTML format, with the string highlighted with HTML bold tags.
 * @param summaryText, optional, The phrase containing the query string, as plain text.
 */
@Serializable
data class SuggestedIssue(
    @SerialName("id") val id: Long? = null,
    @SerialName("img") val img: String? = null,
    @SerialName("key") val key: String? = null,
    @SerialName("keyHtml") val keyHtml: String? = null,
    @SerialName("summary") val summary: String? = null,
    @SerialName("summaryText") val summaryText: String? = null
)