/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of the scope of the default sharing for new filters and dashboards.
 *
 * @param scope, required, The scope of the default sharing for new filters and dashboards:

 *  `AUTHENTICATED` Shared with all logged-in users.
 *  `GLOBAL` Shared with all logged-in users. This shows as `AUTHENTICATED` in the response.
 *  `PRIVATE` Not shared with any users.
 */
@Serializable
data class DefaultShareScope(
    @SerialName("scope") val scope: String
)