/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The JQL query to sanitize for the account ID. If the account ID is null, sanitizing is performed for an anonymous user.
 *
 * @param accountId, optional, The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
 * @param query, required, The query to sanitize.
 */
@Serializable
data class JqlQueryToSanitize(
    @SerialName("accountId") val accountId: String? = null,
    @SerialName("query") val query: String
)