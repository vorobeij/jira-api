/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of webhooks to register.
 *
 * @param url, required, The URL that specifies where to send the webhooks. This URL must use the same base URL as the Connect app. Only a single URL per app is allowed to be registered.
 * @param webhooks, required, A list of webhooks.
 */
@Serializable
data class WebhookRegistrationDetails(
    @SerialName("url") val url: String,
    @SerialName("webhooks") val webhooks: List<WebhookDetails>
)