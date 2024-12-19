/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * Details of an operation to perform on a field.
 *
 * @param add, optional, The value to add to the field.
 * @param copy, optional, The field value to copy from another issue.
 * @param edit, optional, The value to edit in the field.
 * @param remove, optional, The value to removed from the field.
 * @param set, optional, The value to set in the field.
 */
@Serializable
data class FieldUpdateOperation(
    @SerialName("add") val add: add? = null,
    @SerialName("copy") val copy: copy? = null,
    @SerialName("edit") val edit: edit? = null,
    @SerialName("remove") val remove: remove? = null,
    @SerialName("set") val set: set? = null
)