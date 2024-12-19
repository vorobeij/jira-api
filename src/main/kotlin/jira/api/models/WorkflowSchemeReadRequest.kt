/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The workflow scheme read request body.
 *
 * @param projectIds, optional, The list of project IDs to query.
 * @param workflowSchemeIds, optional, The list of workflow scheme IDs to query.
 */
@Serializable
data class WorkflowSchemeReadRequest(
    @SerialName("projectIds") val projectIds: List<String>? = null,
    @SerialName("workflowSchemeIds") val workflowSchemeIds: List<String>? = null
)