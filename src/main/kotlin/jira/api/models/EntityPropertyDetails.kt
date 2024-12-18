/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param entityId, required, The entity property ID.
 * @param key, required, The entity property key.
 * @param value, required, The new value of the entity property.
 */
@Serializable
data class EntityPropertyDetails(
    @SerialName("entityId") val entityId: Float,
    @SerialName("key") val key: String,
    @SerialName("value") val value: String
)