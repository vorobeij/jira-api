/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Get precomputations by ID response.
 *
 * @param notFoundPrecomputationIDs, optional, List of precomputations that were not found.
 * @param precomputations, optional, The list of precomputations.
 */
@Serializable
data class JqlFunctionPrecomputationGetByIdResponse(
    @SerialName("notFoundPrecomputationIDs") val notFoundPrecomputationIDs: List<String>? = null,
    @SerialName("precomputations") val precomputations: List<JqlFunctionPrecomputationBean>? = null
)