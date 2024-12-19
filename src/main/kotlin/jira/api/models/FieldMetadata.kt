/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * The metadata describing an issue field.
 *
 * @param allowedValues, optional, The list of values allowed in the field.
 * @param autoCompleteUrl, optional, The URL that can be used to automatically complete the field.
 * @param configuration, optional, The configuration properties.
 * @param defaultValue, optional, The default value of the field.
 * @param hasDefaultValue, optional, Whether the field has a default value.
 * @param key, required, The key of the field.
 * @param name, required, The name of the field.
 * @param operations, required, The list of operations that can be performed on the field.
 * @param required, required, Whether the field is required.
 * @param schema, required, The data type of the field.
 */
@Serializable
data class FieldMetadata(
    @SerialName("allowedValues") val allowedValues: List<null>? = null,
    @SerialName("autoCompleteUrl") val autoCompleteUrl: String? = null,
    @SerialName("configuration") val configuration: configuration? = null,
    @SerialName("defaultValue") val defaultValue: defaultValue? = null,
    @SerialName("hasDefaultValue") val hasDefaultValue: Boolean? = null,
    @SerialName("key") val key: String,
    @SerialName("name") val name: String,
    @SerialName("operations") val operations: List<String>,
    @SerialName("required") val required: Boolean,
    @SerialName("schema") val schema: schema
)