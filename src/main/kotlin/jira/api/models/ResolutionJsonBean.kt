/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param default, optional
 * @param description, optional
 * @param iconUrl, optional
 * @param id, optional
 * @param name, optional
 * @param self, optional
 */
@Serializable
data class ResolutionJsonBean(
    @SerialName("default") val default: Boolean? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("iconUrl") val iconUrl: String? = null,
    @SerialName("id") val id: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("self") val self: String? = null
)