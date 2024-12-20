/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The trigger rules available.
 *
 * @param availableTypes, required, The list of available trigger types.
 * @param ruleKey, required, The rule key of the rule.
 */
@Serializable
data class AvailableWorkflowTriggers(
    @SerialName("availableTypes") val availableTypes: List<AvailableWorkflowTriggerTypes>,
    @SerialName("ruleKey") val ruleKey: String
)