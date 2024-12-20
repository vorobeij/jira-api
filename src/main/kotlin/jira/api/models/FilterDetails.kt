/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of a filter.
 *
 * @param approximateLastUsed, optional, \[Experimental\] Approximate last used time. Returns the date and time when the filter was last used. Returns `null` if the filter hasn't been used after tracking was enabled. For performance reasons, timestamps aren't updated in real time and therefore may not be exactly accurate.
 * @param description, optional, The description of the filter.
 * @param editPermissions, optional, The groups and projects that can edit the filter. This can be specified when updating a filter, but not when creating a filter.
 * @param expand, optional, Expand options that include additional filter details in the response.
 * @param favourite, optional, Whether the filter is selected as a favorite by any users, not including the filter owner.
 * @param favouritedCount, optional, The count of how many users have selected this filter as a favorite, including the filter owner.
 * @param id, optional, The unique identifier for the filter.
 * @param jql, optional, The JQL query for the filter. For example, *project = SSP AND issuetype = Bug*.
 * @param name, required, The name of the filter.
 * @param owner, optional, The user who owns the filter. Defaults to the creator of the filter, however, Jira administrators can change the owner of a shared filter in the admin settings.
 * @param searchUrl, optional, A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter's JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql=project+%3D+SSP+AND+issuetype+%3D+Bug*.
 * @param self, optional, The URL of the filter.
 * @param sharePermissions, optional, The groups and projects that the filter is shared with. This can be specified when updating a filter, but not when creating a filter.
 * @param subscriptions, optional, The users that are subscribed to the filter.
 * @param viewUrl, optional, A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter=10100*.
 */
@Serializable
data class FilterDetails(
    @SerialName("approximateLastUsed") val approximateLastUsed: String? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("editPermissions") val editPermissions: List<SharePermission>? = null,
    @SerialName("expand") val expand: String? = null,
    @SerialName("favourite") val favourite: Boolean? = null,
    @SerialName("favouritedCount") val favouritedCount: Long? = null,
    @SerialName("id") val id: String? = null,
    @SerialName("jql") val jql: String? = null,
    @SerialName("name") val name: String,
    @SerialName("owner") val owner: User? = null,
    @SerialName("searchUrl") val searchUrl: String? = null,
    @SerialName("self") val self: String? = null,
    @SerialName("sharePermissions") val sharePermissions: List<SharePermission>? = null,
    @SerialName("subscriptions") val subscriptions: List<FilterSubscription>? = null,
    @SerialName("viewUrl") val viewUrl: String? = null
)