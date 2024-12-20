/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A workflow transition rule.
 *
 * @param ruleConfiguration, optional, A rule configuration.
 * @param id, required, The ID of the transition rule.
 * @param key, required, The key of the rule, as defined in the Connect app descriptor.
 * @param workflowTransition, optional, A workflow transition.
 */
@Serializable
data class ConnectWorkflowTransitionRule(
    @SerialName("ruleConfiguration") val ruleConfiguration: RuleConfiguration? = null,
    @SerialName("id") val id: String,
    @SerialName("key") val key: String,
    @SerialName("workflowTransition") val workflowTransition: WorkflowTransition? = null
)