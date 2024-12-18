/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.apis

import jira.api.models.TaskProgressBeanObject
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface TasksApi {

    /**
     * POST /rest/api/3/task/{taskId}/cancel
     *
     * Cancels a task.

     **[Permissions](#permissions) required:** either of:

     *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *  Creator of the task.
     * @param taskId The ID of the task.  (example: null)
     *
     * @return Unit
     */
    @POST("/rest/api/3/task/{taskId}/cancel")
    suspend fun cancelTask(
        @Body taskId: String
    ): Unit

    /**
     * GET /rest/api/3/task/{taskId}
     *
     * Returns the status of a [long-running asynchronous task](#async).

    When a task has finished, this operation returns the JSON blob applicable to the task. See the documentation of the operation that created the task for details. Task details are not permanently retained. As of September 2019, details are retained for 14 days although this period may change without notice.

     **Deprecation notice:** The required OAuth 2.0 scopes will be updated on June 15, 2024.

     *  `read:jira-work`

     **[Permissions](#permissions) required:** either of:

     *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *  Creator of the task.
     * @param taskId The ID of the task.  (example: null)
     *
     * @return TaskProgressBeanObject
     */
    @GET("/rest/api/3/task/{taskId}")
    suspend fun getTask(
        @Body taskId: String
    ): TaskProgressBeanObject
}