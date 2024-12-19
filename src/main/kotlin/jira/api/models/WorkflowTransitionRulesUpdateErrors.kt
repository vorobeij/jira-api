/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of any errors encountered while updating workflow transition rules.
 *
 * @param updateResults, required, A list of workflows.
 */
@Serializable
data class WorkflowTransitionRulesUpdateErrors(
    @SerialName("updateResults") val updateResults: List<WorkflowTransitionRulesUpdateErrorDetails>
)