/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of the sanitized JQL query.
 *
 * @param accountId, optional, The account ID of the user for whom sanitization was performed.
 * @param errors, optional, The list of errors.
 * @param initialQuery, optional, The initial query.
 * @param sanitizedQuery, optional, The sanitized query, if there were no errors.
 */
@Serializable
data class SanitizedJqlQuery(
    @SerialName("accountId") val accountId: String? = null,
    @SerialName("errors") val errors: ErrorCollection? = null,
    @SerialName("initialQuery") val initialQuery: String? = null,
    @SerialName("sanitizedQuery") val sanitizedQuery: String? = null
)