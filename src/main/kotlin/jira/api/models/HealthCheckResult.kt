/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Jira instance health check results. Deprecated and no longer returned.
 *
 * @param description, optional, The description of the Jira health check item.
 * @param name, optional, The name of the Jira health check item.
 * @param passed, optional, Whether the Jira health check item passed or failed.
 */
@Serializable
data class HealthCheckResult(
    @SerialName("description") val description: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("passed") val passed: Boolean? = null
)