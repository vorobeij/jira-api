/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A compound workflow transition rule condition. This object returns `nodeType` as `compound`.
 *
 * @param conditions, required, The list of workflow conditions.
 * @param nodeType, required
 * @param operator, required, The compound condition operator.
 */
@Serializable
data class WorkflowCompoundCondition(
    @SerialName("conditions") val conditions: List<WorkflowCondition>,
    @SerialName("nodeType") val nodeType: String,
    @SerialName("operator") val operator: String
)