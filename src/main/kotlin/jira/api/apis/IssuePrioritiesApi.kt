/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.apis

import jira.api.models.CreatePriorityDetails
import jira.api.models.PageBeanPriority
import jira.api.models.Priority
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface IssuePrioritiesApi {

    /**
     * POST /rest/api/3/priority
     *
     * Creates an issue priority.

    Deprecation applies to iconUrl param in request body which will be sunset on 16th Mar 2025. For more details refer to [changelog](https://developer.atlassian.com/changelog/#CHANGE-1525).

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param createPriorityDetails, request body
     *
     * @return Unit
     */
    @POST("/rest/api/3/priority")
    suspend fun createPriority(
        @Body createPriorityDetails: CreatePriorityDetails
    ): Unit

    /**
     * GET /rest/api/3/priority
     *
     * Returns the list of all issue priorities.

     **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @return List<Priority>
     */
    @GET("/rest/api/3/priority")
    suspend fun getPriorities(): List<Priority>

    /**
     * GET /rest/api/3/priority/{id}
     *
     * Returns an issue priority.

     **[Permissions](#permissions) required:** Permission to access Jira.
     * @param id The ID of the issue priority.  (example: null)
     *
     * @return Priority
     */
    @GET("/rest/api/3/priority/{id}")
    suspend fun getPriority(
        @Body id: String
    ): Priority

    /**
     * GET /rest/api/3/priority/search
     *
     * Returns a [paginated](#pagination) list of priorities. The list can contain all priorities or a subset determined by any combination of these criteria:

     *  a list of priority IDs. Any invalid priority IDs are ignored.
     *  a list of project IDs. Only priorities that are available in these projects will be returned. Any invalid project IDs are ignored.
     *  whether the field configuration is a default. This returns priorities from company-managed (classic) projects only, as there is no concept of default priorities in team-managed projects.

     **[Permissions](#permissions) required:** Permission to access Jira.
     * @param startAt The index of the first item to return in a page of results (page offset). (optional) (example: null)
     * @param maxResults The maximum number of items to return per page. (optional) (example: null)
     * @param id The list of priority IDs. To include multiple IDs, provide an ampersand-separated list. For example, `id=2&id=3`. (optional) (example: null)
     * @param projectId The list of projects IDs. To include multiple IDs, provide an ampersand-separated list. For example, `projectId=10010&projectId=10111`. (optional) (example: null)
     * @param priorityName The name of priority to search for. (optional) (example: null)
     * @param onlyDefault Whether only the default priority is returned. (optional) (example: null)
     * @param expand Use `schemes` to return the associated priority schemes for each priority. Limited to returning first 15 priority schemes per priority. (optional) (example: null)
     *
     * @return PageBeanPriority
     */
    @GET("/rest/api/3/priority/search")
    suspend fun searchPriorities(
        @Query("startAt") startAt: String = 0,
        @Query("maxResults") maxResults: String = 50,
        @Query("id") id: List<String>? = null,
        @Query("projectId") projectId: List<String>? = null,
        @Query("priorityName") priorityName: String =,
        @Query("onlyDefault") onlyDefault: Boolean = false,
        @Query("expand") expand: String =
    ): PageBeanPriority
}