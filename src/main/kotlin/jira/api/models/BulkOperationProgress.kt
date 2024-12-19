/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 *
 * @param created, optional, A timestamp of when the task was submitted.
 * @param failedAccessibleIssues, optional, Map of issue IDs for which the operation failed and that the user has permission to view, to their one or more reasons for failure. These reasons are open-ended text descriptions of the error and are not selected from a predefined list of standard reasons.
 * @param invalidOrInaccessibleIssueCount, optional, The number of issues that are either invalid or issues that the user doesn't have permission to view, regardless of the success or failure of the operation.
 * @param processedAccessibleIssues, optional, List of issue IDs for which the operation was successful and that the user has permission to view.
 * @param progressPercent, optional, Progress of the task as a percentage.
 * @param started, optional, A timestamp of when the task was started.
 * @param status, optional, The status of the task.
 * @param user, optional, A user with details as permitted by the user's Atlassian Account privacy settings. However, be aware of these exceptions:

 *  User record deleted from Atlassian: This occurs as the result of a right to be forgotten request. In this case, `displayName` provides an indication and other parameters have default values or are blank (for example, email is blank).
 *  User record corrupted: This occurs as a results of events such as a server import and can only happen to deleted users. In this case, `accountId` returns *unknown* and all other parameters have fallback values.
 *  User record unavailable: This usually occurs due to an internal service outage. In this case, all parameters have fallback values.
 * @param taskId, optional, The ID of the task.
 * @param totalIssueCount, optional, The number of issues that the bulk operation was attempted on.
 * @param updated, optional, A timestamp of when the task progress was last updated.
 */
@Serializable
data class BulkOperationProgress(
    @SerialName("created") val created: String? = null,
    @SerialName("failedAccessibleIssues") val failedAccessibleIssues: failedAccessibleIssues? = null,
    @SerialName("invalidOrInaccessibleIssueCount") val invalidOrInaccessibleIssueCount: Int? = null,
    @SerialName("processedAccessibleIssues") val processedAccessibleIssues: List<Long>? = null,
    @SerialName("progressPercent") val progressPercent: Long? = null,
    @SerialName("started") val started: String? = null,
    @SerialName("status") val status: String? = null,
    @SerialName("user") val user: User? = null,
    @SerialName("taskId") val taskId: String? = null,
    @SerialName("totalIssueCount") val totalIssueCount: Int? = null,
    @SerialName("updated") val updated: String? = null
)