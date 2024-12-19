/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The ID of a screen scheme.
 *
 * @param screenSchemeId, required, The ID of the screen scheme.
 */
@Serializable
data class UpdateDefaultScreenScheme(
    @SerialName("screenSchemeId") val screenSchemeId: String
)