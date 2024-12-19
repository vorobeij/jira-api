/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * Details about a project.
 *
 * @param archived, optional, Whether the project is archived.
 * @param archivedBy, optional, The user who archived the project.
 * @param archivedDate, optional, The date when the project was archived.
 * @param assigneeType, optional, The default assignee when creating issues for this project.
 * @param avatarUrls, optional, The URLs of the project's avatars.
 * @param components, optional, List of the components contained in the project.
 * @param deleted, optional, Whether the project is marked as deleted.
 * @param deletedBy, optional, The user who marked the project as deleted.
 * @param deletedDate, optional, The date when the project was marked as deleted.
 * @param description, optional, A brief description of the project.
 * @param email, optional, An email address associated with the project.
 * @param expand, optional, Expand options that include additional project details in the response.
 * @param favourite, optional, Whether the project is selected as a favorite.
 * @param id, optional, The ID of the project.
 * @param insight, optional, Insights about the project.
 * @param isPrivate, optional, Whether the project is private from the user's perspective. This means the user can't see the project or any associated issues.
 * @param issueTypeHierarchy, optional, The issue type hierarchy for the project.
 * @param issueTypes, optional, List of the issue types available in the project.
 * @param key, optional, The key of the project.
 * @param landingPageInfo, optional, The project landing page info.
 * @param lead, optional, The username of the project lead.
 * @param name, optional, The name of the project.
 * @param permissions, optional, User permissions on the project
 * @param projectCategory, optional, The category the project belongs to.
 * @param projectTypeKey, optional, The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
 * @param properties, optional, Map of project properties
 * @param retentionTillDate, optional, The date when the project is deleted permanently.
 * @param roles, optional, The name and self URL for each role defined in the project. For more information, see [Create project role](#api-rest-api-3-role-post).
 * @param self, optional, The URL of the project details.
 * @param simplified, optional, Whether the project is simplified.
 * @param style, optional, The type of the project.
 * @param url, optional, A link to information about this project, such as project documentation.
 * @param uuid, optional, Unique ID for next-gen projects.
 * @param versions, optional, The versions defined in the project. For more information, see [Create version](#api-rest-api-3-version-post).
 */
@Serializable
data class Project(
    @SerialName("archived") val archived: Boolean? = null,
    @SerialName("archivedBy") val archivedBy: archivedBy? = null,
    @SerialName("archivedDate") val archivedDate: String? = null,
    @SerialName("assigneeType") val assigneeType: String? = null,
    @SerialName("avatarUrls") val avatarUrls: avatarUrls? = null,
    @SerialName("components") val components: List<ProjectComponent>? = null,
    @SerialName("deleted") val deleted: Boolean? = null,
    @SerialName("deletedBy") val deletedBy: deletedBy? = null,
    @SerialName("deletedDate") val deletedDate: String? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("email") val email: String? = null,
    @SerialName("expand") val expand: String? = null,
    @SerialName("favourite") val favourite: Boolean? = null,
    @SerialName("id") val id: String? = null,
    @SerialName("insight") val insight: insight? = null,
    @SerialName("isPrivate") val isPrivate: Boolean? = null,
    @SerialName("issueTypeHierarchy") val issueTypeHierarchy: issueTypeHierarchy? = null,
    @SerialName("issueTypes") val issueTypes: List<IssueTypeDetails>? = null,
    @SerialName("key") val key: String? = null,
    @SerialName("landingPageInfo") val landingPageInfo: landingPageInfo? = null,
    @SerialName("lead") val lead: lead? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("permissions") val permissions: permissions? = null,
    @SerialName("projectCategory") val projectCategory: projectCategory? = null,
    @SerialName("projectTypeKey") val projectTypeKey: String? = null,
    @SerialName("properties") val properties: properties? = null,
    @SerialName("retentionTillDate") val retentionTillDate: String? = null,
    @SerialName("roles") val roles: roles? = null,
    @SerialName("self") val self: String? = null,
    @SerialName("simplified") val simplified: Boolean? = null,
    @SerialName("style") val style: String? = null,
    @SerialName("url") val url: String? = null,
    @SerialName("uuid") val uuid: String? = null,
    @SerialName("versions") val versions: List<Version>? = null
)