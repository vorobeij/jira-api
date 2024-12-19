/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param cursor, optional
 * @param last, optional
 * @param nextPageCursor, optional
 * @param size, optional
 * @param total, optional
 * @param values, optional
 */
@Serializable
data class PageWithCursorGetTeamResponseForPage(
    @SerialName("cursor") val cursor: String? = null,
    @SerialName("last") val last: Boolean? = null,
    @SerialName("nextPageCursor") val nextPageCursor: String? = null,
    @SerialName("size") val size: Int? = null,
    @SerialName("total") val total: Long? = null,
    @SerialName("values") val values: List<GetTeamResponseForPage>? = null
)