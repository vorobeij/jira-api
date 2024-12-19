/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * List of Issue Ids Or Keys that are to be archived or unarchived
 *
 * @param issueIdsOrKeys, optional
 */
@Serializable
data class IssueArchivalSyncRequest(
    @SerialName("issueIdsOrKeys") val issueIdsOrKeys: List<String>? = null
)