/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * Issue security level member.
 *
 * @param holder, required, The user or group being granted the permission. It consists of a `type` and a type-dependent `parameter`. See [Holder object](../api-group-permission-schemes/#holder-object) in *Get all permission schemes* for more information.
 * @param id, required, The ID of the issue security level member.
 * @param issueSecurityLevelId, required, The ID of the issue security level.
 * @param issueSecuritySchemeId, required, The ID of the issue security scheme.
 * @param managed, optional
 */
@Serializable
data class SecurityLevelMember(
    @SerialName("holder") val holder: holder,
    @SerialName("id") val id: String,
    @SerialName("issueSecurityLevelId") val issueSecurityLevelId: String,
    @SerialName("issueSecuritySchemeId") val issueSecuritySchemeId: String,
    @SerialName("managed") val managed: Boolean? = null
)