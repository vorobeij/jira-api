/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.apis

import jira.api.models.Avatars
import jira.api.models.SystemAvatars
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface AvatarsApi {

    /**
     * GET /rest/api/3/avatar/{type}/system
     *
     * Returns a list of system avatar details by owner type, where the owner types are issue type, project, user or priority.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** None.
     * @param type The avatar type.  (example: project)
     *
     * @return SystemAvatars
     */
    @GET("/rest/api/3/avatar/{type}/system")
    suspend fun getAllSystemAvatars(
        @Body type: String
    ): SystemAvatars

    /**
     * GET /rest/api/3/universal_avatar/view/type/{type}/avatar/{id}
     *
     * Returns a project, issue type or priority avatar image by ID.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:**

     *  For system avatars, none.
     *  For custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.
     *  For custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.
     *  For priority avatars, none.
     * @param type The icon type of the avatar.  (example: null)
     * @param id The ID of the avatar.  (example: null)
     * @param size The size of the avatar image. If not provided the default size is returned. (optional) (example: null)
     * @param format The format to return the avatar image in. If not provided the original content format is returned. (optional) (example: null)
     *
     * @return Unit
     */
    @GET("/rest/api/3/universal_avatar/view/type/{type}/avatar/{id}")
    suspend fun getAvatarImageByID(
        @Body type: String,
        @Body id: Long,
        @Query("size") size: String? = null,
        @Query("format") format: String? = null
    ): Unit

    /**
     * GET /rest/api/3/universal_avatar/view/type/{type}/owner/{entityId}
     *
     * Returns the avatar image for a project, issue type or priority.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:**

     *  For system avatars, none.
     *  For custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.
     *  For custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.
     *  For priority avatars, none.
     * @param type The icon type of the avatar.  (example: null)
     * @param entityId The ID of the project or issue type the avatar belongs to.  (example: null)
     * @param size The size of the avatar image. If not provided the default size is returned. (optional) (example: null)
     * @param format The format to return the avatar image in. If not provided the original content format is returned. (optional) (example: null)
     *
     * @return Unit
     */
    @GET("/rest/api/3/universal_avatar/view/type/{type}/owner/{entityId}")
    suspend fun getAvatarImageByOwner(
        @Body type: String,
        @Body entityId: String,
        @Query("size") size: String? = null,
        @Query("format") format: String? = null
    ): Unit

    /**
     * GET /rest/api/3/universal_avatar/view/type/{type}
     *
     * Returns the default project, issue type or priority avatar image.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** None.
     * @param type The icon type of the avatar.  (example: null)
     * @param size The size of the avatar image. If not provided the default size is returned. (optional) (example: null)
     * @param format The format to return the avatar image in. If not provided the original content format is returned. (optional) (example: null)
     *
     * @return Unit
     */
    @GET("/rest/api/3/universal_avatar/view/type/{type}")
    suspend fun getAvatarImageByType(
        @Body type: String,
        @Query("size") size: String? = null,
        @Query("format") format: String? = null
    ): Unit

    /**
     * GET /rest/api/3/universal_avatar/type/{type}/owner/{entityId}
     *
     * Returns the system and custom avatars for a project, issue type or priority.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:**

     *  for custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.
     *  for custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.
     *  for system avatars, none.
     *  for priority avatars, none.
     * @param type The avatar type.  (example: null)
     * @param entityId The ID of the item the avatar is associated with.  (example: null)
     *
     * @return Avatars
     */
    @GET("/rest/api/3/universal_avatar/type/{type}/owner/{entityId}")
    suspend fun getAvatars(
        @Body type: String,
        @Body entityId: String
    ): Avatars

    /**
     * POST /rest/api/3/universal_avatar/type/{type}/owner/{entityId}
     *
     * Loads a custom avatar for a project, issue type or priority.

    Specify the avatar's local file location in the body of the request. Also, include the following headers:

     *  `X-Atlassian-Token: no-check` To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).
     *  `Content-Type: image/image type` Valid image types are JPEG, GIF, or PNG.

    For example:
    `curl --request POST `

    `--user email@example.com:<api_token> `

    `--header 'X-Atlassian-Token: no-check' `

    `--header 'Content-Type: image/< image_type>' `

    `--data-binary "<@/path/to/file/with/your/avatar>" `

    `--url 'https://your-domain.atlassian.net/rest/api/3/universal_avatar/type/{type}/owner/{entityId}'`

    The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square's sides is set to the smaller of the height or width of the image.

    The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.

    After creating the avatar use:

     *  [Update issue type](#api-rest-api-3-issuetype-id-put) to set it as the issue type's displayed avatar.
     *  [Set project avatar](#api-rest-api-3-project-projectIdOrKey-avatar-put) to set it as the project's displayed avatar.
     *  [Update priority](#api-rest-api-3-priority-id-put) to set it as the priority's displayed avatar.

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param type The avatar type.  (example: null)
     * @param entityId The ID of the item the avatar is associated with.  (example: null)
     * @param x The X coordinate of the top-left corner of the crop region. (optional) (example: null)
     * @param y The Y coordinate of the top-left corner of the crop region. (optional) (example: null)
     * @param size The length of each side of the crop region.  (example: null)
     *
     * @return Unit
     */
    @POST("/rest/api/3/universal_avatar/type/{type}/owner/{entityId}")
    suspend fun storeAvatar(
        @Body type: String,
        @Body entityId: String,
        @Query("x") x: Int = 0,
        @Query("y") y: Int = 0,
        @Query("size") size: Int = 0
    ): Unit
}