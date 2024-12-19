/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param type, required, The permission holder type. This must be "Group" or "AccountId".
 * @param value, required, The permission holder value. This must be a group name if the type is "Group" or an account ID if the type is "AccountId".
 */
@Serializable
data class CreatePermissionHolderRequest(
    @SerialName("type") val type: String,
    @SerialName("value") val value: String
)