/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A [user](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#user) specified as an Atlassian account ID.
 *
 * @param accountId, required, The account ID of the user.
 * @param type, required, Type of custom context variable.
 */
@Serializable
data class UserContextVariable(
    @SerialName("accountId") val accountId: String,
    @SerialName("type") val type: String
)