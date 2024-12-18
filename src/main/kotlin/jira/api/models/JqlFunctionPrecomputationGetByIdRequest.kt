/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Request to fetch precomputations by ID.
 *
 * @param precomputationIDs, optional
 */
@Serializable
data class JqlFunctionPrecomputationGetByIdRequest(
    @SerialName("precomputationIDs") val precomputationIDs: List<String>? = null
)