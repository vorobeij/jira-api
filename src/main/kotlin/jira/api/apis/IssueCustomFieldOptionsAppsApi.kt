/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.apis

import jira.api.models.IssueFieldOption
import jira.api.models.IssueFieldOptionCreateBean
import jira.api.models.PageBeanIssueFieldOption
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface IssueCustomFieldOptionsAppsApi {

    /**
     * POST /rest/api/3/field/{fieldKey}/option
     *
     * Creates an option for a select list issue field.

    Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.

    Each field can have a maximum of 10000 options, and each option can have a maximum of 10000 scopes.

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
     * @param fieldKey The field key is specified in the following format: **$(app-key)\_\_$(field-key)**. For example, *example-add-on\_\_example-issue-field*. To determine the `fieldKey` value, do one of the following:

     *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the `jiraIssueFields` module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.
     *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in `key`. For example, `"key": "teams-add-on__team-issue-field"`  (example: null)
     * @param issueFieldOptionCreateBean, request body
     *
     * @return IssueFieldOption
     */
    @POST("/rest/api/3/field/{fieldKey}/option")
    suspend fun createIssueFieldOption(
        @Body fieldKey: String,
        @Body issueFieldOptionCreateBean: IssueFieldOptionCreateBean
    ): IssueFieldOption

    /**
     * GET /rest/api/3/field/{fieldKey}/option
     *
     * Returns a [paginated](#pagination) list of all the options of a select list issue field. A select list issue field is a type of [issue field](https://developer.atlassian.com/cloud/jira/platform/modules/issue-field/) that enables a user to select a value from a list of options.

    Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
     * @param startAt The index of the first item to return in a page of results (page offset). (optional) (example: null)
     * @param maxResults The maximum number of items to return per page. (optional) (example: null)
     * @param fieldKey The field key is specified in the following format: **$(app-key)\_\_$(field-key)**. For example, *example-add-on\_\_example-issue-field*. To determine the `fieldKey` value, do one of the following:

     *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the `jiraIssueFields` module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.
     *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in `key`. For example, `"key": "teams-add-on__team-issue-field"`  (example: null)
     *
     * @return PageBeanIssueFieldOption
     */
    @GET("/rest/api/3/field/{fieldKey}/option")
    suspend fun getAllIssueFieldOptions(
        @Query("startAt") startAt: Long = 0,
        @Query("maxResults") maxResults: Int = 50,
        @Body fieldKey: String
    ): PageBeanIssueFieldOption

    /**
     * GET /rest/api/3/field/{fieldKey}/option/{optionId}
     *
     * Returns an option from a select list issue field.

    Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
     * @param fieldKey The field key is specified in the following format: **$(app-key)\_\_$(field-key)**. For example, *example-add-on\_\_example-issue-field*. To determine the `fieldKey` value, do one of the following:

     *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the `jiraIssueFields` module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.
     *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in `key`. For example, `"key": "teams-add-on__team-issue-field"`  (example: null)
     * @param optionId The ID of the option to be returned.  (example: null)
     *
     * @return IssueFieldOption
     */
    @GET("/rest/api/3/field/{fieldKey}/option/{optionId}")
    suspend fun getIssueFieldOption(
        @Body fieldKey: String,
        @Body optionId: Long
    ): IssueFieldOption

    /**
     * GET /rest/api/3/field/{fieldKey}/option/suggestions/edit
     *
     * Returns a [paginated](#pagination) list of options for a select list issue field that can be viewed and selected by the user.

    Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.

     **[Permissions](#permissions) required:** Permission to access Jira.
     * @param startAt The index of the first item to return in a page of results (page offset). (optional) (example: null)
     * @param maxResults The maximum number of items to return per page. (optional) (example: null)
     * @param projectId Filters the results to options that are only available in the specified project. (optional) (example: null)
     * @param fieldKey The field key is specified in the following format: **$(app-key)\_\_$(field-key)**. For example, *example-add-on\_\_example-issue-field*. To determine the `fieldKey` value, do one of the following:

     *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the `jiraIssueFields` module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.
     *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in `key`. For example, `"key": "teams-add-on__team-issue-field"`  (example: null)
     *
     * @return PageBeanIssueFieldOption
     */
    @GET("/rest/api/3/field/{fieldKey}/option/suggestions/edit")
    suspend fun getSelectableIssueFieldOptions(
        @Query("startAt") startAt: Long = 0,
        @Query("maxResults") maxResults: Int = 50,
        @Query("projectId") projectId: Long? = null,
        @Body fieldKey: String
    ): PageBeanIssueFieldOption

    /**
     * GET /rest/api/3/field/{fieldKey}/option/suggestions/search
     *
     * Returns a [paginated](#pagination) list of options for a select list issue field that can be viewed by the user.

    Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.

     **[Permissions](#permissions) required:** Permission to access Jira.
     * @param startAt The index of the first item to return in a page of results (page offset). (optional) (example: null)
     * @param maxResults The maximum number of items to return per page. (optional) (example: null)
     * @param projectId Filters the results to options that are only available in the specified project. (optional) (example: null)
     * @param fieldKey The field key is specified in the following format: **$(app-key)\_\_$(field-key)**. For example, *example-add-on\_\_example-issue-field*. To determine the `fieldKey` value, do one of the following:

     *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the `jiraIssueFields` module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.
     *  run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in `key`. For example, `"key": "teams-add-on__team-issue-field"`  (example: null)
     *
     * @return PageBeanIssueFieldOption
     */
    @GET("/rest/api/3/field/{fieldKey}/option/suggestions/search")
    suspend fun getVisibleIssueFieldOptions(
        @Query("startAt") startAt: Long = 0,
        @Query("maxResults") maxResults: Int = 50,
        @Query("projectId") projectId: Long? = null,
        @Body fieldKey: String
    ): PageBeanIssueFieldOption
}