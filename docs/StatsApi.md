# StatsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**statsRetrieve**](StatsApi.md#statsRetrieve) | **GET** /api/v1/stats |  |


<a id="statsRetrieve"></a>
# **statsRetrieve**
> TotalStats statsRetrieve()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StatsApi()
try {
    val result : TotalStats = apiInstance.statsRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StatsApi#statsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatsApi#statsRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TotalStats**](TotalStats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

