/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param jql, optional
 */
@Serializable
data class ArchiveIssueAsyncRequest(
    @SerialName("jql") val jql: String? = null
)