# LocationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**locationsCreate**](LocationsApi.md#locationsCreate) | **POST** /api/v1/locations |  |
| [**locationsList**](LocationsApi.md#locationsList) | **GET** /api/v1/locations |  |
| [**locationsOsmRetrieve**](LocationsApi.md#locationsOsmRetrieve) | **GET** /api/v1/locations/osm/{osm_type}/{osm_id} |  |
| [**locationsRetrieve**](LocationsApi.md#locationsRetrieve) | **GET** /api/v1/locations/{id} |  |


<a id="locationsCreate"></a>
# **locationsCreate**
> LocationCreate locationsCreate(locationCreate)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationsApi()
val locationCreate : LocationCreate =  // LocationCreate | 
try {
    val result : LocationCreate = apiInstance.locationsCreate(locationCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationsApi#locationsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationsApi#locationsCreate")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locationCreate** | [**LocationCreate**](LocationCreate.md)|  | |

### Return type

[**LocationCreate**](LocationCreate.md)

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

<a id="locationsList"></a>
# **locationsList**
> PaginatedLocationList locationsList(orderBy, osmAddressCityLike, osmAddressCountryLike, osmNameLike, page, priceCount, priceCountGte, priceCountLte, size)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationsApi()
val orderBy : kotlin.String = orderBy_example // kotlin.String | Which field to use when ordering the results.
val osmAddressCityLike : kotlin.String = osmAddressCityLike_example // kotlin.String | 
val osmAddressCountryLike : kotlin.String = osmAddressCountryLike_example // kotlin.String | 
val osmNameLike : kotlin.String = osmNameLike_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val priceCount : kotlin.Int = 56 // kotlin.Int | 
val priceCountGte : kotlin.Int = 56 // kotlin.Int | 
val priceCountLte : kotlin.Int = 56 // kotlin.Int | 
val size : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
try {
    val result : PaginatedLocationList = apiInstance.locationsList(orderBy, osmAddressCityLike, osmAddressCountryLike, osmNameLike, page, priceCount, priceCountGte, priceCountLte, size)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationsApi#locationsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationsApi#locationsList")
    e.printStackTrace()
}
```

### Parameters
| **orderBy** | **kotlin.String**| Which field to use when ordering the results. | [optional] |
| **osmAddressCityLike** | **kotlin.String**|  | [optional] |
| **osmAddressCountryLike** | **kotlin.String**|  | [optional] |
| **osmNameLike** | **kotlin.String**|  | [optional] |
| **page** | **kotlin.Int**| A page number within the paginated result set. | [optional] |
| **priceCount** | **kotlin.Int**|  | [optional] |
| **priceCountGte** | **kotlin.Int**|  | [optional] |
| **priceCountLte** | **kotlin.Int**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **size** | **kotlin.Int**| Number of results to return per page. | [optional] |

### Return type

[**PaginatedLocationList**](PaginatedLocationList.md)

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

<a id="locationsOsmRetrieve"></a>
# **locationsOsmRetrieve**
> Location locationsOsmRetrieve(osmId, osmType)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationsApi()
val osmId : kotlin.String = osmId_example // kotlin.String | 
val osmType : kotlin.String = osmType_example // kotlin.String | 
try {
    val result : Location = apiInstance.locationsOsmRetrieve(osmId, osmType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationsApi#locationsOsmRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationsApi#locationsOsmRetrieve")
    e.printStackTrace()
}
```

### Parameters
| **osmId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **osmType** | **kotlin.String**|  | |

### Return type

[**Location**](Location.md)

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

<a id="locationsRetrieve"></a>
# **locationsRetrieve**
> Location locationsRetrieve(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationsApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Location.
try {
    val result : Location = apiInstance.locationsRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationsApi#locationsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationsApi#locationsRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| A unique integer value identifying this Location. | |

### Return type

[**Location**](Location.md)

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

