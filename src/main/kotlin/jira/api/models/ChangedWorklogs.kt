/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * List of changed worklogs.
 *
 * @param lastPage, optional
 * @param nextPage, optional, The URL of the next list of changed worklogs.
 * @param self, optional, The URL of this changed worklogs list.
 * @param since, optional, The datetime of the first worklog item in the list.
 * @param until, optional, The datetime of the last worklog item in the list.
 * @param values, optional, Changed worklog list.
 */
@Serializable
data class ChangedWorklogs(
    @SerialName("lastPage") val lastPage: Boolean? = null,
    @SerialName("nextPage") val nextPage: String? = null,
    @SerialName("self") val self: String? = null,
    @SerialName("since") val since: Long? = null,
    @SerialName("until") val until: Long? = null,
    @SerialName("values") val values: List<ChangedWorklog>? = null
)