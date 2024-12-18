/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An operand that is a list of values.
 *
 * @param encodedOperand, optional, Encoded operand, which can be used directly in a JQL query.
 * @param values, required, The list of operand values.
 */
@Serializable
data class ListOperand(
    @SerialName("encodedOperand") val encodedOperand: String? = null,
    @SerialName("values") val values: List<JqlQueryUnitaryOperand>
)