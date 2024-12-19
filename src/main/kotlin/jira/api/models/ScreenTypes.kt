/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The IDs of the screens for the screen types of the screen scheme.
 *
 * @param create, optional, The ID of the create screen.
 * @param default, required, The ID of the default screen. Required when creating a screen scheme.
 * @param edit, optional, The ID of the edit screen.
 * @param view, optional, The ID of the view screen.
 */
@Serializable
data class ScreenTypes(
    @SerialName("create") val create: Long? = null,
    @SerialName("default") val default: Long,
    @SerialName("edit") val edit: Long? = null,
    @SerialName("view") val view: Long? = null
)