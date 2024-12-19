/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.apis

import jira.api.models.ConfigurationsListParameters
import jira.api.models.PageBeanBulkContextualConfiguration
import jira.api.models.PageBeanContextualConfiguration
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface IssueCustomFieldConfigurationAppsApi {

    /**
     * GET /rest/api/3/app/field/{fieldIdOrKey}/context/configuration
     *
     * Returns a [paginated](#pagination) list of configurations for a custom field of a [type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field-type/) created by a [Forge app](https://developer.atlassian.com/platform/forge/).

    The result can be filtered by one of these criteria:

     *  `id`.
     *  `fieldContextId`.
     *  `issueId`.
     *  `projectKeyOrId` and `issueTypeId`.

    Otherwise, all configurations are returned.

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that provided the custom field type.
     * @param fieldIdOrKey The ID or key of the custom field, for example `customfield_10000`.  (example: null)
     * @param id The list of configuration IDs. To include multiple configurations, separate IDs with an ampersand: `id=10000&id=10001`. Can't be provided with `fieldContextId`, `issueId`, `projectKeyOrId`, or `issueTypeId`. (optional) (example: null)
     * @param fieldContextId The list of field context IDs. To include multiple field contexts, separate IDs with an ampersand: `fieldContextId=10000&fieldContextId=10001`. Can't be provided with `id`, `issueId`, `projectKeyOrId`, or `issueTypeId`. (optional) (example: null)
     * @param issueId The ID of the issue to filter results by. If the issue doesn't exist, an empty list is returned. Can't be provided with `projectKeyOrId`, or `issueTypeId`. (optional) (example: null)
     * @param projectKeyOrId The ID or key of the project to filter results by. Must be provided with `issueTypeId`. Can't be provided with `issueId`. (optional) (example: null)
     * @param issueTypeId The ID of the issue type to filter results by. Must be provided with `projectKeyOrId`. Can't be provided with `issueId`. (optional) (example: null)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional) (example: null)
     * @param maxResults The maximum number of items to return per page. (optional) (example: null)
     *
     * @return PageBeanContextualConfiguration
     */
    @GET("/rest/api/3/app/field/{fieldIdOrKey}/context/configuration")
    suspend fun getCustomFieldConfiguration(
        @Body fieldIdOrKey: String,
        @Query("id") id: List<Long>? = null,
        @Query("fieldContextId") fieldContextId: List<Long>? = null,
        @Query("issueId") issueId: Long? = null,
        @Query("projectKeyOrId") projectKeyOrId: String? = null,
        @Query("issueTypeId") issueTypeId: String? = null,
        @Query("startAt") startAt: Long = 0,
        @Query("maxResults") maxResults: Int = 100
    ): PageBeanContextualConfiguration

    /**
     * POST /rest/api/3/app/field/context/configuration/list
     *
     * Returns a [paginated](#pagination) list of configurations for list of custom fields of a [type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field-type/) created by a [Forge app](https://developer.atlassian.com/platform/forge/).

    The result can be filtered by one of these criteria:

     *  `id`.
     *  `fieldContextId`.
     *  `issueId`.
     *  `projectKeyOrId` and `issueTypeId`.

    Otherwise, all configurations for the provided list of custom fields are returned.

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that provided the custom field type.
     * @param id The list of configuration IDs. To include multiple configurations, separate IDs with an ampersand: `id=10000&id=10001`. Can't be provided with `fieldContextId`, `issueId`, `projectKeyOrId`, or `issueTypeId`. (optional) (example: null)
     * @param fieldContextId The list of field context IDs. To include multiple field contexts, separate IDs with an ampersand: `fieldContextId=10000&fieldContextId=10001`. Can't be provided with `id`, `issueId`, `projectKeyOrId`, or `issueTypeId`. (optional) (example: null)
     * @param issueId The ID of the issue to filter results by. If the issue doesn't exist, an empty list is returned. Can't be provided with `projectKeyOrId`, or `issueTypeId`. (optional) (example: null)
     * @param projectKeyOrId The ID or key of the project to filter results by. Must be provided with `issueTypeId`. Can't be provided with `issueId`. (optional) (example: null)
     * @param issueTypeId The ID of the issue type to filter results by. Must be provided with `projectKeyOrId`. Can't be provided with `issueId`. (optional) (example: null)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional) (example: null)
     * @param maxResults The maximum number of items to return per page. (optional) (example: null)
     * @param configurationsListParameters, request body
     *
     * @return PageBeanBulkContextualConfiguration
     */
    @POST("/rest/api/3/app/field/context/configuration/list")
    suspend fun getCustomFieldsConfigurations(
        @Query("id") id: List<Long>? = null,
        @Query("fieldContextId") fieldContextId: List<Long>? = null,
        @Query("issueId") issueId: Long? = null,
        @Query("projectKeyOrId") projectKeyOrId: String? = null,
        @Query("issueTypeId") issueTypeId: String? = null,
        @Query("startAt") startAt: Long = 0,
        @Query("maxResults") maxResults: Int = 100,
        @Body configurationsListParameters: ConfigurationsListParameters
    ): PageBeanBulkContextualConfiguration
}