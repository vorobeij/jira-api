/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.apis

import jira.api.models.PageBeanIssueSecurityLevelMember
import jira.api.models.SecurityLevel
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Query

interface IssueSecurityLevelApi {

    /**
     * GET /rest/api/3/securitylevel/{id}
     *
     * Returns details of an issue security level.

    Use [Get issue security scheme](#api-rest-api-3-issuesecurityschemes-id-get) to obtain the IDs of issue security levels associated with the issue security scheme.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** None.
     * @param id The ID of the issue security level.  (example: null)
     *
     * @return SecurityLevel
     */
    @GET("/rest/api/3/securitylevel/{id}")
    suspend fun getIssueSecurityLevel(
        @Body id: String
    ): SecurityLevel

    /**
     * GET /rest/api/3/issuesecurityschemes/{issueSecuritySchemeId}/members
     *
     * Returns issue security level members.

    Only issue security level members in context of classic projects are returned.

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param issueSecuritySchemeId The ID of the issue security scheme. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) operation to get a list of issue security scheme IDs.  (example: null)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional) (example: null)
     * @param maxResults The maximum number of items to return per page. (optional) (example: null)
     * @param issueSecurityLevelId The list of issue security level IDs. To include multiple issue security levels separate IDs with ampersand: `issueSecurityLevelId=10000&issueSecurityLevelId=10001`. (optional) (example: null)
     * @param expand Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:

     *  `all` Returns all expandable information.
     *  `field` Returns information about the custom field granted the permission.
     *  `group` Returns information about the group that is granted the permission.
     *  `projectRole` Returns information about the project role granted the permission.
     *  `user` Returns information about the user who is granted the permission. (optional) (example: null)
     *
     * @return PageBeanIssueSecurityLevelMember
     */
    @GET("/rest/api/3/issuesecurityschemes/{issueSecuritySchemeId}/members")
    suspend fun getIssueSecurityLevelMembers(
        @Body issueSecuritySchemeId: Long,
        @Query("startAt") startAt: Long = 0,
        @Query("maxResults") maxResults: Int = 50,
        @Query("issueSecurityLevelId") issueSecurityLevelId: List<String>? = null,
        @Query("expand") expand: String? = null
    ): PageBeanIssueSecurityLevelMember
}