/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Bulk Transition Get Available Transitions Response.
 *
 * @param availableTransitions, optional, List of available transitions for bulk transition operation for requested issues grouped by workflow
 * @param endingBefore, optional, The end cursor for use in pagination.
 * @param startingAfter, optional, The start cursor for use in pagination.
 */
@Serializable
data class BulkTransitionGetAvailableTransitions(
    @SerialName("availableTransitions") val availableTransitions: List<IssueBulkTransitionForWorkflow>? = null,
    @SerialName("endingBefore") val endingBefore: String? = null,
    @SerialName("startingAfter") val startingAfter: String? = null
)