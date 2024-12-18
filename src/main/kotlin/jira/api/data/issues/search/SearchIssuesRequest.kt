package jira.api.data.issues.search

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchIssuesRequest(
    @SerialName("expand") val expand: String? = null,
    @SerialName("fields") val fields: List<String>? = null,
    @SerialName("fieldsByKeys") val fieldsByKeys: Boolean? = null,
    @SerialName("jql") val jql: String? = null,
    @SerialName("maxResults") val maxResults: Int? = null,
    @SerialName("nextPageToken") val nextPageToken: String? = null,
    @SerialName("properties") val properties: List<String>? = null,
    @SerialName("reconcileIssues") val reconcileIssues: List<Int>? = null
)


