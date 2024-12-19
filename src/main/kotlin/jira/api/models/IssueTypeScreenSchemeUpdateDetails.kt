/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of an issue type screen scheme.
 *
 * @param description, optional, The description of the issue type screen scheme. The maximum length is 255 characters.
 * @param name, optional, The name of the issue type screen scheme. The name must be unique. The maximum length is 255 characters.
 */
@Serializable
data class IssueTypeScreenSchemeUpdateDetails(
    @SerialName("description") val description: String? = null,
    @SerialName("name") val name: String? = null
)