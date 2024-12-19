/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of configurations for a custom field.
 *
 * @param configurations, required, The list of custom field configuration details.
 */
@Serializable
data class CustomFieldConfigurations(
    @SerialName("configurations") val configurations: List<ContextualConfiguration>
)