/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Property key details.
 *
 * @param key, optional, The key of the property.
 * @param self, optional, The URL of the property.
 */
@Serializable
data class PropertyKey(
    @SerialName("key") val key: String? = null,
    @SerialName("self") val self: String? = null
)