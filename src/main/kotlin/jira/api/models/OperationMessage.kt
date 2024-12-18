/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param message, required, The human-readable message that describes the result.
 * @param statusCode, required, The status code of the response.
 */
@Serializable
data class OperationMessage(
    @SerialName("message") val message: String,
    @SerialName("statusCode") val statusCode: Int
)