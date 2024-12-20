/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of the order-by JQL clause.
 *
 * @param fields, required, The list of order-by clause fields and their ordering directives.
 */
@Serializable
data class JqlQueryOrderByClause(
    @SerialName("fields") val fields: List<JqlQueryOrderByClauseElement>
)