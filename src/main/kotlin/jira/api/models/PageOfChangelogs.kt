/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A page of changelogs.
 *
 * @param histories, optional, The list of changelogs.
 * @param maxResults, optional, The maximum number of results that could be on the page.
 * @param startAt, optional, The index of the first item returned on the page.
 * @param total, optional, The number of results on the page.
 */
@Serializable
data class PageOfChangelogs(
    @SerialName("histories") val histories: List<Changelog>? = null,
    @SerialName("maxResults") val maxResults: Int? = null,
    @SerialName("startAt") val startAt: Int? = null,
    @SerialName("total") val total: Int? = null
)