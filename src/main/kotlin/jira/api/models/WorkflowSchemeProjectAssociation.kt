/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An associated workflow scheme and project.
 *
 * @param projectId, required, The ID of the project.
 * @param workflowSchemeId, optional, The ID of the workflow scheme. If the workflow scheme ID is `null`, the operation assigns the default workflow scheme.
 */
@Serializable
data class WorkflowSchemeProjectAssociation(
    @SerialName("projectId") val projectId: String,
    @SerialName("workflowSchemeId") val workflowSchemeId: String? = null
)