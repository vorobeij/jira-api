/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The current version details of this workflow scheme.
 *
 * @param id, required, The version UUID.
 * @param versionNumber, required, The version number.
 */
@Serializable
data class DocumentVersion(
    @SerialName("id") val id: String,
    @SerialName("versionNumber") val versionNumber: Long
)