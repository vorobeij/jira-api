/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The field configuration to issue type mapping.
 *
 * @param fieldConfigurationId, required, The ID of the field configuration.
 * @param issueTypeId, required, The ID of the issue type or *default*. When set to *default* this field configuration issue type item applies to all issue types without a field configuration. An issue type can be included only once in a request.
 */
@Serializable
data class FieldConfigurationToIssueTypeMapping(
    @SerialName("fieldConfigurationId") val fieldConfigurationId: String,
    @SerialName("issueTypeId") val issueTypeId: String
)