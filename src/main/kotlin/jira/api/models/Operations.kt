/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of the operations that can be performed on the issue.
 *
 * @param linkGroups, optional, Details of the link groups defining issue operations.
 */
@Serializable
data class Operations(
    @SerialName("linkGroups") val linkGroups: List<LinkGroup>? = null
)