/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param notificationSchemeId, optional
 * @param projectId, optional
 */
@Serializable
data class NotificationSchemeAndProjectMappingJsonBean(
    @SerialName("notificationSchemeId") val notificationSchemeId: String? = null,
    @SerialName("projectId") val projectId: String? = null
)