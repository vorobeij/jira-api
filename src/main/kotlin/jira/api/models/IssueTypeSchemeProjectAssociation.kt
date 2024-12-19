/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of the association between an issue type scheme and project.
 *
 * @param issueTypeSchemeId, required, The ID of the issue type scheme.
 * @param projectId, required, The ID of the project.
 */
@Serializable
data class IssueTypeSchemeProjectAssociation(
    @SerialName("issueTypeSchemeId") val issueTypeSchemeId: String,
    @SerialName("projectId") val projectId: String
)