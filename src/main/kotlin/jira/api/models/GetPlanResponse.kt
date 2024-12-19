/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 *
 * @param crossProjectReleases, optional, The cross-project releases included in the plan.
 * @param customFields, optional, The custom fields for the plan.
 * @param exclusionRules, optional, The exclusion rules for the plan.
 * @param id, required, The plan ID.
 * @param issueSources, optional, The issue sources included in the plan.
 * @param lastSaved, optional, The date when the plan was last saved in UTC.
 * @param leadAccountId, optional, The account ID of the plan lead.
 * @param name, optional, The plan name.
 * @param permissions, optional, The permissions for the plan.
 * @param scheduling, required, The scheduling settings for the plan.
 * @param status, required, The plan status. This is "Active", "Trashed" or "Archived".
 */
@Serializable
data class GetPlanResponse(
    @SerialName("crossProjectReleases") val crossProjectReleases: List<GetCrossProjectReleaseResponse>? = null,
    @SerialName("customFields") val customFields: List<GetCustomFieldResponse>? = null,
    @SerialName("exclusionRules") val exclusionRules: exclusionRules? = null,
    @SerialName("id") val id: Long,
    @SerialName("issueSources") val issueSources: List<GetIssueSourceResponse>? = null,
    @SerialName("lastSaved") val lastSaved: String? = null,
    @SerialName("leadAccountId") val leadAccountId: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("permissions") val permissions: List<GetPermissionResponse>? = null,
    @SerialName("scheduling") val scheduling: scheduling,
    @SerialName("status") val status: String
)