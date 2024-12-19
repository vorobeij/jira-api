/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of global and project permissions granted to the user.
 *
 * @param globalPermissions, required, List of permissions granted to the user.
 * @param projectPermissions, required, List of project permissions and the projects and issues those permissions provide access to.
 */
@Serializable
data class BulkPermissionGrants(
    @SerialName("globalPermissions") val globalPermissions: List<String>,
    @SerialName("projectPermissions") val projectPermissions: List<BulkProjectPermissionGrants>
)