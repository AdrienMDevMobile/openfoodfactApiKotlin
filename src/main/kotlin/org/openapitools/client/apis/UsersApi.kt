/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import org.openapitools.client.models.PaginatedUserList

import com.squareup.moshi.Json

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.PartConfig
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class UsersApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "http://localhost")
        }
    }

    /**
     * 
     * 
     * @param orderBy Which field to use when ordering the results. (optional)
     * @param page A page number within the paginated result set. (optional)
     * @param priceCount  (optional)
     * @param priceCountGte  (optional)
     * @param priceCountLte  (optional)
     * @param size Number of results to return per page. (optional)
     * @return PaginatedUserList
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun usersList(orderBy: kotlin.String? = null, page: kotlin.Int? = null, priceCount: kotlin.Int? = null, priceCountGte: kotlin.Int? = null, priceCountLte: kotlin.Int? = null, size: kotlin.Int? = null) : PaginatedUserList {
        val localVarResponse = usersListWithHttpInfo(orderBy = orderBy, page = page, priceCount = priceCount, priceCountGte = priceCountGte, priceCountLte = priceCountLte, size = size)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PaginatedUserList
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * 
     * @param orderBy Which field to use when ordering the results. (optional)
     * @param page A page number within the paginated result set. (optional)
     * @param priceCount  (optional)
     * @param priceCountGte  (optional)
     * @param priceCountLte  (optional)
     * @param size Number of results to return per page. (optional)
     * @return ApiResponse<PaginatedUserList?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun usersListWithHttpInfo(orderBy: kotlin.String?, page: kotlin.Int?, priceCount: kotlin.Int?, priceCountGte: kotlin.Int?, priceCountLte: kotlin.Int?, size: kotlin.Int?) : ApiResponse<PaginatedUserList?> {
        val localVariableConfig = usersListRequestConfig(orderBy = orderBy, page = page, priceCount = priceCount, priceCountGte = priceCountGte, priceCountLte = priceCountLte, size = size)

        return request<Unit, PaginatedUserList>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation usersList
     *
     * @param orderBy Which field to use when ordering the results. (optional)
     * @param page A page number within the paginated result set. (optional)
     * @param priceCount  (optional)
     * @param priceCountGte  (optional)
     * @param priceCountLte  (optional)
     * @param size Number of results to return per page. (optional)
     * @return RequestConfig
     */
    fun usersListRequestConfig(orderBy: kotlin.String?, page: kotlin.Int?, priceCount: kotlin.Int?, priceCountGte: kotlin.Int?, priceCountLte: kotlin.Int?, size: kotlin.Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (orderBy != null) {
                    put("order_by", listOf(orderBy.toString()))
                }
                if (page != null) {
                    put("page", listOf(page.toString()))
                }
                if (priceCount != null) {
                    put("price_count", listOf(priceCount.toString()))
                }
                if (priceCountGte != null) {
                    put("price_count__gte", listOf(priceCountGte.toString()))
                }
                if (priceCountLte != null) {
                    put("price_count__lte", listOf(priceCountLte.toString()))
                }
                if (size != null) {
                    put("size", listOf(size.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/api/v1/users",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
