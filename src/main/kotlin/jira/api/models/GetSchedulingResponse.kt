/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 *
 * @param dependencies, required, The dependencies for the plan. This is "Sequential" or "Concurrent".
 * @param endDate, required, The end date field for the plan.
 * @param estimation, required, The estimation unit for the plan. This is "StoryPoints", "Days" or "Hours".
 * @param inferredDates, required, The inferred dates for the plan. This is "None", "SprintDates" or "ReleaseDates".
 * @param startDate, required, The start date field for the plan.
 */
@Serializable
data class GetSchedulingResponse(
    @SerialName("dependencies") val dependencies: String,
    @SerialName("endDate") val endDate: endDate,
    @SerialName("estimation") val estimation: String,
    @SerialName("inferredDates") val inferredDates: String,
    @SerialName("startDate") val startDate: startDate
)