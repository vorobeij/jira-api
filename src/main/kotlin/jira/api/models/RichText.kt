/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param empty, optional
 * @param emptyAdf, optional
 * @param finalised, optional
 * @param valueSet, optional
 */
@Serializable
data class RichText(
    @SerialName("empty") val empty: Boolean? = null,
    @SerialName("emptyAdf") val emptyAdf: Boolean? = null,
    @SerialName("finalised") val finalised: Boolean? = null,
    @SerialName("valueSet") val valueSet: Boolean? = null
)