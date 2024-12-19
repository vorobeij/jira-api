/**
 * ⚠️ Do not edit manually ⚠️
 * Generated by openapi-generate. See project's `openapi-generate.sh` for details
 */
package jira.api.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Meta data describing the `issues` context variable.This bean will be replacing IssuesMetaBean bean as part of new `evaluate` endpoint
 *
 * @param jExpEvaluateIssuesJqlMetaDataBean, optional, The description of the page of issues loaded by the provided JQL query.This bean will be replacing IssuesJqlMetaDataBean bean as part of new `evaluate` endpoint
 */
@Serializable
data class JExpEvaluateIssuesMetaBean(
    @SerialName("jExpEvaluateIssuesJqlMetaDataBean") val jExpEvaluateIssuesJqlMetaDataBean: JExpEvaluateIssuesJqlMetaDataBean? = null
)