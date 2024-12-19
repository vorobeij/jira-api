/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * The configuration of the rule.
 *
 * @param id, optional, The ID of the rule.
 * @param parameters, optional, The parameters related to the rule.
 * @param ruleKey, required, The rule key of the rule.
 */
@Serializable
data class WorkflowRuleConfiguration(
    @SerialName("id") val id: String? = null,
    @SerialName("parameters") val parameters: parameters? = null,
    @SerialName("ruleKey") val ruleKey: String
)