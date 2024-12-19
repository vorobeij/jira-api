/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of the instance's attachment settings.
 *
 * @param enabled, optional, Whether the ability to add attachments is enabled.
 * @param uploadLimit, optional, The maximum size of attachments permitted, in bytes.
 */
@Serializable
data class AttachmentSettings(
    @SerialName("enabled") val enabled: Boolean? = null,
    @SerialName("uploadLimit") val uploadLimit: Long? = null
)