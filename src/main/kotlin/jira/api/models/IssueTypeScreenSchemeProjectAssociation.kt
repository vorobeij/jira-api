/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Associated issue type screen scheme and project.
 *
 * @param issueTypeScreenSchemeId, optional, The ID of the issue type screen scheme.
 * @param projectId, optional, The ID of the project.
 */
@Serializable
data class IssueTypeScreenSchemeProjectAssociation(
    @SerialName("issueTypeScreenSchemeId") val issueTypeScreenSchemeId: String? = null,
    @SerialName("projectId") val projectId: String? = null
)