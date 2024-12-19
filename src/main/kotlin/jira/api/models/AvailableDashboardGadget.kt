/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The details of the available dashboard gadget.
 *
 * @param moduleKey, optional, The module key of the gadget type.
 * @param title, required, The title of the gadget.
 * @param uri, optional, The URI of the gadget type.
 */
@Serializable
data class AvailableDashboardGadget(
    @SerialName("moduleKey") val moduleKey: String? = null,
    @SerialName("title") val title: String,
    @SerialName("uri") val uri: String? = null
)