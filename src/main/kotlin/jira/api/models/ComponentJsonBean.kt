/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 *
 * @param ari, optional
 * @param description, optional
 * @param id, optional
 * @param metadata, optional
 * @param name, optional
 * @param self, optional
 */
@Serializable
data class ComponentJsonBean(
    @SerialName("ari") val ari: String? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("id") val id: String? = null,
    @SerialName("metadata") val metadata: metadata? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("self") val self: String? = null
)