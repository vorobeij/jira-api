/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details about data policy.
 *
 * @param anyContentBlocked, optional, Whether the project contains any content inaccessible to the requesting application.
 */
@Serializable
data class ProjectDataPolicy(
    @SerialName("anyContentBlocked") val anyContentBlocked: Boolean? = null
)