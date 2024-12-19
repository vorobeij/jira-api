/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The converted JQL queries.
 *
 * @param queriesWithUnknownUsers, optional, List of queries containing user information that could not be mapped to an existing user
 * @param queryStrings, optional, The list of converted query strings with account IDs in place of user identifiers.
 */
@Serializable
data class ConvertedJQLQueries(
    @SerialName("queriesWithUnknownUsers") val queriesWithUnknownUsers: List<JQLQueryWithUnknownUsers>? = null,
    @SerialName("queryStrings") val queryStrings: List<String>? = null
)