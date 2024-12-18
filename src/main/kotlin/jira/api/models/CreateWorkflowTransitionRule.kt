/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * A workflow transition rule.
 *
 * @param configuration, optional, EXPERIMENTAL. The configuration of the transition rule.
 * @param type, required, The type of the transition rule.
 */
@Serializable
data class CreateWorkflowTransitionRule(
    @SerialName("configuration") val configuration: configuration? = null,
    @SerialName("type") val type: String
)