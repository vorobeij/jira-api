/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * Details of any errors encountered while updating workflow transition rules for a workflow.
 *
 * @param ruleUpdateErrors, required, A list of transition rule update errors, indexed by the transition rule ID. Any transition rule that appears here wasn't updated.
 * @param updateErrors, required, The list of errors that specify why the workflow update failed. The workflow was not updated if the list contains any entries.
 * @param workflowId, optional, Properties that identify a workflow.
 */
@Serializable
data class WorkflowTransitionRulesUpdateErrorDetails(
    @SerialName("ruleUpdateErrors") val ruleUpdateErrors: ruleUpdateErrors,
    @SerialName("updateErrors") val updateErrors: List<String>,
    @SerialName("workflowId") val workflowId: WorkflowId? = null
)