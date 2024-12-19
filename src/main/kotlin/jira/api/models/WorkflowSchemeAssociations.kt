/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * A workflow scheme along with a list of projects that use it.
 *
 * @param projectIds, required, The list of projects that use the workflow scheme.
 * @param workflowScheme, required, The workflow scheme.
 */
@Serializable
data class WorkflowSchemeAssociations(
    @SerialName("projectIds") val projectIds: List<String>,
    @SerialName("workflowScheme") val workflowScheme: workflowScheme
)