/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param issueTypeId, required
 */
@Serializable
data class JiraIssueTypeField(
    @SerialName("issueTypeId") val issueTypeId: String
)