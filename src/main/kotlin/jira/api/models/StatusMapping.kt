/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details about the mapping from a status to a new status for an issue type.
 *
 * @param issueTypeId, required, The ID of the issue type.
 * @param newStatusId, required, The ID of the new status.
 * @param statusId, required, The ID of the status.
 */
@Serializable
data class StatusMapping(
    @SerialName("issueTypeId") val issueTypeId: String,
    @SerialName("newStatusId") val newStatusId: String,
    @SerialName("statusId") val statusId: String
)