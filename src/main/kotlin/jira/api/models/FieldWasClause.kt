/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A clause that asserts a previous value of a field. For example, `status WAS "Resolved" BY currentUser() BEFORE "2019/02/02"`. See [WAS](https://confluence.atlassian.com/x/dgiiLQ#Advancedsearching-operatorsreference-WASWAS) for more information about the WAS operator.
 *
 * @param jqlQueryField, optional, A field used in a JQL query. See [Advanced searching - fields reference](https://confluence.atlassian.com/x/dAiiLQ) for more information about fields in JQL queries.
 * @param jqlQueryClauseOperand, optional, Details of an operand in a JQL clause.
 * @param operator, required, The operator between the field and operand.
 * @param predicates, required, The list of time predicates.
 */
@Serializable
data class FieldWasClause(
    @SerialName("jqlQueryField") val jqlQueryField: JqlQueryField? = null,
    @SerialName("jqlQueryClauseOperand") val jqlQueryClauseOperand: JqlQueryClauseOperand? = null,
    @SerialName("operator") val operator: String,
    @SerialName("predicates") val predicates: List<JqlQueryClauseTimePredicate>
)