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

import org.openapitools.client.models.User

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param count 
 * @param results 
 * @param next 
 * @param previous 
 */


data class PaginatedUserList (

    @Json(name = "count")
    val count: kotlin.Int,

    @Json(name = "results")
    val results: kotlin.collections.List<User>,

    @Json(name = "next")
    val next: java.net.URI? = null,

    @Json(name = "previous")
    val previous: java.net.URI? = null

) {


}

