# AuthApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**authCreate**](AuthApi.md#authCreate) | **POST** /api/v1/auth |  |
| [**sessionDestroy**](AuthApi.md#sessionDestroy) | **DELETE** /api/v1/session |  |
| [**sessionRetrieve**](AuthApi.md#sessionRetrieve) | **GET** /api/v1/session |  |


<a id="authCreate"></a>
# **authCreate**
> SessionResponse authCreate(login)



Authentication: provide username/password and get a bearer token in return.  - **username**: Open Food Facts user_id (not email) - **password**: user password (clear text, but HTTPS encrypted)  A **token** is returned. If the **set_cookie** parameter is set to 1, the token is also set as a cookie named \&quot;session\&quot; in the response.  To authenticate, you can either: - use the **Authorization** header with the **Bearer** scheme, e.g.: \&quot;Authorization: bearer token\&quot; - use the **session** cookie, e.g.: \&quot;Cookie: session&#x3D;token\&quot;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
val login : Login =  // Login | 
try {
    val result : SessionResponse = apiInstance.authCreate(login)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#authCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#authCreate")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **login** | [**Login**](Login.md)|  | |

### Return type

[**SessionResponse**](SessionResponse.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["opsession"] = ""
    ApiClient.apiKeyPrefix["opsession"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="sessionDestroy"></a>
# **sessionDestroy**
> sessionDestroy()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
try {
    apiInstance.sessionDestroy()
} catch (e: ClientException) {
    println("4xx response calling AuthApi#sessionDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#sessionDestroy")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="sessionRetrieve"></a>
# **sessionRetrieve**
> SessionFull sessionRetrieve()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AuthApi()
try {
    val result : SessionFull = apiInstance.sessionRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#sessionRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#sessionRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SessionFull**](SessionFull.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

