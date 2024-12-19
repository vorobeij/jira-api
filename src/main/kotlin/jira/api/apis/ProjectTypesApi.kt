/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.apis

import jira.api.models.ProjectType
import retrofit2.http.Body
import retrofit2.http.GET

interface ProjectTypesApi {

    /**
     * GET /rest/api/3/project/type/{projectTypeKey}/accessible
     *
     * Returns a [project type](https://confluence.atlassian.com/x/Var1Nw) if it is accessible to the user.

     **[Permissions](#permissions) required:** Permission to access Jira.
     * @param projectTypeKey The key of the project type.  (example: null)
     *
     * @return ProjectType
     */
    @GET("/rest/api/3/project/type/{projectTypeKey}/accessible")
    suspend fun getAccessibleProjectTypeByKey(
        @Body projectTypeKey: String
    ): ProjectType

    /**
     * GET /rest/api/3/project/type/accessible
     *
     * Returns all [project types](https://confluence.atlassian.com/x/Var1Nw) with a valid license.
     *
     * @return List<ProjectType>
     */
    @GET("/rest/api/3/project/type/accessible")
    suspend fun getAllAccessibleProjectTypes(): List<ProjectType>

    /**
     * GET /rest/api/3/project/type
     *
     * Returns all [project types](https://confluence.atlassian.com/x/Var1Nw), whether or not the instance has a valid license for each type.

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** None.
     *
     * @return List<ProjectType>
     */
    @GET("/rest/api/3/project/type")
    suspend fun getAllProjectTypes(): List<ProjectType>

    /**
     * GET /rest/api/3/project/type/{projectTypeKey}
     *
     * Returns a [project type](https://confluence.atlassian.com/x/Var1Nw).

    This operation can be accessed anonymously.

     **[Permissions](#permissions) required:** None.
     * @param projectTypeKey The key of the project type.  (example: null)
     *
     * @return ProjectType
     */
    @GET("/rest/api/3/project/type/{projectTypeKey}")
    suspend fun getProjectTypeByKey(
        @Body projectTypeKey: String
    ): ProjectType
}