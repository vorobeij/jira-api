/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.apis

import jira.api.models.PageBeanWorkflowTransitionRules
import retrofit2.http.GET
import retrofit2.http.Query

interface WorkflowTransitionRulesApi {

    /**
     * GET /rest/api/3/workflow/rule/config
     *
     * Returns a [paginated](#pagination) list of workflows with transition rules. The workflows can be filtered to return only those containing workflow transition rules:

     *  of one or more transition rule types, such as [workflow post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/).
     *  matching one or more transition rule keys.

    Only workflows containing transition rules created by the calling [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) app are returned.

    Due to server-side optimizations, workflows with an empty list of rules may be returned; these workflows can be ignored.

     **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) apps can use this operation.
     * @param startAt The index of the first item to return in a page of results (page offset). (optional) (example: null)
     * @param maxResults The maximum number of items to return per page. (optional) (example: null)
     * @param types The types of the transition rules to return.  (example: null)
     * @param keys The transition rule class keys, as defined in the Connect or the Forge app descriptor, of the transition rules to return. (optional) (example: null)
     * @param workflowNames The list of workflow names to filter by. (optional) (example: null)
     * @param withTags The list of `tags` to filter by. (optional) (example: null)
     * @param draft Whether draft or published workflows are returned. If not provided, both workflow types are returned. (optional) (example: null)
     * @param expand Use [expand](#expansion) to include additional information in the response. This parameter accepts `transition`, which, for each rule, returns information about the transition the rule is assigned to. (optional) (example: null)
     *
     * @return PageBeanWorkflowTransitionRules
     */
    @GET("/rest/api/3/workflow/rule/config")
    suspend fun getWorkflowTransitionRuleConfigurations(
        @Query("startAt") startAt: Long = 0,
        @Query("maxResults") maxResults: Int = 10,
        @Query("types") types: List<String>,
        @Query("keys") keys: List<String>? = null,
        @Query("workflowNames") workflowNames: List<String>? = null,
        @Query("withTags") withTags: List<String>? = null,
        @Query("draft") draft: Boolean? = null,
        @Query("expand") expand: String? = null
    ): PageBeanWorkflowTransitionRules
}