/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A list of changelog IDs.
 *
 * @param changelogIds, required, The list of changelog IDs.
 */
@Serializable
data class IssueChangelogIds(
    @SerialName("changelogIds") val changelogIds: List<Long>
)