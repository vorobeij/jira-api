/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * The details of a workflow transition.
 *
 * @param description, optional, The description of the transition. The maximum length is 1000 characters.
 * @param from, optional, The statuses the transition can start from.
 * @param name, required, The name of the transition. The maximum length is 60 characters.
 * @param properties, optional, The properties of the transition.
 * @param rules, optional, The rules of the transition.
 * @param screen, optional, The screen of the transition.
 * @param to, required, The status the transition goes to.
 * @param type, required, The type of the transition.
 */
@Serializable
data class CreateWorkflowTransitionDetails(
    @SerialName("description") val description: String? = null,
    @SerialName("from") val from: List<String>? = null,
    @SerialName("name") val name: String,
    @SerialName("properties") val properties: properties? = null,
    @SerialName("rules") val rules: CreateWorkflowTransitionRulesDetails? = null,
    @SerialName("screen") val screen: CreateWorkflowTransitionScreenDetails? = null,
    @SerialName("to") val to: String,
    @SerialName("type") val type: String
)