/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * An entity property, for more information see [Entity properties](https://developer.atlassian.com/cloud/jira/platform/jira-entity-properties/).
 *
 * @param key, optional, The key of the property. Required on create and update.
 * @param value, optional, The value of the property. Required on create and update.
 */
@Serializable
data class EntityProperty(
    @SerialName("key") val key: String? = null,
    @SerialName("value") val value: value? = null
)