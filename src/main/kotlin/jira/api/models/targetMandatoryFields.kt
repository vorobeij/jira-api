/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Field mapping for mandatory fields in target
 *
 * @param fields, required, Contains the value of mandatory fields
 */
@Serializable
data class targetMandatoryFields(
    @SerialName("fields") val fields: fields
)