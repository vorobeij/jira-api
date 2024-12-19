/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.apis

import jira.api.models.ColumnItem
import jira.api.models.GroupName
import jira.api.models.NewUserDetails
import jira.api.models.PageBeanUser
import jira.api.models.UnrestrictedUserEmail
import jira.api.models.User
import jira.api.models.UserMigrationBean
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface UsersApi {

    /**
     * GET /rest/api/3/user/bulk
     *
     * Returns a [paginated](#pagination) list of the users specified by one or more account IDs.

     **[Permissions](#permissions) required:** Permission to access Jira.
     * @param startAt The index of the first item to return in a page of results (page offset). (optional) (example: null)
     * @param maxResults The maximum number of items to return per page. (optional) (example: null)
     * @param username This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional) (example: null)
     * @param key This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional) (example: null)
     * @param accountId The account ID of a user. To specify multiple users, pass multiple `accountId` parameters. For example, `accountId=5b10a2844c20165700ede21g&accountId=5b10ac8d82e05b22cc7d4ef5`.  (example: 5b10ac8d82e05b22cc7d4ef5)
     *
     * @return PageBeanUser
     */
    @GET("/rest/api/3/user/bulk")
    suspend fun bulkGetUsers(
        @Query("startAt") startAt: Long = 0,
        @Query("maxResults") maxResults: Int = 10,
        @Query("username") username: List<String>? = null,
        @Query("key") key: List<String>? = null,
        @Query("accountId") accountId: List<String>
    ): PageBeanUser

    /**
     * GET /rest/api/3/user/bulk/migration
     *
     * Returns the account IDs for the users specified in the `key` or `username` parameters. Note that multiple `key` or `username` parameters can be specified.

     **[Permissions](#permissions) required:** Permission to access Jira.
     * @param startAt The index of the first item to return in a page of results (page offset). (optional) (example: null)
     * @param maxResults The maximum number of items to return per page. (optional) (example: null)
     * @param username Username of a user. To specify multiple users, pass multiple copies of this parameter. For example, `username=fred&username=barney`. Required if `key` isn't provided. Cannot be provided if `key` is present. (optional) (example: null)
     * @param key Key of a user. To specify multiple users, pass multiple copies of this parameter. For example, `key=fred&key=barney`. Required if `username` isn't provided. Cannot be provided if `username` is present. (optional) (example: null)
     *
     * @return List<UserMigrationBean>
     */
    @GET("/rest/api/3/user/bulk/migration")
    suspend fun bulkGetUsersMigration(
        @Query("startAt") startAt: Long = 0,
        @Query("maxResults") maxResults: Int = 10,
        @Query("username") username: List<String>? = null,
        @Query("key") key: List<String>? = null
    ): List<UserMigrationBean>

    /**
     * POST /rest/api/3/user
     *
     * Creates a user. This resource is retained for legacy compatibility. As soon as a more suitable alternative is available this resource will be deprecated.

    If the user exists and has access to Jira, the operation returns a 201 status. If the user exists but does not have access to Jira, the operation returns a 400 status.

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param newUserDetails, request body
     *
     * @return Unit
     */
    @POST("/rest/api/3/user")
    suspend fun createUser(
        @Body newUserDetails: NewUserDetails
    ): Unit

    /**
     * GET /rest/api/3/users/search
     *
     * Returns a list of all users, including active users, inactive users and previously deleted users that have an Atlassian account.

    Privacy controls are applied to the response based on the users' preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.

     **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param startAt The index of the first item to return. (optional) (example: null)
     * @param maxResults The maximum number of items to return. (optional) (example: null)
     *
     * @return List<User>
     */
    @GET("/rest/api/3/users/search")
    suspend fun getAllUsers(
        @Query("startAt") startAt: Int = 0,
        @Query("maxResults") maxResults: Int = 50
    ): List<User>

    /**
     * GET /rest/api/3/users
     *
     * Returns a list of all users, including active users, inactive users and previously deleted users that have an Atlassian account.

    Privacy controls are applied to the response based on the users' preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.

     **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param startAt The index of the first item to return. (optional) (example: null)
     * @param maxResults The maximum number of items to return. (optional) (example: null)
     *
     * @return List<User>
     */
    @GET("/rest/api/3/users")
    suspend fun getAllUsersDefault(
        @Query("startAt") startAt: Int = 0,
        @Query("maxResults") maxResults: Int = 50
    ): List<User>

    /**
     * GET /rest/api/3/user
     *
     * Returns a user.

    Privacy controls are applied to the response based on the user's preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.

     **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param accountId The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required. (optional) (example: 5b10ac8d82e05b22cc7d4ef5)
     * @param username This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide) for details. (optional) (example: null)
     * @param key This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide) for details. (optional) (example: null)
     * @param expand Use [expand](#expansion) to include additional information about users in the response. This parameter accepts a comma-separated list. Expand options include:

     *  `groups` includes all groups and nested groups to which the user belongs.
     *  `applicationRoles` includes details of all the applications to which the user has access. (optional) (example: null)
     *
     * @return User
     */
    @GET("/rest/api/3/user")
    suspend fun getUser(
        @Query("accountId") accountId: String? = null,
        @Query("username") username: String? = null,
        @Query("key") key: String? = null,
        @Query("expand") expand: String? = null
    ): User

    /**
     * GET /rest/api/3/user/columns
     *
     * Returns the default [issue table columns](https://confluence.atlassian.com/x/XYdKLg) for the user. If `accountId` is not passed in the request, the calling user's details are returned.

     **[Permissions](#permissions) required:**

     *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLgl), to get the column details for any user.
     *  Permission to access Jira, to get the calling user's column details.
     * @param accountId The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. (optional) (example: 5b10ac8d82e05b22cc7d4ef5)
     * @param username This parameter is no longer available See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional) (example: null)
     *
     * @return List<ColumnItem>
     */
    @GET("/rest/api/3/user/columns")
    suspend fun getUserDefaultColumns(
        @Query("accountId") accountId: String? = null,
        @Query("username") username: String? = null
    ): List<ColumnItem>

    /**
     * GET /rest/api/3/user/email
     *
     * Returns a user's email address regardless of the user's profile visibility settings. For Connect apps, this API is only available to apps approved by Atlassian, according to these [guidelines](https://community.developer.atlassian.com/t/guidelines-for-requesting-access-to-email-address/27603). For Forge apps, this API only supports access via asApp() requests.
     * @param accountId The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, `5b10ac8d82e05b22cc7d4ef5`.  (example: null)
     *
     * @return UnrestrictedUserEmail
     */
    @GET("/rest/api/3/user/email")
    suspend fun getUserEmail(
        @Query("accountId") accountId: String
    ): UnrestrictedUserEmail

    /**
     * GET /rest/api/3/user/email/bulk
     *
     * Returns a user's email address regardless of the user's profile visibility settings. For Connect apps, this API is only available to apps approved by Atlassian, according to these [guidelines](https://community.developer.atlassian.com/t/guidelines-for-requesting-access-to-email-address/27603). For Forge apps, this API only supports access via asApp() requests.
     * @param accountId The account IDs of the users for which emails are required. An `accountId` is an identifier that uniquely identifies the user across all Atlassian products. For example, `5b10ac8d82e05b22cc7d4ef5`. Note, this should be treated as an opaque identifier (that is, do not assume any structure in the value).  (example: null)
     *
     * @return UnrestrictedUserEmail
     */
    @GET("/rest/api/3/user/email/bulk")
    suspend fun getUserEmailBulk(
        @Query("accountId") accountId: List<String>
    ): UnrestrictedUserEmail

    /**
     * GET /rest/api/3/user/groups
     *
     * Returns the groups to which a user belongs.

     **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param accountId The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.  (example: 5b10ac8d82e05b22cc7d4ef5)
     * @param username This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional) (example: null)
     * @param key This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional) (example: null)
     *
     * @return List<GroupName>
     */
    @GET("/rest/api/3/user/groups")
    suspend fun getUserGroups(
        @Query("accountId") accountId: String,
        @Query("username") username: String? = null,
        @Query("key") key: String? = null
    ): List<GroupName>
}