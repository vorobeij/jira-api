/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Properties that identify a workflow.
 *
 * @param draft, required, Whether the workflow is in the draft state.
 * @param name, required, The name of the workflow.
 */
@Serializable
data class WorkflowId(
    @SerialName("draft") val draft: Boolean,
    @SerialName("name") val name: String
)