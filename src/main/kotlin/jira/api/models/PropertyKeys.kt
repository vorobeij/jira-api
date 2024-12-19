/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * List of property keys.
 *
 * @param keys, optional, Property key details.
 */
@Serializable
data class PropertyKeys(
    @SerialName("keys") val keys: List<PropertyKey>? = null
)