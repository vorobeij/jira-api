/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.apis

import jira.api.models.ProjectAvatars
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ProjectAvatarsApi {

    /**
     * POST /rest/api/3/project/{projectIdOrKey}/avatar2
     *
     * Loads an avatar for a project.

    Specify the avatar's local file location in the body of the request. Also, include the following headers:

     *  `X-Atlassian-Token: no-check` To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).
     *  `Content-Type: image/image type` Valid image types are JPEG, GIF, or PNG.

    For example:
    `curl --request POST `

    `--user email@example.com:<api_token> `

    `--header 'X-Atlassian-Token: no-check' `

    `--header 'Content-Type: image/< image_type>' `

    `--data-binary "<@/path/to/file/with/your/avatar>" `

    `--url 'https://your-domain.atlassian.net/rest/api/3/project/{projectIdOrKey}/avatar2'`

    The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square's sides is set to the smaller of the height or width of the image.

    The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.

    After creating the avatar use [Set project avatar](#api-rest-api-3-project-projectIdOrKey-avatar-put) to set it as the project's displayed avatar.

     **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
     * @param projectIdOrKey The ID or (case-sensitive) key of the project.  (example: null)
     * @param x The X coordinate of the top-left corner of the crop region. (optional) (example: null)
     * @param y The Y coordinate of the top-left corner of the crop region. (optional) (example: null)
     * @param size The length of each side of the crop region. (optional) (example: null)
     *
     * @return Unit
     */
    @POST("/rest/api/3/project/{projectIdOrKey}/avatar2")
    suspend fun createProjectAvatar(
        @Body projectIdOrKey: String,
        @Query("x") x: Int = 0,
        @Query("y") y: Int = 0,
        @Query("size") size: Int = 0
    ): Unit

    /**
     * GET /rest/api/3/project/{projectIdOrKey}/avatars
     *
     * Returns all project avatars, grouped by system and custom avatars.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * @param projectIdOrKey The ID or (case-sensitive) key of the project.  (example: null)
     *
     * @return ProjectAvatars
     */
    @GET("/rest/api/3/project/{projectIdOrKey}/avatars")
    suspend fun getAllProjectAvatars(
        @Body projectIdOrKey: String
    ): ProjectAvatars
}