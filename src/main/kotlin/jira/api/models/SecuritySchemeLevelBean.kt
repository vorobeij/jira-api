/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param description, optional, The description of the issue security scheme level.
 * @param isDefault, optional, Specifies whether the level is the default level. False by default.
 * @param members, optional, The list of level members which should be added to the issue security scheme level.
 * @param name, required, The name of the issue security scheme level. Must be unique.
 */
@Serializable
data class SecuritySchemeLevelBean(
    @SerialName("description") val description: String? = null,
    @SerialName("isDefault") val isDefault: Boolean? = null,
    @SerialName("members") val members: List<SecuritySchemeLevelMemberBean>? = null,
    @SerialName("name") val name: String
)