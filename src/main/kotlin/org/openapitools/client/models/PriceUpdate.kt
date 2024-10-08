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

import org.openapitools.client.models.PatchedPriceUpdateCurrency
import org.openapitools.client.models.PatchedPriceUpdatePricePer

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param price 
 * @param priceIsDiscounted 
 * @param priceWithoutDiscount 
 * @param pricePer 
 * @param currency 
 * @param date 
 */


data class PriceUpdate (

    @Json(name = "price")
    val price: kotlin.Double? = null,

    @Json(name = "price_is_discounted")
    val priceIsDiscounted: kotlin.Boolean? = null,

    @Json(name = "price_without_discount")
    val priceWithoutDiscount: kotlin.Double? = null,

    @Json(name = "price_per")
    val pricePer: PatchedPriceUpdatePricePer? = null,

    @Json(name = "currency")
    val currency: PatchedPriceUpdateCurrency? = null,

    @Json(name = "date")
    val date: java.time.LocalDate? = null

) {


}

