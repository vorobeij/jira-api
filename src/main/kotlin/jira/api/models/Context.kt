/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A context.
 *
 * @param id, optional, The ID of the context.
 * @param name, optional, The name of the context.
 * @param scope, optional, The scope of the context.
 */
@Serializable
data class Context(
    @SerialName("id") val id: Long? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("scope") val scope: Scope? = null
)