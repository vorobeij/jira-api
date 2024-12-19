/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of issue security scheme level.
 *
 * @param description, optional, The description of the issue security scheme level.
 * @param name, optional, The name of the issue security scheme level. Must be unique.
 */
@Serializable
data class UpdateIssueSecurityLevelDetails(
    @SerialName("description") val description: String? = null,
    @SerialName("name") val name: String? = null
)