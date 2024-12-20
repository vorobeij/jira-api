/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A field used in a JQL query. See [Advanced searching - fields reference](https://confluence.atlassian.com/x/dAiiLQ) for more information about fields in JQL queries.
 *
 * @param encodedName, optional, The encoded name of the field, which can be used directly in a JQL query.
 * @param name, required, The name of the field.
 * @param property, optional, When the field refers to a value in an entity property, details of the entity property value.
 */
@Serializable
data class JqlQueryField(
    @SerialName("encodedName") val encodedName: String? = null,
    @SerialName("name") val name: String,
    @SerialName("property") val property: List<JqlQueryFieldEntityProperty>? = null
)