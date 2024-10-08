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
 * @param priceCount 
 * @param priceMin 
 * @param priceMax 
 * @param priceAvg 
 */


data class PriceStats (

    @Json(name = "price__count")
    val priceCount: kotlin.Int,

    @Json(name = "price__min")
    val priceMin: kotlin.Double,

    @Json(name = "price__max")
    val priceMax: kotlin.Double,

    @Json(name = "price__avg")
    val priceAvg: kotlin.Double

) {


}

