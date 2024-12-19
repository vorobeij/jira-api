/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * The trigger configuration associated with a workflow.
 *
 * @param id, optional, The ID of the trigger.
 * @param parameters, required, The parameters of the trigger.
 * @param ruleKey, required, The rule key of the trigger.
 */
@Serializable
data class WorkflowTrigger(
    @SerialName("id") val id: String? = null,
    @SerialName("parameters") val parameters: parameters,
    @SerialName("ruleKey") val ruleKey: String
)