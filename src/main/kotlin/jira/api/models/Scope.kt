/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * The projects the item is associated with. Indicated for items associated with [next-gen projects](https://confluence.atlassian.com/x/loMyO).
 *
 * @param project, optional, The project the item has scope in.
 * @param type, optional, The type of scope.
 */
@Serializable
data class Scope(
    @SerialName("project") val project: project? = null,
    @SerialName("type") val type: String? = null
)