/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.apis

import jira.api.models.*
import retrofit2.http.*

interface ProjectVersionsApi {

    /**
     * POST /rest/api/3/version/{id}/relatedwork
     *
     * Creates a related work for the given version. You can only create a generic link type of related works via this API. relatedWorkId will be auto-generated UUID, that does not need to be provided.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** *Resolve issues:* and *Edit issues* [Managing project permissions](https://confluence.atlassian.com/adminjiraserver/managing-project-permissions-938847145.html) for the project that contains the version.
     * @param id null  (example: null)
     * @param versionRelatedWork, request body
     *
     * @return Unit
     */
    @POST("/rest/api/3/version/{id}/relatedwork")
    suspend fun createRelatedWork(
        @Body id: String,
        @Body versionRelatedWork: VersionRelatedWork
    ): Unit

    /**
     * POST /rest/api/3/version
     *
     * Creates a project version.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the version is added to.
     * @param version, request body
     *
     * @return Unit
     */
    @POST("/rest/api/3/version")
    suspend fun createVersion(
        @Body version: Version
    ): Unit

    /**
     * POST /rest/api/3/version/{id}/removeAndSwap
     *
     * Deletes a project version.

    Alternative versions can be provided to update issues that use the deleted version in `fixVersion`, `affectedVersion`, or any version picker custom fields. If alternatives are not provided, occurrences of `fixVersion`, `affectedVersion`, and any version picker custom field, that contain the deleted version, are cleared. Any replacement version must be in the same project as the version being deleted and cannot be the version being deleted.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that contains the version.
     * @param id The ID of the version.  (example: null)
     * @param deleteAndReplaceVersionBean, request body
     *
     * @return Unit
     */
    @POST("/rest/api/3/version/{id}/removeAndSwap")
    suspend fun deleteAndReplaceVersion(
        @Body id: String,
        @Body deleteAndReplaceVersionBean: DeleteAndReplaceVersionBean
    ): Unit

    /**
     * GET /rest/api/3/project/{projectIdOrKey}/versions
     *
     * Returns all versions in a project. The response is not paginated. Use [Get project versions paginated](#api-rest-api-3-project-projectIdOrKey-version-get) if you want to get the versions in a project with pagination.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * @param projectIdOrKey The project ID or project key (case sensitive).  (example: null)
     * @param expand Use [expand](#expansion) to include additional information in the response. This parameter accepts `operations`, which returns actions that can be performed on the version. (optional) (example: null)
     *
     * @return List<Version>
     */
    @GET("/rest/api/3/project/{projectIdOrKey}/versions")
    suspend fun getProjectVersions(
        @Body projectIdOrKey: String,
        @Query("expand") expand: String? = null
    ): List<Version>

    /**
     * GET /rest/api/3/project/{projectIdOrKey}/version
     *
     * Returns a [paginated](#pagination) list of all versions in a project. See the [Get project versions](#api-rest-api-3-project-projectIdOrKey-versions-get) resource if you want to get a full list of versions without pagination.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * @param projectIdOrKey The project ID or project key (case sensitive).  (example: null)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional) (example: null)
     * @param maxResults The maximum number of items to return per page. (optional) (example: null)
     * @param orderBy [Order](#ordering) the results by a field:

     *  `description` Sorts by version description.
     *  `name` Sorts by version name.
     *  `releaseDate` Sorts by release date, starting with the oldest date. Versions with no release date are listed last.
     *  `sequence` Sorts by the order of appearance in the user interface.
     *  `startDate` Sorts by start date, starting with the oldest date. Versions with no start date are listed last. (optional) (example: null)
     * @param query Filter the results using a literal string. Versions with matching `name` or `description` are returned (case insensitive). (optional) (example: null)
     * @param status A list of status values used to filter the results by version status. This parameter accepts a comma-separated list. The status values are `released`, `unreleased`, and `archived`. (optional) (example: null)
     * @param expand Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:

     *  `issuesstatus` Returns the number of issues in each status category for each version.
     *  `operations` Returns actions that can be performed on the specified version.
     *  `driver` Returns the Atlassian account ID of the version driver.
     *  `approvers` Returns a list containing the approvers for this version. (optional) (example: null)
     *
     * @return PageBeanVersion
     */
    @GET("/rest/api/3/project/{projectIdOrKey}/version")
    suspend fun getProjectVersionsPaginated(
        @Body projectIdOrKey: String,
        @Query("startAt") startAt: Long = 0,
        @Query("maxResults") maxResults: Int = 50,
        @Query("orderBy") orderBy: String? = null,
        @Query("query") query: String? = null,
        @Query("status") status: String? = null,
        @Query("expand") expand: String? = null
    ): PageBeanVersion

    /**
     * GET /rest/api/3/version/{id}/relatedwork
     *
     * Returns related work items for the given version id.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the version.
     * @param id The ID of the version.  (example: null)
     *
     * @return List<VersionRelatedWork>
     */
    @GET("/rest/api/3/version/{id}/relatedwork")
    suspend fun getRelatedWork(
        @Body id: String
    ): List<VersionRelatedWork>

    /**
     * GET /rest/api/3/version/{id}
     *
     * Returns a project version.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the version.
     * @param id The ID of the version.  (example: null)
     * @param expand Use [expand](#expansion) to include additional information about version in the response. This parameter accepts a comma-separated list. Expand options include:

     *  `operations` Returns the list of operations available for this version.
     *  `issuesstatus` Returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property represents the number of issues with a status other than *to do*, *in progress*, and *done*.
     *  `driver` Returns the Atlassian account ID of the version driver.
     *  `approvers` Returns a list containing the Atlassian account IDs of approvers for this version. (optional) (example: null)
     *
     * @return Version
     */
    @GET("/rest/api/3/version/{id}")
    suspend fun getVersion(
        @Body id: String,
        @Query("expand") expand: String? = null
    ): Version

    /**
     * GET /rest/api/3/version/{id}/relatedIssueCounts
     *
     * Returns the following counts for a version:

     *  Number of issues where the `fixVersion` is set to the version.
     *  Number of issues where the `affectedVersion` is set to the version.
     *  Number of issues where a version custom field is set to the version.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** *Browse projects* project permission for the project that contains the version.
     * @param id The ID of the version.  (example: null)
     *
     * @return VersionIssueCounts
     */
    @GET("/rest/api/3/version/{id}/relatedIssueCounts")
    suspend fun getVersionRelatedIssues(
        @Body id: String
    ): VersionIssueCounts

    /**
     * GET /rest/api/3/version/{id}/unresolvedIssueCount
     *
     * Returns counts of the issues and unresolved issues for the project version.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** *Browse projects* project permission for the project that contains the version.
     * @param id The ID of the version.  (example: null)
     *
     * @return VersionUnresolvedIssuesCount
     */
    @GET("/rest/api/3/version/{id}/unresolvedIssueCount")
    suspend fun getVersionUnresolvedIssues(
        @Body id: String
    ): VersionUnresolvedIssuesCount

    /**
     * POST /rest/api/3/version/{id}/move
     *
     * Modifies the version's sequence within the project, which affects the display order of the versions in Jira.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** *Browse projects* project permission for the project that contains the version.
     * @param id The ID of the version to be moved.  (example: null)
     * @param versionMoveBean, request body
     *
     * @return Version
     */
    @POST("/rest/api/3/version/{id}/move")
    suspend fun moveVersion(
        @Body id: String,
        @Body versionMoveBean: VersionMoveBean
    ): Version
}