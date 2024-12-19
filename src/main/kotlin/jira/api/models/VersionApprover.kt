/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contains details about a version approver.
 *
 * @param accountId, optional, The Atlassian account ID of the approver.
 * @param declineReason, optional, A description of why the user is declining the approval.
 * @param description, optional, A description of what the user is approving within the specified version.
 * @param status, optional, The status of the approval, which can be *PENDING*, *APPROVED*, or *DECLINED*
 */
@Serializable
data class VersionApprover(
    @SerialName("accountId") val accountId: String? = null,
    @SerialName("declineReason") val declineReason: String? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("status") val status: String? = null
)