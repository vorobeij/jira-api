package jira.api

data class JiraConfig(
    val baseUrl: String,
    val email: String,
    val token: String,
)
