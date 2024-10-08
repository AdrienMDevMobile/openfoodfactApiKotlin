# StatusApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**statusRetrieve**](StatusApi.md#statusRetrieve) | **GET** /api/v1/status |  |


<a id="statusRetrieve"></a>
# **statusRetrieve**
> Status statusRetrieve()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StatusApi()
try {
    val result : Status = apiInstance.statusRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StatusApi#statusRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatusApi#statusRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Status**](Status.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

