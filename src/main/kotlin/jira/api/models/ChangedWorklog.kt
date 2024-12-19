/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of a changed worklog.
 *
 * @param properties, optional, Details of properties associated with the change.
 * @param updatedTime, optional, The datetime of the change.
 * @param worklogId, optional, The ID of the worklog.
 */
@Serializable
data class ChangedWorklog(
    @SerialName("properties") val properties: List<EntityProperty>? = null,
    @SerialName("updatedTime") val updatedTime: Long? = null,
    @SerialName("worklogId") val worklogId: Long? = null
)