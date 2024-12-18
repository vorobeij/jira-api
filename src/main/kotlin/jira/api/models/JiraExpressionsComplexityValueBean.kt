/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param limit, required, The maximum allowed complexity. The evaluation will fail if this value is exceeded.
 * @param value, required, The complexity value of the current expression.
 */
@Serializable
data class JiraExpressionsComplexityValueBean(
    @SerialName("limit") val limit: Int,
    @SerialName("value") val value: Int
)