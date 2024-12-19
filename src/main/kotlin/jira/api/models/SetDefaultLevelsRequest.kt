/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of new default levels.
 *
 * @param defaultValues, required, List of objects with issue security scheme ID and new default level ID.
 */
@Serializable
data class SetDefaultLevelsRequest(
    @SerialName("defaultValues") val defaultValues: List<DefaultLevelValue>
)