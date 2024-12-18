/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of the name, description, and default issue type for an issue type scheme.
 *
 * @param defaultIssueTypeId, optional, The ID of the default issue type of the issue type scheme.
 * @param description, optional, The description of the issue type scheme. The maximum length is 4000 characters.
 * @param name, optional, The name of the issue type scheme. The name must be unique. The maximum length is 255 characters.
 */
@Serializable
data class IssueTypeSchemeUpdateDetails(
    @SerialName("defaultIssueTypeId") val defaultIssueTypeId: String? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("name") val name: String? = null
)