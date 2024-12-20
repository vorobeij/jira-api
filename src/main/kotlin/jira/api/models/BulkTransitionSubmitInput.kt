/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @param selectedIssueIdsOrKeys, required, List of all the issue IDs or keys that are to be bulk transitioned.
 * @param transitionId, required, The ID of the transition that is to be performed on the issues.
 */
@Serializable
data class BulkTransitionSubmitInput(
    @SerialName("selectedIssueIdsOrKeys") val selectedIssueIdsOrKeys: List<String>,
    @SerialName("transitionId") val transitionId: String
)