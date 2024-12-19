/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.apis

import jira.api.models.StatusCategory
import retrofit2.http.Body
import retrofit2.http.GET

interface WorkflowStatusCategoriesApi {

    /**
     * GET /rest/api/3/statuscategory
     *
     * Returns a list of all status categories.

     **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @return List<StatusCategory>
     */
    @GET("/rest/api/3/statuscategory")
    suspend fun getStatusCategories(): List<StatusCategory>

    /**
     * GET /rest/api/3/statuscategory/{idOrKey}
     *
     * Returns a status category. Status categories provided a mechanism for categorizing [statuses](#api-rest-api-3-status-idOrName-get).

     **[Permissions](#permissions) required:** Permission to access Jira.
     * @param idOrKey The ID or key of the status category.  (example: null)
     *
     * @return StatusCategory
     */
    @GET("/rest/api/3/statuscategory/{idOrKey}")
    suspend fun getStatusCategory(
        @Body idOrKey: String
    ): StatusCategory
}