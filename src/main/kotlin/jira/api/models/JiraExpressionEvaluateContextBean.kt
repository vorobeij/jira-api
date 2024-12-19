/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 *
 * @param board, optional, The ID of the board that is available under the `board` variable when evaluating the expression.
 * @param custom, optional, Custom context variables and their types. These variable types are available for use in a custom context:

 *  `user`: A [user](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#user) specified as an Atlassian account ID.
 *  `issue`: An [issue](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue) specified by ID or key. All the fields of the issue object are available in the Jira expression.
 *  `json`: A JSON object containing custom content.
 *  `list`: A JSON list of `user`, `issue`, or `json` variable types.
 * @param customerRequest, optional, The ID of the customer request that is available under the `customerRequest` variable when evaluating the expression. This is the same as the ID of the underlying Jira issue, but the customer request context variable will have a different type.
 * @param issue, optional, The issue that is available under the `issue` variable when evaluating the expression.
 * @param issues, optional, The collection of issues that is available under the `issues` variable when evaluating the expression.
 * @param project, optional, The project that is available under the `project` variable when evaluating the expression.
 * @param serviceDesk, optional, The ID of the service desk that is available under the `serviceDesk` variable when evaluating the expression.
 * @param sprint, optional, The ID of the sprint that is available under the `sprint` variable when evaluating the expression.
 */
@Serializable
data class JiraExpressionEvaluateContextBean(
    @SerialName("board") val board: Long? = null,
    @SerialName("custom") val custom: List<CustomContextVariable>? = null,
    @SerialName("customerRequest") val customerRequest: Long? = null,
    @SerialName("issue") val issue: issue? = null,
    @SerialName("issues") val issues: issues? = null,
    @SerialName("project") val project: project? = null,
    @SerialName("serviceDesk") val serviceDesk: Long? = null,
    @SerialName("sprint") val sprint: Long? = null
)