/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A page of items.
 *
 * @param isLast, optional, Whether this is the last page.
 * @param maxResults, optional, The maximum number of items that could be returned.
 * @param nextPage, optional, If there is another page of results, the URL of the next page.
 * @param self, optional, The URL of the page.
 * @param startAt, optional, The index of the first item returned.
 * @param total, optional, The number of items returned.
 * @param values, optional, The list of items.
 */
@Serializable
data class PageBeanNotificationScheme(
    @SerialName("isLast") val isLast: Boolean? = null,
    @SerialName("maxResults") val maxResults: Int? = null,
    @SerialName("nextPage") val nextPage: String? = null,
    @SerialName("self") val self: String? = null,
    @SerialName("startAt") val startAt: Long? = null,
    @SerialName("total") val total: Long? = null,
    @SerialName("values") val values: List<NotificationScheme>? = null
)