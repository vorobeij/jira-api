/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * List of issues and JQL queries.
 *
 * @param issueIds, required, A list of issue IDs.
 * @param jqls, required, A list of JQL queries.
 */
@Serializable
data class IssuesAndJQLQueries(
    @SerialName("issueIds") val issueIds: List<Long>,
    @SerialName("jqls") val jqls: List<String>
)