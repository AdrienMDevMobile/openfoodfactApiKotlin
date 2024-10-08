# org.openapitools.client - Kotlin client library for Open Food Facts open-prices REST API

Open Prices API allows you to add product prices

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate an API client.

- API version: 0.0.0 (api)
- Package version: 
- Generator version: 7.7.0
- Build package: org.openapitools.codegen.languages.KotlinClientCodegen
For more information, please visit [https://world.openfoodfacts.org](https://world.openfoodfacts.org)

## Requires

* Kotlin 1.7.21
* Gradle 7.5

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

| Class | Method | HTTP request | Description |
| ------------ | ------------- | ------------- | ------------- |
| *ApiApi* | [**apiSchemaRetrieve**](docs/ApiApi.md#apischemaretrieve) | **GET** /api/schema |  |
| *AuthApi* | [**authCreate**](docs/AuthApi.md#authcreate) | **POST** /api/v1/auth |  |
| *AuthApi* | [**sessionDestroy**](docs/AuthApi.md#sessiondestroy) | **DELETE** /api/v1/session |  |
| *AuthApi* | [**sessionRetrieve**](docs/AuthApi.md#sessionretrieve) | **GET** /api/v1/session |  |
| *LocationsApi* | [**locationsCreate**](docs/LocationsApi.md#locationscreate) | **POST** /api/v1/locations |  |
| *LocationsApi* | [**locationsList**](docs/LocationsApi.md#locationslist) | **GET** /api/v1/locations |  |
| *LocationsApi* | [**locationsOsmRetrieve**](docs/LocationsApi.md#locationsosmretrieve) | **GET** /api/v1/locations/osm/{osm_type}/{osm_id} |  |
| *LocationsApi* | [**locationsRetrieve**](docs/LocationsApi.md#locationsretrieve) | **GET** /api/v1/locations/{id} |  |
| *PricesApi* | [**pricesCreate**](docs/PricesApi.md#pricescreate) | **POST** /api/v1/prices |  |
| *PricesApi* | [**pricesDestroy**](docs/PricesApi.md#pricesdestroy) | **DELETE** /api/v1/prices/{id} |  |
| *PricesApi* | [**pricesList**](docs/PricesApi.md#priceslist) | **GET** /api/v1/prices |  |
| *PricesApi* | [**pricesPartialUpdate**](docs/PricesApi.md#pricespartialupdate) | **PATCH** /api/v1/prices/{id} |  |
| *PricesApi* | [**pricesRetrieve**](docs/PricesApi.md#pricesretrieve) | **GET** /api/v1/prices/{id} |  |
| *PricesApi* | [**pricesStatsRetrieve**](docs/PricesApi.md#pricesstatsretrieve) | **GET** /api/v1/prices/stats |  |
| *ProductsApi* | [**productsCodeRetrieve**](docs/ProductsApi.md#productscoderetrieve) | **GET** /api/v1/products/code/{code} |  |
| *ProductsApi* | [**productsList**](docs/ProductsApi.md#productslist) | **GET** /api/v1/products |  |
| *ProductsApi* | [**productsRetrieve**](docs/ProductsApi.md#productsretrieve) | **GET** /api/v1/products/{id} |  |
| *ProofsApi* | [**proofsDestroy**](docs/ProofsApi.md#proofsdestroy) | **DELETE** /api/v1/proofs/{id} |  |
| *ProofsApi* | [**proofsList**](docs/ProofsApi.md#proofslist) | **GET** /api/v1/proofs |  |
| *ProofsApi* | [**proofsPartialUpdate**](docs/ProofsApi.md#proofspartialupdate) | **PATCH** /api/v1/proofs/{id} |  |
| *ProofsApi* | [**proofsRetrieve**](docs/ProofsApi.md#proofsretrieve) | **GET** /api/v1/proofs/{id} |  |
| *ProofsApi* | [**proofsUploadCreate**](docs/ProofsApi.md#proofsuploadcreate) | **POST** /api/v1/proofs/upload |  |
| *StatsApi* | [**statsRetrieve**](docs/StatsApi.md#statsretrieve) | **GET** /api/v1/stats |  |
| *StatusApi* | [**statusRetrieve**](docs/StatusApi.md#statusretrieve) | **GET** /api/v1/status |  |
| *UsersApi* | [**usersList**](docs/UsersApi.md#userslist) | **GET** /api/v1/users |  |


<a id="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.BlankEnum](docs/BlankEnum.md)
 - [org.openapitools.client.models.CurrencyEnum](docs/CurrencyEnum.md)
 - [org.openapitools.client.models.Location](docs/Location.md)
 - [org.openapitools.client.models.LocationCreate](docs/LocationCreate.md)
 - [org.openapitools.client.models.LocationOsmTypeEnum](docs/LocationOsmTypeEnum.md)
 - [org.openapitools.client.models.Login](docs/Login.md)
 - [org.openapitools.client.models.NullEnum](docs/NullEnum.md)
 - [org.openapitools.client.models.PaginatedLocationList](docs/PaginatedLocationList.md)
 - [org.openapitools.client.models.PaginatedPriceFullList](docs/PaginatedPriceFullList.md)
 - [org.openapitools.client.models.PaginatedProductFullList](docs/PaginatedProductFullList.md)
 - [org.openapitools.client.models.PaginatedProofFullList](docs/PaginatedProofFullList.md)
 - [org.openapitools.client.models.PaginatedUserList](docs/PaginatedUserList.md)
 - [org.openapitools.client.models.PatchedPriceUpdate](docs/PatchedPriceUpdate.md)
 - [org.openapitools.client.models.PatchedPriceUpdateCurrency](docs/PatchedPriceUpdateCurrency.md)
 - [org.openapitools.client.models.PatchedPriceUpdatePricePer](docs/PatchedPriceUpdatePricePer.md)
 - [org.openapitools.client.models.PatchedProofUpdate](docs/PatchedProofUpdate.md)
 - [org.openapitools.client.models.PriceCreate](docs/PriceCreate.md)
 - [org.openapitools.client.models.PriceCreateLocationOsmType](docs/PriceCreateLocationOsmType.md)
 - [org.openapitools.client.models.PriceFull](docs/PriceFull.md)
 - [org.openapitools.client.models.PricePerEnum](docs/PricePerEnum.md)
 - [org.openapitools.client.models.PriceStats](docs/PriceStats.md)
 - [org.openapitools.client.models.PriceUpdate](docs/PriceUpdate.md)
 - [org.openapitools.client.models.ProductFull](docs/ProductFull.md)
 - [org.openapitools.client.models.ProductFullSource](docs/ProductFullSource.md)
 - [org.openapitools.client.models.Proof](docs/Proof.md)
 - [org.openapitools.client.models.ProofFull](docs/ProofFull.md)
 - [org.openapitools.client.models.ProofUpdate](docs/ProofUpdate.md)
 - [org.openapitools.client.models.SessionFull](docs/SessionFull.md)
 - [org.openapitools.client.models.SessionResponse](docs/SessionResponse.md)
 - [org.openapitools.client.models.SourceEnum](docs/SourceEnum.md)
 - [org.openapitools.client.models.Status](docs/Status.md)
 - [org.openapitools.client.models.TotalStats](docs/TotalStats.md)
 - [org.openapitools.client.models.TypeEnum](docs/TypeEnum.md)
 - [org.openapitools.client.models.User](docs/User.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="basicAuth"></a>
### basicAuth

- **Type**: HTTP basic authentication

<a id="cookieAuth"></a>
### cookieAuth

- **Type**: API key
- **API key parameter name**: opsession
- **Location**: 



## Author

contact@openfoodfacts.org
