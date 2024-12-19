/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A list of issue IDs.
 *
 * @param issueIds, required, The list of issue IDs.
 */
@Serializable
data class IssueList(
    @SerialName("issueIds") val issueIds: List<String>
)