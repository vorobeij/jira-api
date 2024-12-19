/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The details of a UI modification.
 *
 * @param contexts, optional, List of contexts of the UI modification. The maximum number of contexts is 1000.
 * @param data, optional, The data of the UI modification. The maximum size of the data is 50000 characters.
 * @param description, optional, The description of the UI modification. The maximum length is 255 characters.
 * @param id, required, The ID of the UI modification.
 * @param name, required, The name of the UI modification. The maximum length is 255 characters.
 * @param self, required, The URL of the UI modification.
 */
@Serializable
data class UiModificationDetails(
    @SerialName("contexts") val contexts: List<UiModificationContextDetails>? = null,
    @SerialName("data") val data: String? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("id") val id: String,
    @SerialName("name") val name: String,
    @SerialName("self") val self: String
)