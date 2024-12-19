/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * Mapping of issue priorities for changes in priority schemes.
 *
 * @param in, optional, The mapping of priorities for issues being migrated **into** this priority scheme. Key is the old priority ID, value is the new priority ID (must exist in this priority scheme).
 * @param out, optional, The mapping of priorities for issues being migrated **out of** this priority scheme. Key is the old priority ID (must exist in this priority scheme), value is the new priority ID (must exist in the default priority scheme). Required for updating an existing priority scheme. Not used when creating a new priority scheme.
 */
@Serializable
data class PriorityMapping(
    @SerialName("in") val in: in? = null,
    @SerialName("out") val out: out? = null
)