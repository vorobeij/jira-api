/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * Details of a new priority scheme
 *
 * @param defaultPriorityId, required, The ID of the default priority for the priority scheme.
 * @param description, optional, The description of the priority scheme.
 * @param mappings, optional, Mappings of issue priorities for issues being migrated in and out of this priority scheme.
 * @param name, required, The name of the priority scheme. Must be unique.
 * @param priorityIds, required, The IDs of priorities in the scheme.
 * @param projectIds, optional, The IDs of projects that will use the priority scheme.
 */
@Serializable
data class CreatePrioritySchemeDetails(
    @SerialName("defaultPriorityId") val defaultPriorityId: Long,
    @SerialName("description") val description: String? = null,
    @SerialName("mappings") val mappings: mappings? = null,
    @SerialName("name") val name: String,
    @SerialName("priorityIds") val priorityIds: List<Long>,
    @SerialName("projectIds") val projectIds: List<Long>? = null
)