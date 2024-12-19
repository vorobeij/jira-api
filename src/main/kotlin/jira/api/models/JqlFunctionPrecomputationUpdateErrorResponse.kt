/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Error response returned updating JQL Function precomputations fails.
 *
 * @param errorMessages, optional, The list of error messages produced by this operation.
 * @param notFoundPrecomputationIDs, optional, List of precomputations that were not found.
 */
@Serializable
data class JqlFunctionPrecomputationUpdateErrorResponse(
    @SerialName("errorMessages") val errorMessages: List<String>? = null,
    @SerialName("notFoundPrecomputationIDs") val notFoundPrecomputationIDs: List<String>? = null
)