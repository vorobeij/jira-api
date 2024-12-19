/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param queueCategory, optional
 * @param queueId, optional
 * @param queueName, optional
 */
@Serializable
data class ServiceManagementNavigationInfo(
    @SerialName("queueCategory") val queueCategory: String? = null,
    @SerialName("queueId") val queueId: Long? = null,
    @SerialName("queueName") val queueName: String? = null
)