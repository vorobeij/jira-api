/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The conditions group associated with the transition.
 *
 * @param conditionGroups, optional, The nested conditions of the condition group.
 * @param conditions, optional, The rules for this condition.
 * @param operation, optional, Determines how the conditions in the group are evaluated. Accepts either `ANY` or `ALL`. If `ANY` is used, at least one condition in the group must be true for the group to evaluate to true. If `ALL` is used, all conditions in the group must be true for the group to evaluate to true.
 */
@Serializable
data class ConditionGroupConfiguration(
    @SerialName("conditionGroups") val conditionGroups: List<ConditionGroupConfiguration>? = null,
    @SerialName("conditions") val conditions: List<WorkflowRuleConfiguration>? = null,
    @SerialName("operation") val operation: String? = null
)