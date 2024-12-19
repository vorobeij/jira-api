/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.*

/**
 * A user with details as permitted by the user's Atlassian Account privacy settings. However, be aware of these exceptions:

 *  User record deleted from Atlassian: This occurs as the result of a right to be forgotten request. In this case, `displayName` provides an indication and other parameters have default values or are blank (for example, email is blank).
 *  User record corrupted: This occurs as a results of events such as a server import and can only happen to deleted users. In this case, `accountId` returns *unknown* and all other parameters have fallback values.
 *  User record unavailable: This usually occurs due to an internal service outage. In this case, all parameters have fallback values.
 *
 * @param accountId, optional, The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.
 * @param accountType, optional, The user account type. Can take the following values:

 *  `atlassian` regular Atlassian user account
 *  `app` system account used for Connect applications and OAuth to represent external systems
 *  `customer` Jira Service Desk account representing an external service desk
 * @param active, optional, Whether the user is active.
 * @param applicationRoles, optional, The application roles the user is assigned to.
 * @param avatarUrls, optional, The avatars of the user.
 * @param displayName, optional, The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
 * @param emailAddress, optional, The email address of the user. Depending on the user’s privacy setting, this may be returned as null.
 * @param expand, optional, Expand options that include additional user details in the response.
 * @param groups, optional, The groups that the user belongs to.
 * @param key, optional, This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
 * @param locale, optional, The locale of the user. Depending on the user’s privacy setting, this may be returned as null.
 * @param name, optional, This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
 * @param self, optional, The URL of the user.
 * @param timeZone, optional, The time zone specified in the user's profile. Depending on the user’s privacy setting, this may be returned as null.
 */
@Serializable
data class User(
    @SerialName("accountId") val accountId: String? = null,
    @SerialName("accountType") val accountType: String? = null,
    @SerialName("active") val active: Boolean? = null,
    @SerialName("applicationRoles") val applicationRoles: applicationRoles? = null,
    @SerialName("avatarUrls") val avatarUrls: avatarUrls? = null,
    @SerialName("displayName") val displayName: String? = null,
    @SerialName("emailAddress") val emailAddress: String? = null,
    @SerialName("expand") val expand: String? = null,
    @SerialName("groups") val groups: groups? = null,
    @SerialName("key") val key: String? = null,
    @SerialName("locale") val locale: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("self") val self: String? = null,
    @SerialName("timeZone") val timeZone: String? = null
)