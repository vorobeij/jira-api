/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Additional details about a project.
 *
 * @param lastIssueUpdateTime, optional, The last issue update time.
 * @param totalIssueCount, optional, Total issue count.
 */
@Serializable
data class ProjectInsight(
    @SerialName("lastIssueUpdateTime") val lastIssueUpdateTime: String? = null,
    @SerialName("totalIssueCount") val totalIssueCount: Long? = null
)