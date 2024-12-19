/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.apis

import jira.api.models.ProjectEmailAddress
import retrofit2.http.Body
import retrofit2.http.GET

interface ProjectEmailApi {

    /**
     * GET /rest/api/3/project/{projectId}/email
     *
     * Returns the [project's sender email address](https://confluence.atlassian.com/x/dolKLg).

     **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * @param projectId The project ID.  (example: null)
     *
     * @return ProjectEmailAddress
     */
    @GET("/rest/api/3/project/{projectId}/email")
    suspend fun getProjectEmail(
        @Body projectId: Long
    ): ProjectEmailAddress
}