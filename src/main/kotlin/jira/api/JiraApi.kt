package jira.api

import jira.api.data.issues.search.SearchIssuesResponse
import retrofit2.http.POST

interface JiraApi {

    @POST("/rest/api/3/search/jql")
    suspend fun searchIssues(): Result<SearchIssuesResponse>
}
