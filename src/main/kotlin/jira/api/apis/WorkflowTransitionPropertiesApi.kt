/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.apis

import jira.api.models.WorkflowTransitionProperty
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface WorkflowTransitionPropertiesApi {

    /**
     * POST /rest/api/3/workflow/transitions/{transitionId}/properties
     *
     * Adds a property to a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param transitionId The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition.  (example: null)
     * @param key The key of the property being added, also known as the name of the property. Set this to the same value as the `key` defined in the request body.  (example: null)
     * @param workflowName The name of the workflow that the transition belongs to.  (example: null)
     * @param workflowMode The workflow status. Set to *live* for inactive workflows or *draft* for draft workflows. Active workflows cannot be edited. (optional) (example: null)
     * @param workflowTransitionProperty, request body
     *
     * @return WorkflowTransitionProperty
     */
    @POST("/rest/api/3/workflow/transitions/{transitionId}/properties")
    suspend fun createWorkflowTransitionProperty(
        @Body transitionId: Long,
        @Query("key") key: String,
        @Query("workflowName") workflowName: String,
        @Query("workflowMode") workflowMode: String = "live",
        @Body workflowTransitionProperty: WorkflowTransitionProperty
    ): WorkflowTransitionProperty

    /**
     * GET /rest/api/3/workflow/transitions/{transitionId}/properties
     *
     * Returns the properties on a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).

     **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param transitionId The ID of the transition. To get the ID, view the workflow in text mode in the Jira administration console. The ID is shown next to the transition.  (example: null)
     * @param includeReservedKeys Some properties with keys that have the *jira.* prefix are reserved, which means they are not editable. To include these properties in the results, set this parameter to *true*. (optional) (example: null)
     * @param key The key of the property being returned, also known as the name of the property. If this parameter is not specified, all properties on the transition are returned. (optional) (example: null)
     * @param workflowName The name of the workflow that the transition belongs to.  (example: null)
     * @param workflowMode The workflow status. Set to *live* for active and inactive workflows, or *draft* for draft workflows. (optional) (example: null)
     *
     * @return WorkflowTransitionProperty
     */
    @GET("/rest/api/3/workflow/transitions/{transitionId}/properties")
    suspend fun getWorkflowTransitionProperties(
        @Body transitionId: Long,
        @Query("includeReservedKeys") includeReservedKeys: Boolean = false,
        @Query("key") key: String? = null,
        @Query("workflowName") workflowName: String,
        @Query("workflowMode") workflowMode: String = "live"
    ): WorkflowTransitionProperty
}