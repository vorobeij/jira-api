/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * Details of a workflow status.
 *
 * @param id, required, The ID of the issue status.
 * @param name, required, The name of the status in the workflow.
 * @param properties, optional, Additional properties that modify the behavior of issues in this status. Supports the properties `jira.issue.editable` and `issueEditable` (deprecated) that indicate whether issues are editable.
 */
@Serializable
data class WorkflowStatus(
    @SerialName("id") val id: String,
    @SerialName("name") val name: String,
    @SerialName("properties") val properties: properties? = null
)