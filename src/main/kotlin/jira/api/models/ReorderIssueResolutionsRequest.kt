/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Change the order of issue resolutions.
 *
 * @param after, optional, The ID of the resolution. Required if `position` isn't provided.
 * @param ids, required, The list of resolution IDs to be reordered. Cannot contain duplicates nor after ID.
 * @param position, optional, The position for issue resolutions to be moved to. Required if `after` isn't provided.
 */
@Serializable
data class ReorderIssueResolutionsRequest(
    @SerialName("after") val after: String? = null,
    @SerialName("ids") val ids: List<String>,
    @SerialName("position") val position: String? = null
)