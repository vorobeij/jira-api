/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details about a project.
 *
 * @param avatarUrls, optional, The URLs of the project's avatars.
 * @param id, optional, The ID of the project.
 * @param key, optional, The key of the project.
 * @param name, optional, The name of the project.
 * @param projectCategory, optional, The category the project belongs to.
 * @param projectTypeKey, optional, The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
 * @param self, optional, The URL of the project details.
 * @param simplified, optional, Whether or not the project is simplified.
 */
@Serializable
data class ProjectDetails(
    @SerialName("avatarUrls") val avatarUrls: AvatarUrlsBean? = null,
    @SerialName("id") val id: String? = null,
    @SerialName("key") val key: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("projectCategory") val projectCategory: UpdatedProjectCategory? = null,
    @SerialName("projectTypeKey") val projectTypeKey: String? = null,
    @SerialName("self") val self: String? = null,
    @SerialName("simplified") val simplified: Boolean? = null
)