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

package org.openapitools.client.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param userId 
 * @param priceCount 
 * @param locationCount 
 * @param productCount 
 * @param proofCount 
 */


data class User (

    @Json(name = "user_id")
    val userId: kotlin.String,

    @Json(name = "price_count")
    val priceCount: kotlin.Int? = null,

    @Json(name = "location_count")
    val locationCount: kotlin.Int? = null,

    @Json(name = "product_count")
    val productCount: kotlin.Int? = null,

    @Json(name = "proof_count")
    val proofCount: kotlin.Int? = null

) {


}

