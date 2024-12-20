/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param beans, required, The number of Jira REST API beans returned in the response.
 * @param expensiveOperations, required, The number of expensive operations executed while evaluating the expression. Expensive operations are those that load additional data, such as entity properties, comments, or custom fields.
 * @param primitiveValues, required, The number of primitive values returned in the response.
 * @param steps, required, The number of steps it took to evaluate the expression, where a step is a high-level operation performed by the expression. A step is an operation such as arithmetic, accessing a property, accessing a context variable, or calling a function.
 */
@Serializable
data class JiraExpressionsComplexityBean(
    @SerialName("beans") val beans: JiraExpressionsComplexityValueBean,
    @SerialName("expensiveOperations") val expensiveOperations: JiraExpressionsComplexityValueBean,
    @SerialName("primitiveValues") val primitiveValues: JiraExpressionsComplexityValueBean,
    @SerialName("steps") val steps: JiraExpressionsComplexityValueBean
)