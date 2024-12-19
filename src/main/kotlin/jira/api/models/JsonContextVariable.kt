/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * A JSON object with custom content.
 *
 * @param type, required, Type of custom context variable.
 * @param value, optional, A JSON object containing custom content.
 */
@Serializable
data class JsonContextVariable(
    @SerialName("type") val type: String,
    @SerialName("value") val value: value? = null
)