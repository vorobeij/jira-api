/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * The status of the item.
 *
 * @param icon, optional, Details of the icon representing the status. If not provided, no status icon displays in Jira.
 * @param resolved, optional, Whether the item is resolved. If set to "true", the link to the issue is displayed in a strikethrough font, otherwise the link displays in normal font.
 */
@Serializable
data class Status(
    @SerialName("icon") val icon: icon? = null,
    @SerialName("resolved") val resolved: Boolean? = null
)