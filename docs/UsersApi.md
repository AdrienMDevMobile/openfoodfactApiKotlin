# UsersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**usersList**](UsersApi.md#usersList) | **GET** /api/v1/users |  |


<a id="usersList"></a>
# **usersList**
> PaginatedUserList usersList(orderBy, page, priceCount, priceCountGte, priceCountLte, size)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val orderBy : kotlin.String = orderBy_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val priceCount : kotlin.Int = 56 // kotlin.Int | 
val priceCountGte : kotlin.Int = 56 // kotlin.Int | 
val priceCountLte : kotlin.Int = 56 // kotlin.Int | 
val size : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
try {
    val result : PaginatedUserList = apiInstance.usersList(orderBy, page, priceCount, priceCountGte, priceCountLte, size)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersList")
    e.printStackTrace()
}
```

### Parameters
| **orderBy** | **kotlin.String**| Which field to use when ordering the results. | [optional] |
| **page** | **kotlin.Int**| A page number within the paginated result set. | [optional] |
| **priceCount** | **kotlin.Int**|  | [optional] |
| **priceCountGte** | **kotlin.Int**|  | [optional] |
| **priceCountLte** | **kotlin.Int**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **size** | **kotlin.Int**| Number of results to return per page. | [optional] |

### Return type

[**PaginatedUserList**](PaginatedUserList.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["opsession"] = ""
    ApiClient.apiKeyPrefix["opsession"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

