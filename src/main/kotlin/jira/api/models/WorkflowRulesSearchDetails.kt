/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of workflow transition rules.
 *
 * @param invalidRules, optional, List of workflow rule IDs that do not belong to the workflow or can not be found.
 * @param validRules, optional, List of valid workflow transition rules.
 * @param workflowEntityId, optional, The workflow ID.
 */
@Serializable
data class WorkflowRulesSearchDetails(
    @SerialName("invalidRules") val invalidRules: List<String>? = null,
    @SerialName("validRules") val validRules: List<WorkflowTransitionRules>? = null,
    @SerialName("workflowEntityId") val workflowEntityId: String? = null
)