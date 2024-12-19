/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * The details of the gadget to update.
 *
 * @param color, optional, The color of the gadget. Should be one of `blue`, `red`, `yellow`, `green`, `cyan`, `purple`, `gray`, or `white`.
 * @param position, optional, The position of the gadget.
 * @param title, optional, The title of the gadget.
 */
@Serializable
data class DashboardGadgetUpdateRequest(
    @SerialName("color") val color: String? = null,
    @SerialName("position") val position: position? = null,
    @SerialName("title") val title: String? = null
)