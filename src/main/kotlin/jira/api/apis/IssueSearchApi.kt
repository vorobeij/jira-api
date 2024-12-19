/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.apis

import jira.api.models.IdSearchRequestBean
import jira.api.models.IdSearchResults
import jira.api.models.IssueMatches
import jira.api.models.IssuePickerSuggestions
import jira.api.models.IssuesAndJQLQueries
import jira.api.models.JQLCountRequestBean
import jira.api.models.JQLCountResultsBean
import jira.api.models.SearchAndReconcileRequestBean
import jira.api.models.SearchAndReconcileResults
import jira.api.models.SearchRequestBean
import jira.api.models.SearchResults
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface IssueSearchApi {

    /**
     * POST /rest/api/3/search/approximate-count
     *
     * Provide an estimated count of the issues that match the [JQL](https://confluence.atlassian.com/x/egORLQ). Recent updates might not be immediately visible in the returned output. This endpoint requires JQL to be bounded.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** Issues are included in the response where the user has:

     *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.
     *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * @param jQLCountRequestBean, request body
     *
     * @return JQLCountResultsBean
     */
    @POST("/rest/api/3/search/approximate-count")
    suspend fun countIssues(
        @Body jQLCountRequestBean: JQLCountRequestBean
    ): JQLCountResultsBean

    /**
     * GET /rest/api/3/issue/picker
     *
     * Returns lists of issues matching a query string. Use this resource to provide auto-completion suggestions when the user is looking for an issue using a word or string.

    This operation returns two lists:

     *  `History Search` which includes issues from the user's history of created, edited, or viewed issues that contain the string in the `query` parameter.
     *  `Current Search` which includes issues that match the JQL expression in `currentJQL` and contain the string in the `query` parameter.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** None.
     * @param query A string to match against text fields in the issue such as title, description, or comments. (optional) (example: query)
     * @param currentJQL A JQL query defining a list of issues to search for the query term. Note that `username` and `userkey` cannot be used as search terms for this parameter, due to privacy reasons. Use `accountId` instead. (optional) (example: null)
     * @param currentIssueKey The key of an issue to exclude from search results. For example, the issue the user is viewing when they perform this query. (optional) (example: null)
     * @param currentProjectId The ID of a project that suggested issues must belong to. (optional) (example: null)
     * @param showSubTasks Indicate whether to include subtasks in the suggestions list. (optional) (example: null)
     * @param showSubTaskParent When `currentIssueKey` is a subtask, whether to include the parent issue in the suggestions if it matches the query. (optional) (example: null)
     *
     * @return IssuePickerSuggestions
     */
    @GET("/rest/api/3/issue/picker")
    suspend fun getIssuePickerResource(
        @Query("query") query: String? = null,
        @Query("currentJQL") currentJQL: String? = null,
        @Query("currentIssueKey") currentIssueKey: String? = null,
        @Query("currentProjectId") currentProjectId: String? = null,
        @Query("showSubTasks") showSubTasks: Boolean? = null,
        @Query("showSubTaskParent") showSubTaskParent: Boolean? = null
    ): IssuePickerSuggestions

    /**
     * POST /rest/api/3/jql/match
     *
     * Checks whether one or more issues would be returned by one or more JQL queries.

     **[Permissions](#permissions) required:** None, however, issues are only matched against JQL queries where the user has:

     *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * @param issuesAndJQLQueries, request body
     *
     * @return IssueMatches
     */
    @POST("/rest/api/3/jql/match")
    suspend fun matchIssues(
        @Body issuesAndJQLQueries: IssuesAndJQLQueries
    ): IssueMatches

    /**
     * GET /rest/api/3/search/jql
     *
     * Searches for issues using [JQL](https://confluence.atlassian.com/x/egORLQ). Recent updates might not be immediately visible in the returned search results. If you need [read-after-write](https://developer.atlassian.com/cloud/jira/platform/search-and-reconcile/) consistency, you can utilize the `reconcileIssues` parameter to ensure stronger consistency assurances. This operation can be accessed anonymously.

    If the JQL query expression is too large to be encoded as a query parameter, use the [POST](#api-rest-api-3-search-post) version of this resource.

     **[Permissions](#permissions) required:** Issues are included in the response where the user has:

     *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.
     *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * @param jql A [JQL](https://confluence.atlassian.com/x/egORLQ) expression. For performance reasons, this field requires a bounded query. A bounded query is a query with a search restriction.

     *  Example of an unbounded query: `order by key desc`.
     *  Example of a bounded query: `assignee = currentUser() order by key`. (optional) (example: project = HSP)
     * @param nextPageToken The token for a page to fetch that is not the first page. The first page has a `nextPageToken` of `null`. Use the `nextPageToken` to fetch the next page of issues. (optional) (example: <string>)
     * @param maxResults The maximum number of items to return. Depending on search criteria, real number of items returned may be smaller. It returns max 5000 issues. (optional) (example: 114)
     * @param fields A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:

     *  `*all` Returns all fields.
     *  `*navigable` Returns navigable fields.
     *  `id` Returns only issue IDs.
     *  Any issue field, prefixed with a minus to exclude.

    The default is `id`.

    Examples:

     *  `summary,comment` Returns only the summary and comments fields only.
     *  `-description` Returns all navigable (default) fields except description.
     *  `*all,-comment` Returns all fields except comments.

    Multiple `fields` parameters can be included in a request.

    Note: By default, this resource returns IDs only. This differs from [GET issue](#api-rest-api-3-issue-issueIdOrKey-get) where the default is all fields. (optional) (example: null)
     * @param expand Use [expand](#expansion) to include additional information about issues in the response. Note that, unlike the majority of instances where `expand` is specified, `expand` is defined as a list of values. The expand options are:

     *  `renderedFields` Returns field values rendered in HTML format.
     *  `names` Returns the display name of each field.
     *  `schema` Returns the schema describing a field type.
     *  `transitions` Returns all possible transitions for the issue.
     *  `operations` Returns all possible operations for the issue.
     *  `editmeta` Returns information about how each field can be edited.
     *  `changelog` Returns a list of recent updates to an issue, sorted by date, starting from the most recent.
     *  `versionedRepresentations` Instead of `fields`, returns `versionedRepresentations` a JSON array containing each version of a field's value, with the highest numbered item representing the most recent version. (optional) (example: <string>)
     * @param properties A list of up to 5 issue properties to include in the results. This parameter accepts a comma-separated list. (optional) (example: null)
     * @param fieldsByKeys Reference fields by their key (rather than ID). The default is `false`. (optional) (example: null)
     * @param failFast Fail this request early if we can't retrieve all field data. (optional) (example: null)
     * @param reconcileIssues Strong consistency issue ids to be reconciled with search results. Accepts max 50 ids. All issues must exist. (optional) (example: null)
     *
     * @return SearchAndReconcileResults
     */
    @GET("/rest/api/3/search/jql")
    suspend fun searchAndReconsileIssuesUsingJql(
        @Query("jql") jql: String? = null,
        @Query("nextPageToken") nextPageToken: String? = null,
        @Query("maxResults") maxResults: Int = 50,
        @Query("fields") fields: List<String>? = null,
        @Query("expand") expand: String? = null,
        @Query("properties") properties: List<String>? = null,
        @Query("fieldsByKeys") fieldsByKeys: Boolean = false,
        @Query("failFast") failFast: Boolean = false,
        @Query("reconcileIssues") reconcileIssues: List<Long>? = null
    ): SearchAndReconcileResults

    /**
     * POST /rest/api/3/search/jql
     *
     * Searches for issues using [JQL](https://confluence.atlassian.com/x/egORLQ). Recent updates might not be immediately visible in the returned search results. If you need [read-after-write](https://developer.atlassian.com/cloud/jira/platform/search-and-reconcile/) consistency, you can utilize the `reconcileIssues` parameter to ensure stronger consistency assurances. This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** Issues are included in the response where the user has:

     *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.
     *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * @param searchAndReconcileRequestBean, request body
     *
     * @return SearchAndReconcileResults
     */
    @POST("/rest/api/3/search/jql")
    suspend fun searchAndReconsileIssuesUsingJqlPost(
        @Body searchAndReconcileRequestBean: SearchAndReconcileRequestBean
    ): SearchAndReconcileResults

    /**
     * POST /rest/api/3/search/id
     *
     * Searches for IDs of issues using [JQL](https://confluence.atlassian.com/x/egORLQ).

    Use the [Search](#api-rest-api-3-search-post) endpoint if you need to fetch more than just issue IDs. The Search endpoint returns more information, but may take much longer to respond to requests. This is because it uses a different mechanism for ordering results than this endpoint and doesn't provide the total number of results for your query.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** Issues are included in the response where the user has:

     *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.
     *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * @param idSearchRequestBean, request body
     *
     * @return IdSearchResults
     */
    @POST("/rest/api/3/search/id")
    suspend fun searchForIssuesIds(
        @Body idSearchRequestBean: IdSearchRequestBean
    ): IdSearchResults

    /**
     * GET /rest/api/3/search
     *
     * Searches for issues using [JQL](https://confluence.atlassian.com/x/egORLQ).

    If the JQL query expression is too large to be encoded as a query parameter, use the [POST](#api-rest-api-3-search-post) version of this resource.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** Issues are included in the response where the user has:

     *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.
     *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * @param jql The [JQL](https://confluence.atlassian.com/x/egORLQ) that defines the search. Note:

     *  If no JQL expression is provided, all issues are returned.
     *  `username` and `userkey` cannot be used as search terms due to privacy reasons. Use `accountId` instead.
     *  If a user has hidden their email address in their user profile, partial matches of the email address will not find the user. An exact match is required. (optional) (example: project = HSP)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional) (example: null)
     * @param maxResults The maximum number of items to return per page. To manage page size, Jira may return fewer items per page where a large number of fields are requested. The greatest number of items returned per page is achieved when requesting `id` or `key` only. (optional) (example: null)
     * @param validateQuery Determines how to validate the JQL query and treat the validation results. Supported values are:

     *  `strict` Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).
     *  `warn` Returns all errors as warnings.
     *  `none` No validation is performed.
     *  `true` *Deprecated* A legacy synonym for `strict`.
     *  `false` *Deprecated* A legacy synonym for `warn`.

    Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the `validateQuery` value. (optional) (example: null)
     * @param fields A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:

     *  `*all` Returns all fields.
     *  `*navigable` Returns navigable fields.
     *  Any issue field, prefixed with a minus to exclude.

    Examples:

     *  `summary,comment` Returns only the summary and comments fields.
     *  `-description` Returns all navigable (default) fields except description.
     *  `*all,-comment` Returns all fields except comments.

    This parameter may be specified multiple times. For example, `fields=field1,field2&fields=field3`.

    Note: All navigable fields are returned by default. This differs from [GET issue](#api-rest-api-3-issue-issueIdOrKey-get) where the default is all fields. (optional) (example: null)
     * @param expand Use [expand](#expansion) to include additional information about issues in the response. This parameter accepts a comma-separated list. Expand options include:

     *  `renderedFields` Returns field values rendered in HTML format.
     *  `names` Returns the display name of each field.
     *  `schema` Returns the schema describing a field type.
     *  `transitions` Returns all possible transitions for the issue.
     *  `operations` Returns all possible operations for the issue.
     *  `editmeta` Returns information about how each field can be edited.
     *  `changelog` Returns a list of recent updates to an issue, sorted by date, starting from the most recent.
     *  `versionedRepresentations` Instead of `fields`, returns `versionedRepresentations` a JSON array containing each version of a field's value, with the highest numbered item representing the most recent version. (optional) (example: null)
     * @param properties A list of issue property keys for issue properties to include in the results. This parameter accepts a comma-separated list. Multiple properties can also be provided using an ampersand separated list. For example, `properties=prop1,prop2&properties=prop3`. A maximum of 5 issue property keys can be specified. (optional) (example: null)
     * @param fieldsByKeys Reference fields by their key (rather than ID). (optional) (example: null)
     * @param failFast Whether to fail the request quickly in case of an error while loading fields for an issue. For `failFast=true`, if one field fails, the entire operation fails. For `failFast=false`, the operation will continue even if a field fails. It will return a valid response, but without values for the failed field(s). (optional) (example: null)
     *
     * @return SearchResults
     */
    @GET("/rest/api/3/search")
    suspend fun searchForIssuesUsingJql(
        @Query("jql") jql: String? = null,
        @Query("startAt") startAt: Int = 0,
        @Query("maxResults") maxResults: Int = 50,
        @Query("validateQuery") validateQuery: String = "strict",
        @Query("fields") fields: List<String>? = null,
        @Query("expand") expand: String? = null,
        @Query("properties") properties: List<String>? = null,
        @Query("fieldsByKeys") fieldsByKeys: Boolean = false,
        @Query("failFast") failFast: Boolean = false
    ): SearchResults

    /**
     * POST /rest/api/3/search
     *
     * Searches for issues using [JQL](https://confluence.atlassian.com/x/egORLQ).

    There is a [GET](#api-rest-api-3-search-get) version of this resource that can be used for smaller JQL query expressions.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** Issues are included in the response where the user has:

     *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.
     *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * @param searchRequestBean, request body
     *
     * @return SearchResults
     */
    @POST("/rest/api/3/search")
    suspend fun searchForIssuesUsingJqlPost(
        @Body searchRequestBean: SearchRequestBean
    ): SearchResults
}