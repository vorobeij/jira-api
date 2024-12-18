/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of functions that can be used in advanced searches.
 *
 * @param displayName, optional, The display name of the function.
 * @param isList, optional, Whether the function can take a list of arguments.
 * @param supportsListAndSingleValueOperators, optional, Whether the function supports both single and list value operators.
 * @param types, optional, The data types returned by the function.
 * @param value, optional, The function identifier.
 */
@Serializable
data class FunctionReferenceData(
    @SerialName("displayName") val displayName: String? = null,
    @SerialName("isList") val isList: String? = null,
    @SerialName("supportsListAndSingleValueOperators") val supportsListAndSingleValueOperators: String? = null,
    @SerialName("types") val types: List<String>? = null,
    @SerialName("value") val value: String? = null
)