/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.apis

import jira.api.models.CreateCustomFieldContext
import jira.api.models.IssueTypeIds
import jira.api.models.PageBeanContextForProjectAndIssueType
import jira.api.models.PageBeanCustomFieldContext
import jira.api.models.PageBeanCustomFieldContextDefaultValue
import jira.api.models.PageBeanCustomFieldContextProjectMapping
import jira.api.models.PageBeanIssueTypeToContextMapping
import jira.api.models.ProjectIds
import jira.api.models.ProjectIssueTypeMappings
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface IssueCustomFieldContextsApi {

    /**
     * POST /rest/api/3/field/{fieldId}/context
     *
     * Creates a custom field context.

    If `projectIds` is empty, a global context is created. A global context is one that applies to all project. If `issueTypeIds` is empty, the context applies to all issue types.

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param fieldId The ID of the custom field.  (example: null)
     * @param createCustomFieldContext, request body
     *
     * @return Unit
     */
    @POST("/rest/api/3/field/{fieldId}/context")
    suspend fun createCustomFieldContext(
        @Body fieldId: String,
        @Body createCustomFieldContext: CreateCustomFieldContext
    ): Unit

    /**
     * GET /rest/api/3/field/{fieldId}/context
     *
     * Returns a [paginated](#pagination) list of [ contexts](https://confluence.atlassian.com/adminjiracloud/what-are-custom-field-contexts-991923859.html) for a custom field. Contexts can be returned as follows:

     *  With no other parameters set, all contexts.
     *  By defining `id` only, all contexts from the list of IDs.
     *  By defining `isAnyIssueType`, limit the list of contexts returned to either those that apply to all issue types (true) or those that apply to only a subset of issue types (false)
     *  By defining `isGlobalContext`, limit the list of contexts return to either those that apply to all projects (global contexts) (true) or those that apply to only a subset of projects (false).

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param fieldId The ID of the custom field.  (example: null)
     * @param isAnyIssueType Whether to return contexts that apply to all issue types. (optional) (example: null)
     * @param isGlobalContext Whether to return contexts that apply to all projects. (optional) (example: null)
     * @param contextId The list of context IDs. To include multiple contexts, separate IDs with ampersand: `contextId=10000&contextId=10001`. (optional) (example: null)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional) (example: null)
     * @param maxResults The maximum number of items to return per page. (optional) (example: null)
     *
     * @return PageBeanCustomFieldContext
     */
    @GET("/rest/api/3/field/{fieldId}/context")
    suspend fun getContextsForField(
        @Body fieldId: String,
        @Query("isAnyIssueType") isAnyIssueType: Boolean? = null,
        @Query("isGlobalContext") isGlobalContext: Boolean? = null,
        @Query("contextId") contextId: List<Long>? = null,
        @Query("startAt") startAt: Long = 0,
        @Query("maxResults") maxResults: Int = 50
    ): PageBeanCustomFieldContext

    /**
     * POST /rest/api/3/field/{fieldId}/context/mapping
     *
     * Returns a [paginated](#pagination) list of project and issue type mappings and, for each mapping, the ID of a [custom field context](https://confluence.atlassian.com/x/k44fOw) that applies to the project and issue type.

    If there is no custom field context assigned to the project then, if present, the custom field context that applies to all projects is returned if it also applies to the issue type or all issue types. If a custom field context is not found, the returned custom field context ID is `null`.

    Duplicate project and issue type mappings cannot be provided in the request.

    The order of the returned values is the same as provided in the request.

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param fieldId The ID of the custom field.  (example: null)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional) (example: null)
     * @param maxResults The maximum number of items to return per page. (optional) (example: null)
     * @param projectIssueTypeMappings, request body
     *
     * @return PageBeanContextForProjectAndIssueType
     */
    @POST("/rest/api/3/field/{fieldId}/context/mapping")
    suspend fun getCustomFieldContextsForProjectsAndIssueTypes(
        @Body fieldId: String,
        @Query("startAt") startAt: Long = 0,
        @Query("maxResults") maxResults: Int = 50,
        @Body projectIssueTypeMappings: ProjectIssueTypeMappings
    ): PageBeanContextForProjectAndIssueType

    /**
     * GET /rest/api/3/field/{fieldId}/context/defaultValue
     *
     * Returns a [paginated](#pagination) list of defaults for a custom field. The results can be filtered by `contextId`, otherwise all values are returned. If no defaults are set for a context, nothing is returned.
    The returned object depends on type of the custom field:

     *  `CustomFieldContextDefaultValueDate` (type `datepicker`) for date fields.
     *  `CustomFieldContextDefaultValueDateTime` (type `datetimepicker`) for date-time fields.
     *  `CustomFieldContextDefaultValueSingleOption` (type `option.single`) for single choice select lists and radio buttons.
     *  `CustomFieldContextDefaultValueMultipleOption` (type `option.multiple`) for multiple choice select lists and checkboxes.
     *  `CustomFieldContextDefaultValueCascadingOption` (type `option.cascading`) for cascading select lists.
     *  `CustomFieldContextSingleUserPickerDefaults` (type `single.user.select`) for single users.
     *  `CustomFieldContextDefaultValueMultiUserPicker` (type `multi.user.select`) for user lists.
     *  `CustomFieldContextDefaultValueSingleGroupPicker` (type `grouppicker.single`) for single choice group pickers.
     *  `CustomFieldContextDefaultValueMultipleGroupPicker` (type `grouppicker.multiple`) for multiple choice group pickers.
     *  `CustomFieldContextDefaultValueURL` (type `url`) for URLs.
     *  `CustomFieldContextDefaultValueProject` (type `project`) for project pickers.
     *  `CustomFieldContextDefaultValueFloat` (type `float`) for floats (floating-point numbers).
     *  `CustomFieldContextDefaultValueLabels` (type `labels`) for labels.
     *  `CustomFieldContextDefaultValueTextField` (type `textfield`) for text fields.
     *  `CustomFieldContextDefaultValueTextArea` (type `textarea`) for text area fields.
     *  `CustomFieldContextDefaultValueReadOnly` (type `readonly`) for read only (text) fields.
     *  `CustomFieldContextDefaultValueMultipleVersion` (type `version.multiple`) for single choice version pickers.
     *  `CustomFieldContextDefaultValueSingleVersion` (type `version.single`) for multiple choice version pickers.

    Forge custom fields [types](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field-type/#data-types) are also supported, returning:

     *  `CustomFieldContextDefaultValueForgeStringFieldBean` (type `forge.string`) for Forge string fields.
     *  `CustomFieldContextDefaultValueForgeMultiStringFieldBean` (type `forge.string.list`) for Forge string collection fields.
     *  `CustomFieldContextDefaultValueForgeObjectFieldBean` (type `forge.object`) for Forge object fields.
     *  `CustomFieldContextDefaultValueForgeDateTimeFieldBean` (type `forge.datetime`) for Forge date-time fields.
     *  `CustomFieldContextDefaultValueForgeGroupFieldBean` (type `forge.group`) for Forge group fields.
     *  `CustomFieldContextDefaultValueForgeMultiGroupFieldBean` (type `forge.group.list`) for Forge group collection fields.
     *  `CustomFieldContextDefaultValueForgeNumberFieldBean` (type `forge.number`) for Forge number fields.
     *  `CustomFieldContextDefaultValueForgeUserFieldBean` (type `forge.user`) for Forge user fields.
     *  `CustomFieldContextDefaultValueForgeMultiUserFieldBean` (type `forge.user.list`) for Forge user collection fields.

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param fieldId The ID of the custom field, for example `customfield\_10000`.  (example: null)
     * @param contextId The IDs of the contexts. (optional) (example: null)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional) (example: null)
     * @param maxResults The maximum number of items to return per page. (optional) (example: null)
     *
     * @return PageBeanCustomFieldContextDefaultValue
     */
    @GET("/rest/api/3/field/{fieldId}/context/defaultValue")
    suspend fun getDefaultValues(
        @Body fieldId: String,
        @Query("contextId") contextId: List<Long>? = null,
        @Query("startAt") startAt: Long = 0,
        @Query("maxResults") maxResults: Int = 50
    ): PageBeanCustomFieldContextDefaultValue

    /**
     * GET /rest/api/3/field/{fieldId}/context/issuetypemapping
     *
     * Returns a [paginated](#pagination) list of context to issue type mappings for a custom field. Mappings are returned for all contexts or a list of contexts. Mappings are ordered first by context ID and then by issue type ID.

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param fieldId The ID of the custom field.  (example: null)
     * @param contextId The ID of the context. To include multiple contexts, provide an ampersand-separated list. For example, `contextId=10001&contextId=10002`. (optional) (example: null)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional) (example: null)
     * @param maxResults The maximum number of items to return per page. (optional) (example: null)
     *
     * @return PageBeanIssueTypeToContextMapping
     */
    @GET("/rest/api/3/field/{fieldId}/context/issuetypemapping")
    suspend fun getIssueTypeMappingsForContexts(
        @Body fieldId: String,
        @Query("contextId") contextId: List<Long>? = null,
        @Query("startAt") startAt: Long = 0,
        @Query("maxResults") maxResults: Int = 50
    ): PageBeanIssueTypeToContextMapping

    /**
     * GET /rest/api/3/field/{fieldId}/context/projectmapping
     *
     * Returns a [paginated](#pagination) list of context to project mappings for a custom field. The result can be filtered by `contextId`. Otherwise, all mappings are returned. Invalid IDs are ignored.

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param fieldId The ID of the custom field, for example `customfield\_10000`.  (example: null)
     * @param contextId The list of context IDs. To include multiple context, separate IDs with ampersand: `contextId=10000&contextId=10001`. (optional) (example: null)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional) (example: null)
     * @param maxResults The maximum number of items to return per page. (optional) (example: null)
     *
     * @return PageBeanCustomFieldContextProjectMapping
     */
    @GET("/rest/api/3/field/{fieldId}/context/projectmapping")
    suspend fun getProjectContextMapping(
        @Body fieldId: String,
        @Query("contextId") contextId: List<Long>? = null,
        @Query("startAt") startAt: Long = 0,
        @Query("maxResults") maxResults: Int = 50
    ): PageBeanCustomFieldContextProjectMapping

    /**
     * POST /rest/api/3/field/{fieldId}/context/{contextId}/project/remove
     *
     * Removes a custom field context from projects.

    A custom field context without any projects applies to all projects. Removing all projects from a custom field context would result in it applying to all projects.

    If any project in the request is not assigned to the context, or the operation would result in two global contexts for the field, the operation fails.

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param fieldId The ID of the custom field.  (example: null)
     * @param contextId The ID of the context.  (example: null)
     * @param projectIds, request body
     *
     * @return Unit
     */
    @POST("/rest/api/3/field/{fieldId}/context/{contextId}/project/remove")
    suspend fun removeCustomFieldContextFromProjects(
        @Body fieldId: String,
        @Body contextId: Long,
        @Body projectIds: ProjectIds
    ): Unit

    /**
     * POST /rest/api/3/field/{fieldId}/context/{contextId}/issuetype/remove
     *
     * Removes issue types from a custom field context.

    A custom field context without any issue types applies to all issue types.

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param fieldId The ID of the custom field.  (example: null)
     * @param contextId The ID of the context.  (example: null)
     * @param issueTypeIds, request body
     *
     * @return Unit
     */
    @POST("/rest/api/3/field/{fieldId}/context/{contextId}/issuetype/remove")
    suspend fun removeIssueTypesFromContext(
        @Body fieldId: String,
        @Body contextId: Long,
        @Body issueTypeIds: IssueTypeIds
    ): Unit
}