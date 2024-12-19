/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Precomputation id and its new value.
 *
 * @param error, optional, The error message to be displayed to the user if the given function clause is no longer valid during recalculation of the precomputation.
 * @param id, required, The id of the precomputation to update.
 * @param value, optional, The new value of the precomputation.
 */
@Serializable
data class JqlFunctionPrecomputationUpdateBean(
    @SerialName("error") val error: String? = null,
    @SerialName("id") val id: String,
    @SerialName("value") val value: String? = null
)