/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The JQL queries to be converted.
 *
 * @param queryStrings, optional, A list of queries with user identifiers. Maximum of 100 queries.
 */
@Serializable
data class JQLPersonalDataMigrationRequest(
    @SerialName("queryStrings") val queryStrings: List<String>? = null
)