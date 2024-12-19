/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A workflow with transition rules.
 *
 * @param conditions, optional, The list of conditions within the workflow.
 * @param postFunctions, optional, The list of post functions within the workflow.
 * @param validators, optional, The list of validators within the workflow.
 * @param workflowId, optional, Properties that identify a workflow.
 */
@Serializable
data class WorkflowTransitionRules(
    @SerialName("conditions") val conditions: List<AppWorkflowTransitionRule>? = null,
    @SerialName("postFunctions") val postFunctions: List<AppWorkflowTransitionRule>? = null,
    @SerialName("validators") val validators: List<AppWorkflowTransitionRule>? = null,
    @SerialName("workflowId") val workflowId: WorkflowId? = null
)