/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The Forge provided ecosystem rules available.
 *
 * @param description, optional, The rule description.
 * @param id, optional, The unique ARI of the forge rule type.
 * @param name, optional, The rule name.
 * @param ruleKey, optional, The rule key.
 * @param ruleType, optional, The rule type.
 */
@Serializable
data class AvailableWorkflowForgeRule(
    @SerialName("description") val description: String? = null,
    @SerialName("id") val id: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("ruleKey") val ruleKey: String? = null,
    @SerialName("ruleType") val ruleType: String? = null
)