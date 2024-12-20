/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of a custom field.
 *
 * @param description, optional, The description of the custom field. The maximum length is 40000 characters.
 * @param name, optional, The name of the custom field. It doesn't have to be unique. The maximum length is 255 characters.
 * @param searcherKey, optional, The searcher that defines the way the field is searched in Jira. It can be set to `null`, otherwise you must specify the valid searcher for the field type, as listed below (abbreviated values shown):

 *  `cascadingselect`: `cascadingselectsearcher`
 *  `datepicker`: `daterange`
 *  `datetime`: `datetimerange`
 *  `float`: `exactnumber` or `numberrange`
 *  `grouppicker`: `grouppickersearcher`
 *  `importid`: `exactnumber` or `numberrange`
 *  `labels`: `labelsearcher`
 *  `multicheckboxes`: `multiselectsearcher`
 *  `multigrouppicker`: `multiselectsearcher`
 *  `multiselect`: `multiselectsearcher`
 *  `multiuserpicker`: `userpickergroupsearcher`
 *  `multiversion`: `versionsearcher`
 *  `project`: `projectsearcher`
 *  `radiobuttons`: `multiselectsearcher`
 *  `readonlyfield`: `textsearcher`
 *  `select`: `multiselectsearcher`
 *  `textarea`: `textsearcher`
 *  `textfield`: `textsearcher`
 *  `url`: `exacttextsearcher`
 *  `userpicker`: `userpickergroupsearcher`
 *  `version`: `versionsearcher`
 */
@Serializable
data class UpdateCustomFieldDetails(
    @SerialName("description") val description: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("searcherKey") val searcherKey: String? = null
)