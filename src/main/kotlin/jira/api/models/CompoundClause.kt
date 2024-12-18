/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A JQL query clause that consists of nested clauses. For example, `(labels in (urgent, blocker) OR lastCommentedBy = currentUser()). Note that, where nesting is not defined, the parser nests JQL clauses based on the operator precedence. For example, "A OR B AND C" is parsed as "(A OR B) AND C". See Setting the precedence of operators for more information about precedence in JQL queries.`
 *
 * @param clauses, required, The list of nested clauses.
 * @param operator, required, The operator between the clauses.
 */
@Serializable
data class CompoundClause(
    @SerialName("clauses") val clauses: List<JqlQueryClause>,
    @SerialName("operator") val operator: String
)