/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of an issue type hierarchy level.
 *
 * @param entityId, optional, The ID of the issue type hierarchy level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
 * @param issueTypes, optional, The list of issue types in the hierarchy level.
 * @param level, optional, The level of the issue type hierarchy level.
 * @param name, optional, The name of the issue type hierarchy level.
 */
@Serializable
data class ProjectIssueTypesHierarchyLevel(
    @SerialName("entityId") val entityId: String? = null,
    @SerialName("issueTypes") val issueTypes: List<IssueTypeInfo>? = null,
    @SerialName("level") val level: Int? = null,
    @SerialName("name") val name: String? = null
)