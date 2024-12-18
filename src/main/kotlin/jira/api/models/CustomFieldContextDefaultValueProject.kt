/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The default value for a project custom field.
 *
 * @param contextId, required, The ID of the context.
 * @param projectId, required, The ID of the default project.
 * @param type, required
 */
@Serializable
data class CustomFieldContextDefaultValueProject(
    @SerialName("contextId") val contextId: String,
    @SerialName("projectId") val projectId: String,
    @SerialName("type") val type: String
)