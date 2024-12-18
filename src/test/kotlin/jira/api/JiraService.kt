package jira.api

import kotlinx.coroutines.runBlocking
import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import org.junit.jupiter.api.Test
import retrofit2.Retrofit

val jiraConfig = JiraConfig(
    baseUrl = "",
    email = "",
    token = ""
)

class JiraApiTest {

    @Test
    fun `api call`(): Unit = runBlocking {

        val client = OkHttpClient.Builder()
            .authenticator { _, response ->
                val credential: String = Credentials.basic(jiraConfig.email, jiraConfig.token)
                response.request.newBuilder().header("Authorization", credential).build()
            }
            .addInterceptor(Interceptor { chain ->
                chain.proceed(
                    chain.request().newBuilder()
                        .addHeader("Accept", "application/json")
                        .addHeader("Content-Type", "application/json")
                        .build()
                )
            })
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(jiraConfig.baseUrl)
            .client(client)
            .build()


        val api: JiraApi = retrofit.create(JiraApi::class.java)
        val issues = api.searchIssues()

    }
}
