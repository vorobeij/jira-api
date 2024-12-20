/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of changes to a priority scheme's projects that require suggested priority mappings.
 *
 * @param add, optional, The ids of projects being added to the scheme.
 */
@Serializable
data class SuggestedMappingsForProjectsRequestBean(
    @SerialName("add") val add: List<Long>? = null
)