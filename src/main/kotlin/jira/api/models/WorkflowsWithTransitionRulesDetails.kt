/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of workflows and their transition rules to delete.
 *
 * @param workflows, required, The list of workflows with transition rules to delete.
 */
@Serializable
data class WorkflowsWithTransitionRulesDetails(
    @SerialName("workflows") val workflows: List<WorkflowTransitionRulesDetails>
)