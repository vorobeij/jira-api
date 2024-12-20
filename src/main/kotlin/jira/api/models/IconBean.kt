/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An icon.
 *
 * @param link, optional, The URL of the tooltip, used only for a status icon.
 * @param title, optional, The title of the icon, for use as a tooltip on the icon.
 * @param url16x16, optional, The URL of a 16x16 pixel icon.
 */
@Serializable
data class IconBean(
    @SerialName("link") val link: String? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("url16x16") val url16x16: String? = null
)