/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A webhook.
 *
 * @param events, required, The Jira events that trigger the webhook.
 * @param expirationDate, optional, The date after which the webhook is no longer sent. Use [Extend webhook life](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-webhooks/#api-rest-api-3-webhook-refresh-put) to extend the date.
 * @param fieldIdsFilter, optional, A list of field IDs. When the issue changelog contains any of the fields, the webhook `jira:issue_updated` is sent. If this parameter is not present, the app is notified about all field updates.
 * @param id, required, The ID of the webhook.
 * @param issuePropertyKeysFilter, optional, A list of issue property keys. A change of those issue properties triggers the `issue_property_set` or `issue_property_deleted` webhooks. If this parameter is not present, the app is notified about all issue property updates.
 * @param jqlFilter, required, The JQL filter that specifies which issues the webhook is sent for.
 */
@Serializable
data class Webhook(
    @SerialName("events") val events: List<String>,
    @SerialName("expirationDate") val expirationDate: Long? = null,
    @SerialName("fieldIdsFilter") val fieldIdsFilter: List<String>? = null,
    @SerialName("id") val id: Long,
    @SerialName("issuePropertyKeysFilter") val issuePropertyKeysFilter: List<String>? = null,
    @SerialName("jqlFilter") val jqlFilter: String
)