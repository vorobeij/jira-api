/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of the issue creation metadata for a project.
 *
 * @param avatarUrls, optional, List of the project's avatars, returning the avatar size and associated URL.
 * @param expand, optional, Expand options that include additional project issue create metadata details in the response.
 * @param id, optional, The ID of the project.
 * @param issuetypes, optional, List of the issue types supported by the project.
 * @param key, optional, The key of the project.
 * @param name, optional, The name of the project.
 * @param self, optional, The URL of the project.
 */
@Serializable
data class ProjectIssueCreateMetadata(
    @SerialName("avatarUrls") val avatarUrls: AvatarUrlsBean? = null,
    @SerialName("expand") val expand: String? = null,
    @SerialName("id") val id: String? = null,
    @SerialName("issuetypes") val issuetypes: List<IssueTypeIssueCreateMetadata>? = null,
    @SerialName("key") val key: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("self") val self: String? = null
)