/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The application the linked item is in.
 *
 * @param name, optional, The name of the application. Used in conjunction with the (remote) object icon title to display a tooltip for the link's icon. The tooltip takes the format "\[application name\] icon title". Blank items are excluded from the tooltip title. If both items are blank, the icon tooltop displays as "Web Link". Grouping and sorting of links may place links without an application name last.
 * @param type, optional, The name-spaced type of the application, used by registered rendering apps.
 */
@Serializable
data class Application(
    @SerialName("name") val name: String? = null,
    @SerialName("type") val type: String? = null
)