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

import org.openapitools.client.models.LocationOsmTypeEnum

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param osmId 
 * @param osmType 
 * @param updated 
 * @param osmName 
 * @param osmDisplayName 
 * @param osmTagKey 
 * @param osmTagValue 
 * @param osmAddressPostcode 
 * @param osmAddressCity 
 * @param osmAddressCountry 
 * @param osmAddressCountryCode 
 * @param osmLat 
 * @param osmLon 
 * @param priceCount 
 * @param userCount 
 * @param productCount 
 * @param proofCount 
 * @param created 
 */


data class Location (

    @Json(name = "id")
    val id: kotlin.Int,

    @Json(name = "osm_id")
    val osmId: kotlin.Long,

    @Json(name = "osm_type")
    val osmType: LocationOsmTypeEnum,

    @Json(name = "updated")
    val updated: java.time.OffsetDateTime,

    @Json(name = "osm_name")
    val osmName: kotlin.String? = null,

    @Json(name = "osm_display_name")
    val osmDisplayName: kotlin.String? = null,

    @Json(name = "osm_tag_key")
    val osmTagKey: kotlin.String? = null,

    @Json(name = "osm_tag_value")
    val osmTagValue: kotlin.String? = null,

    @Json(name = "osm_address_postcode")
    val osmAddressPostcode: kotlin.String? = null,

    @Json(name = "osm_address_city")
    val osmAddressCity: kotlin.String? = null,

    @Json(name = "osm_address_country")
    val osmAddressCountry: kotlin.String? = null,

    @Json(name = "osm_address_country_code")
    val osmAddressCountryCode: kotlin.String? = null,

    @Json(name = "osm_lat")
    val osmLat: kotlin.Double? = null,

    @Json(name = "osm_lon")
    val osmLon: kotlin.Double? = null,

    @Json(name = "price_count")
    val priceCount: kotlin.Int? = null,

    @Json(name = "user_count")
    val userCount: kotlin.Int? = null,

    @Json(name = "product_count")
    val productCount: kotlin.Int? = null,

    @Json(name = "proof_count")
    val proofCount: kotlin.Int? = null,

    @Json(name = "created")
    val created: java.time.OffsetDateTime? = null

) {


}

