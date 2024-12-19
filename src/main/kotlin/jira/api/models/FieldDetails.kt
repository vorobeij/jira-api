/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * Details about a field.
 *
 * @param clauseNames, optional, The names that can be used to reference the field in an advanced search. For more information, see [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ).
 * @param custom, optional, Whether the field is a custom field.
 * @param id, optional, The ID of the field.
 * @param key, optional, The key of the field.
 * @param name, optional, The name of the field.
 * @param navigable, optional, Whether the field can be used as a column on the issue navigator.
 * @param orderable, optional, Whether the content of the field can be used to order lists.
 * @param schema, optional, The data schema for the field.
 * @param scope, optional, The scope of the field.
 * @param searchable, optional, Whether the content of the field can be searched.
 */
@Serializable
data class FieldDetails(
    @SerialName("clauseNames") val clauseNames: List<String>? = null,
    @SerialName("custom") val custom: Boolean? = null,
    @SerialName("id") val id: String? = null,
    @SerialName("key") val key: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("navigable") val navigable: Boolean? = null,
    @SerialName("orderable") val orderable: Boolean? = null,
    @SerialName("schema") val schema: schema? = null,
    @SerialName("scope") val scope: scope? = null,
    @SerialName("searchable") val searchable: Boolean? = null
)