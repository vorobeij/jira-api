/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details for changing owners of shareable entities
 *
 * @param autofixName, required, Whether the name is fixed automatically if it's duplicated after changing owner.
 * @param newOwner, required, The account id of the new owner.
 */
@Serializable
data class BulkChangeOwnerDetails(
    @SerialName("autofixName") val autofixName: Boolean,
    @SerialName("newOwner") val newOwner: String
)