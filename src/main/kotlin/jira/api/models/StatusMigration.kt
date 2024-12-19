/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The mapping of old to new status ID.
 *
 * @param newStatusReference, required, The new status ID.
 * @param oldStatusReference, required, The old status ID.
 */
@Serializable
data class StatusMigration(
    @SerialName("newStatusReference") val newStatusReference: String,
    @SerialName("oldStatusReference") val oldStatusReference: String
)