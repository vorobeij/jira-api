/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param accountId, optional
 * @param key, optional
 * @param username, optional
 */
@Serializable
data class UserMigrationBean(
    @SerialName("accountId") val accountId: String? = null,
    @SerialName("key") val key: String? = null,
    @SerialName("username") val username: String? = null
)