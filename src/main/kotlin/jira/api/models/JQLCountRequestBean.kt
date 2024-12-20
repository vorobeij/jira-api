/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param jql, optional, A [JQL](https://confluence.atlassian.com/x/egORLQ) expression. For performance reasons, this field requires a bounded query. A bounded query is a query with a search restriction.
 */
@Serializable
data class JQLCountRequestBean(
    @SerialName("jql") val jql: String? = null
)