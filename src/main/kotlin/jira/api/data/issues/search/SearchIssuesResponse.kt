package jira.api.data.issues.search

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchIssuesResponse(
    @SerialName("issues") val issues: List<Issue> = listOf()
)

@Serializable
data class Issue(
    @SerialName("expand") val expand: String? = "",
    @SerialName("fields") val fields: Fields? = Fields(),
    @SerialName("id") val id: String? = "",
    @SerialName("key") val key: String? = "",
    @SerialName("self") val self: String? = ""
)

@Serializable
data class Fields(
    @SerialName("watcher") val watcher: Watcher? = Watcher(),
    @SerialName("attachment") val attachment: List<Attachment>? = listOf(),
    @SerialName("sub-tasks") val subTasks: List<SubTask>? = listOf(),
    @SerialName("description") val description: String? = "",
    @SerialName("project") val project: Project? = Project(),
    @SerialName("comment") val comment: List<Comment>? = listOf(),
    @SerialName("issuelinks") val issuelinks: List<Issuelink>? = listOf(),
    @SerialName("worklog") val worklog: List<Worklog>? = listOf(),
    @SerialName("updated") val updated: Int? = 0,
    @SerialName("timetracking") val timetracking: Timetracking? = Timetracking()
)

@Serializable
data class Watcher(
    @SerialName("isWatching") val isWatching: Boolean? = null,
    @SerialName("self") val self: String? = null,
    @SerialName("watchCount") val watchCount: Int? = null
)

@Serializable
data class Attachment(
    @SerialName("author") val author: Author? = null,
    @SerialName("content") val content: String? = null,
    @SerialName("created") val created: String? = null,
    @SerialName("filename") val filename: String? = null,
    @SerialName("id") val id: Int? = null,
    @SerialName("mimeType") val mimeType: String? = null,
    @SerialName("self") val self: String? = null,
    @SerialName("size") val size: Int? = null
)

@Serializable
data class SubTask(
    @SerialName("id") val id: String? = "",
    @SerialName("outwardIssue") val outwardIssue: OutwardIssue? = OutwardIssue(),
    @SerialName("type") val type: Type? = Type()
)

@Serializable
data class Project(
    @SerialName("avatarUrls") val avatarUrls: AvatarUrls? = AvatarUrls(),
    @SerialName("id") val id: String? = "",
    @SerialName("insight") val insight: Insight? = Insight(),
    @SerialName("key") val key: String? = "",
    @SerialName("name") val name: String? = "",
    @SerialName("projectCategory") val projectCategory: ProjectCategory? = ProjectCategory(),
    @SerialName("self") val self: String? = "",
    @SerialName("simplified") val simplified: Boolean? = false,
    @SerialName("style") val style: String? = ""
)

@Serializable
data class Comment(
    @SerialName("author") val author: Author? = Author(),
    @SerialName("body") val body: String? = "",
    @SerialName("created") val created: String? = "",
    @SerialName("id") val id: String? = "",
    @SerialName("self") val self: String? = "",
    @SerialName("updateAuthor") val updateAuthor: Author? = Author(),
    @SerialName("updated") val updated: String? = "",
    @SerialName("visibility") val visibility: Visibility? = Visibility()
)

@Serializable
data class Issuelink(
    @SerialName("id") val id: String? = "",
    @SerialName("outwardIssue") val outwardIssue: OutwardIssue? = null,
    @SerialName("type") val type: Type? = Type(),
    @SerialName("inwardIssue") val inwardIssue: InwardIssue? = InwardIssue()
)

@Serializable
data class Worklog(
    @SerialName("author") val author: Author?,
    @SerialName("comment") val comment: String? = "",
    @SerialName("id") val id: String? = "",
    @SerialName("issueId") val issueId: String? = "",
    @SerialName("self") val self: String? = "",
    @SerialName("started") val started: String? = "",
    @SerialName("timeSpent") val timeSpent: String? = "",
    @SerialName("timeSpentSeconds") val timeSpentSeconds: Int? = 0,
    @SerialName("updateAuthor") val updateAuthor: Author?,
    @SerialName("updated") val updated: String? = "",
    @SerialName("visibility") val visibility: Visibility? = Visibility()
)

@Serializable
data class Timetracking(
    @SerialName("originalEstimate") val originalEstimate: String? = null,
    @SerialName("originalEstimateSeconds") val originalEstimateSeconds: Int? = null,
    @SerialName("remainingEstimate") val remainingEstimate: String? = null,
    @SerialName("remainingEstimateSeconds") val remainingEstimateSeconds: Int? = null,
    @SerialName("timeSpent") val timeSpent: String? = null,
    @SerialName("timeSpentSeconds") val timeSpentSeconds: Int? = null
)

@Serializable
data class Author(
    @SerialName("accountId") val accountId: String? = null,
    @SerialName("accountType") val accountType: String? = null,
    @SerialName("active") val active: Boolean? = null,
    @SerialName("avatarUrls") val avatarUrls: AvatarUrls? = null,
    @SerialName("displayName") val displayName: String? = null,
    @SerialName("key") val key: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("self") val self: String? = null
)

@Serializable
data class AvatarUrls(
    @SerialName("16x16") val x16: String? = null,
    @SerialName("24x24") val x24: String? = null,
    @SerialName("32x32") val x32: String? = null,
    @SerialName("48x48") val x48: String? = null
)

@Serializable
data class OutwardIssue(
    @SerialName("fields") val fields: Fields? = Fields(),
    @SerialName("id") val id: String? = "",
    @SerialName("key") val key: String? = "",
    @SerialName("self") val self: String? = ""
)

@Serializable
data class Type(
    @SerialName("id") val id: String? = null,
    @SerialName("inward") val inward: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("outward") val outward: String? = null
)

@Serializable
data class Status(
    @SerialName("iconUrl") val iconUrl: String? = null,
    @SerialName("name") val name: String? = null
)

@Serializable
data class Insight(
    @SerialName("lastIssueUpdateTime") val lastIssueUpdateTime: String? = null,
    @SerialName("totalIssueCount") val totalIssueCount: Int? = null
)

@Serializable
data class ProjectCategory(
    @SerialName("description") val description: String? = null,
    @SerialName("id") val id: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("self") val self: String? = null
)

@Serializable
data class Visibility(
    @SerialName("identifier") val identifier: String? = null,
    @SerialName("type") val type: String? = null,
    @SerialName("value") val value: String? = null
)

@Serializable
data class InwardIssue(
    @SerialName("fields") val fields: Fields? = null,
    @SerialName("id") val id: String? = "",
    @SerialName("key") val key: String? = "",
    @SerialName("self") val self: String? = ""
)



