/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The default value for a Forge collection of groups custom field.
 *
 * @param contextId, required, The ID of the context.
 * @param groupIds, required, The IDs of the default groups.
 * @param type, required
 */
@Serializable
data class CustomFieldContextDefaultValueForgeMultiGroupField(
    @SerialName("contextId") val contextId: String,
    @SerialName("groupIds") val groupIds: List<String>,
    @SerialName("type") val type: String
)