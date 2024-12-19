/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The mapping of old to new status ID for a specific project and issue type.
 *
 * @param issueTypeId, required, The issue type for the status mapping.
 * @param projectId, required, The project for the status mapping.
 * @param statusMigrations, required, The list of old and new status ID mappings for the specified project and issue type.
 */
@Serializable
data class StatusMappingDTO(
    @SerialName("issueTypeId") val issueTypeId: String,
    @SerialName("projectId") val projectId: String,
    @SerialName("statusMigrations") val statusMigrations: List<StatusMigration>
)