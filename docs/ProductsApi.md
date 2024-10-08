# ProductsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**productsCodeRetrieve**](ProductsApi.md#productsCodeRetrieve) | **GET** /api/v1/products/code/{code} |  |
| [**productsList**](ProductsApi.md#productsList) | **GET** /api/v1/products |  |
| [**productsRetrieve**](ProductsApi.md#productsRetrieve) | **GET** /api/v1/products/{id} |  |


<a id="productsCodeRetrieve"></a>
# **productsCodeRetrieve**
> ProductFull productsCodeRetrieve(code)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductsApi()
val code : kotlin.String = code_example // kotlin.String | 
try {
    val result : ProductFull = apiInstance.productsCodeRetrieve(code)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsApi#productsCodeRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsApi#productsCodeRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **code** | **kotlin.String**|  | |

### Return type

[**ProductFull**](ProductFull.md)

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

<a id="productsList"></a>
# **productsList**
> PaginatedProductFullList productsList(brandsLike, brandsTagsContains, categoriesTagsContains, code, ecoscoreGrade, labelsTagsContains, novaGroup, nutriscoreGrade, orderBy, page, priceCount, priceCountGte, priceCountLte, productNameLike, size, source, uniqueScansNGte)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductsApi()
val brandsLike : kotlin.String = brandsLike_example // kotlin.String | 
val brandsTagsContains : kotlin.String = brandsTagsContains_example // kotlin.String | 
val categoriesTagsContains : kotlin.String = categoriesTagsContains_example // kotlin.String | 
val code : kotlin.String = code_example // kotlin.String | 
val ecoscoreGrade : kotlin.String = ecoscoreGrade_example // kotlin.String | 
val labelsTagsContains : kotlin.String = labelsTagsContains_example // kotlin.String | 
val novaGroup : kotlin.Int = 56 // kotlin.Int | 
val nutriscoreGrade : kotlin.String = nutriscoreGrade_example // kotlin.String | 
val orderBy : kotlin.String = orderBy_example // kotlin.String | Which field to use when ordering the results.
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val priceCount : kotlin.Int = 56 // kotlin.Int | 
val priceCountGte : kotlin.Int = 56 // kotlin.Int | 
val priceCountLte : kotlin.Int = 56 // kotlin.Int | 
val productNameLike : kotlin.String = productNameLike_example // kotlin.String | 
val size : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val source : kotlin.String = source_example // kotlin.String | * `off` - off * `obf` - obf * `opff` - opff * `opf` - opf * `off_pro` - off_pro
val uniqueScansNGte : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : PaginatedProductFullList = apiInstance.productsList(brandsLike, brandsTagsContains, categoriesTagsContains, code, ecoscoreGrade, labelsTagsContains, novaGroup, nutriscoreGrade, orderBy, page, priceCount, priceCountGte, priceCountLte, productNameLike, size, source, uniqueScansNGte)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsApi#productsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsApi#productsList")
    e.printStackTrace()
}
```

### Parameters
| **brandsLike** | **kotlin.String**|  | [optional] |
| **brandsTagsContains** | **kotlin.String**|  | [optional] |
| **categoriesTagsContains** | **kotlin.String**|  | [optional] |
| **code** | **kotlin.String**|  | [optional] |
| **ecoscoreGrade** | **kotlin.String**|  | [optional] |
| **labelsTagsContains** | **kotlin.String**|  | [optional] |
| **novaGroup** | **kotlin.Int**|  | [optional] |
| **nutriscoreGrade** | **kotlin.String**|  | [optional] |
| **orderBy** | **kotlin.String**| Which field to use when ordering the results. | [optional] |
| **page** | **kotlin.Int**| A page number within the paginated result set. | [optional] |
| **priceCount** | **kotlin.Int**|  | [optional] |
| **priceCountGte** | **kotlin.Int**|  | [optional] |
| **priceCountLte** | **kotlin.Int**|  | [optional] |
| **productNameLike** | **kotlin.String**|  | [optional] |
| **size** | **kotlin.Int**| Number of results to return per page. | [optional] |
| **source** | **kotlin.String**| * &#x60;off&#x60; - off * &#x60;obf&#x60; - obf * &#x60;opff&#x60; - opff * &#x60;opf&#x60; - opf * &#x60;off_pro&#x60; - off_pro | [optional] [enum: obf, off, off_pro, opf, opff] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **uniqueScansNGte** | **kotlin.Int**|  | [optional] |

### Return type

[**PaginatedProductFullList**](PaginatedProductFullList.md)

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

<a id="productsRetrieve"></a>
# **productsRetrieve**
> ProductFull productsRetrieve(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductsApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Product.
try {
    val result : ProductFull = apiInstance.productsRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductsApi#productsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductsApi#productsRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| A unique integer value identifying this Product. | |

### Return type

[**ProductFull**](ProductFull.md)

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

