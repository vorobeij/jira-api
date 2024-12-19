/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An ordered list of issue type IDs and information about where to move them.
 *
 * @param after, optional, The ID of the issue type to place the moved issue types after. Required if `position` isn't provided.
 * @param issueTypeIds, required, A list of the issue type IDs to move. The order of the issue type IDs in the list is the order they are given after the move.
 * @param position, optional, The position the issue types should be moved to. Required if `after` isn't provided.
 */
@Serializable
data class OrderOfIssueTypes(
    @SerialName("after") val after: String? = null,
    @SerialName("issueTypeIds") val issueTypeIds: List<String>,
    @SerialName("position") val position: String? = null
)