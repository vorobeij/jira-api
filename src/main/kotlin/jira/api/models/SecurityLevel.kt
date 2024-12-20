/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of an issue level security item.
 *
 * @param description, optional, The description of the issue level security item.
 * @param id, optional, The ID of the issue level security item.
 * @param isDefault, optional, Whether the issue level security item is the default.
 * @param issueSecuritySchemeId, optional, The ID of the issue level security scheme.
 * @param name, optional, The name of the issue level security item.
 * @param self, optional, The URL of the issue level security item.
 */
@Serializable
data class SecurityLevel(
    @SerialName("description") val description: String? = null,
    @SerialName("id") val id: String? = null,
    @SerialName("isDefault") val isDefault: Boolean? = null,
    @SerialName("issueSecuritySchemeId") val issueSecuritySchemeId: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("self") val self: String? = null
)