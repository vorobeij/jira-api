/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The details of a workflow transition rules.
 *
 * @param conditions, optional, The workflow conditions.
 * @param postFunctions, optional, The workflow post functions.

 **Note:** The default post functions are always added to the *initial* transition, as in:

"postFunctions": [
{
"type": "IssueCreateFunction"
},
{
"type": "IssueReindexFunction"
},
{
"type": "FireIssueEventFunction",
"configuration": {
"event": {
"id": "1",
"name": "issue_created"
}
}
}
]

 **Note:** The default post functions are always added to the *global* and *directed* transitions, as in:

"postFunctions": [
{
"type": "UpdateIssueStatusFunction"
},
{
"type": "CreateCommentFunction"
},
{
"type": "GenerateChangeHistoryFunction"
},
{
"type": "IssueReindexFunction"
},
{
"type": "FireIssueEventFunction",
"configuration": {
"event": {
"id": "13",
"name": "issue_generic"
}
}
}
]
 * @param validators, optional, The workflow validators.

 **Note:** The default permission validator is always added to the *initial* transition, as in:

"validators": [
{
"type": "PermissionValidator",
"configuration": {
"permissionKey": "CREATE_ISSUES"
}
}
]
 */
@Serializable
data class CreateWorkflowTransitionRulesDetails(
    @SerialName("conditions") val conditions: CreateWorkflowCondition? = null,
    @SerialName("postFunctions") val postFunctions: List<CreateWorkflowTransitionRule>? = null,
    @SerialName("validators") val validators: List<CreateWorkflowTransitionRule>? = null
)