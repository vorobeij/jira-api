/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param levels, optional, The list of scheme levels which should be added to the security scheme.
 */
@Serializable
data class AddSecuritySchemeLevelsRequestBean(
    @SerialName("levels") val levels: List<SecuritySchemeLevelBean>? = null
)