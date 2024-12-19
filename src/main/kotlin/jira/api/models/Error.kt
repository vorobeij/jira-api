/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param count, optional
 * @param issueIdsOrKeys, optional
 * @param message, optional
 */
@Serializable
data class Error(
    @SerialName("count") val count: Long? = null,
    @SerialName("issueIdsOrKeys") val issueIdsOrKeys: List<String>? = null,
    @SerialName("message") val message: String? = null
)