/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The ID of an issue type screen scheme.
 *
 * @param id, required, The ID of the issue type screen scheme.
 */
@Serializable
data class IssueTypeScreenSchemeId(
    @SerialName("id") val id: String
)