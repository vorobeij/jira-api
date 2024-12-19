/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param newLevelId, required, The new issue security level ID. Providing null will clear the assigned old level from issues.
 * @param oldLevelId, required, The old issue security level ID. Providing null will remap all issues without any assigned levels.
 */
@Serializable
data class OldToNewSecurityLevelMappingsBean(
    @SerialName("newLevelId") val newLevelId: String,
    @SerialName("oldLevelId") val oldLevelId: String
)