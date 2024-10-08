# ProofsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**proofsDestroy**](ProofsApi.md#proofsDestroy) | **DELETE** /api/v1/proofs/{id} |  |
| [**proofsList**](ProofsApi.md#proofsList) | **GET** /api/v1/proofs |  |
| [**proofsPartialUpdate**](ProofsApi.md#proofsPartialUpdate) | **PATCH** /api/v1/proofs/{id} |  |
| [**proofsRetrieve**](ProofsApi.md#proofsRetrieve) | **GET** /api/v1/proofs/{id} |  |
| [**proofsUploadCreate**](ProofsApi.md#proofsUploadCreate) | **POST** /api/v1/proofs/upload |  |


<a id="proofsDestroy"></a>
# **proofsDestroy**
> proofsDestroy(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Proof.
try {
    apiInstance.proofsDestroy(id)
} catch (e: ClientException) {
    println("4xx response calling ProofsApi#proofsDestroy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsApi#proofsDestroy")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| A unique integer value identifying this Proof. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="proofsList"></a>
# **proofsList**
> PaginatedProofFullList proofsList(createdGte, createdLte, currency, date, dateGt, dateGte, dateLt, dateLte, dateMonth, dateYear, locationId, locationIdIsnull, locationOsmId, locationOsmType, orderBy, owner, page, priceCount, priceCountGte, priceCountLte, size, type)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsApi()
val createdGte : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val createdLte : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val currency : kotlin.String = currency_example // kotlin.String | * `ADP` - ADP * `AED` - AED * `AFA` - AFA * `AFN` - AFN * `ALK` - ALK * `ALL` - ALL * `AMD` - AMD * `ANG` - ANG * `AOA` - AOA * `AOK` - AOK * `AON` - AON * `AOR` - AOR * `ARA` - ARA * `ARL` - ARL * `ARM` - ARM * `ARP` - ARP * `ARS` - ARS * `ATS` - ATS * `AUD` - AUD * `AWG` - AWG * `AZM` - AZM * `AZN` - AZN * `BAD` - BAD * `BAM` - BAM * `BAN` - BAN * `BBD` - BBD * `BDT` - BDT * `BEC` - BEC * `BEF` - BEF * `BEL` - BEL * `BGL` - BGL * `BGM` - BGM * `BGN` - BGN * `BGO` - BGO * `BHD` - BHD * `BIF` - BIF * `BMD` - BMD * `BND` - BND * `BOB` - BOB * `BOL` - BOL * `BOP` - BOP * `BOV` - BOV * `BRB` - BRB * `BRC` - BRC * `BRE` - BRE * `BRL` - BRL * `BRN` - BRN * `BRR` - BRR * `BRZ` - BRZ * `BSD` - BSD * `BTN` - BTN * `BUK` - BUK * `BWP` - BWP * `BYB` - BYB * `BYN` - BYN * `BYR` - BYR * `BZD` - BZD * `CAD` - CAD * `CDF` - CDF * `CHE` - CHE * `CHF` - CHF * `CHW` - CHW * `CLE` - CLE * `CLF` - CLF * `CLP` - CLP * `CNH` - CNH * `CNX` - CNX * `CNY` - CNY * `COP` - COP * `COU` - COU * `CRC` - CRC * `CSD` - CSD * `CSK` - CSK * `CUC` - CUC * `CUP` - CUP * `CVE` - CVE * `CYP` - CYP * `CZK` - CZK * `DDM` - DDM * `DEM` - DEM * `DJF` - DJF * `DKK` - DKK * `DOP` - DOP * `DZD` - DZD * `ECS` - ECS * `ECV` - ECV * `EEK` - EEK * `EGP` - EGP * `ERN` - ERN * `ESA` - ESA * `ESB` - ESB * `ESP` - ESP * `ETB` - ETB * `EUR` - EUR * `FIM` - FIM * `FJD` - FJD * `FKP` - FKP * `FRF` - FRF * `GBP` - GBP * `GEK` - GEK * `GEL` - GEL * `GHC` - GHC * `GHS` - GHS * `GIP` - GIP * `GMD` - GMD * `GNF` - GNF * `GNS` - GNS * `GQE` - GQE * `GRD` - GRD * `GTQ` - GTQ * `GWE` - GWE * `GWP` - GWP * `GYD` - GYD * `HKD` - HKD * `HNL` - HNL * `HRD` - HRD * `HRK` - HRK * `HTG` - HTG * `HUF` - HUF * `IDR` - IDR * `IEP` - IEP * `ILP` - ILP * `ILR` - ILR * `ILS` - ILS * `INR` - INR * `IQD` - IQD * `IRR` - IRR * `ISJ` - ISJ * `ISK` - ISK * `ITL` - ITL * `JMD` - JMD * `JOD` - JOD * `JPY` - JPY * `KES` - KES * `KGS` - KGS * `KHR` - KHR * `KMF` - KMF * `KPW` - KPW * `KRH` - KRH * `KRO` - KRO * `KRW` - KRW * `KWD` - KWD * `KYD` - KYD * `KZT` - KZT * `LAK` - LAK * `LBP` - LBP * `LKR` - LKR * `LRD` - LRD * `LSL` - LSL * `LTL` - LTL * `LTT` - LTT * `LUC` - LUC * `LUF` - LUF * `LUL` - LUL * `LVL` - LVL * `LVR` - LVR * `LYD` - LYD * `MAD` - MAD * `MAF` - MAF * `MCF` - MCF * `MDC` - MDC * `MDL` - MDL * `MGA` - MGA * `MGF` - MGF * `MKD` - MKD * `MKN` - MKN * `MLF` - MLF * `MMK` - MMK * `MNT` - MNT * `MOP` - MOP * `MRO` - MRO * `MRU` - MRU * `MTL` - MTL * `MTP` - MTP * `MUR` - MUR * `MVP` - MVP * `MVR` - MVR * `MWK` - MWK * `MXN` - MXN * `MXP` - MXP * `MXV` - MXV * `MYR` - MYR * `MZE` - MZE * `MZM` - MZM * `MZN` - MZN * `NAD` - NAD * `NGN` - NGN * `NIC` - NIC * `NIO` - NIO * `NLG` - NLG * `NOK` - NOK * `NPR` - NPR * `NZD` - NZD * `OMR` - OMR * `PAB` - PAB * `PEI` - PEI * `PEN` - PEN * `PES` - PES * `PGK` - PGK * `PHP` - PHP * `PKR` - PKR * `PLN` - PLN * `PLZ` - PLZ * `PTE` - PTE * `PYG` - PYG * `QAR` - QAR * `RHD` - RHD * `ROL` - ROL * `RON` - RON * `RSD` - RSD * `RUB` - RUB * `RUR` - RUR * `RWF` - RWF * `SAR` - SAR * `SBD` - SBD * `SCR` - SCR * `SDD` - SDD * `SDG` - SDG * `SDP` - SDP * `SEK` - SEK * `SGD` - SGD * `SHP` - SHP * `SIT` - SIT * `SKK` - SKK * `SLE` - SLE * `SLL` - SLL * `SOS` - SOS * `SRD` - SRD * `SRG` - SRG * `SSP` - SSP * `STD` - STD * `STN` - STN * `SUR` - SUR * `SVC` - SVC * `SYP` - SYP * `SZL` - SZL * `THB` - THB * `TJR` - TJR * `TJS` - TJS * `TMM` - TMM * `TMT` - TMT * `TND` - TND * `TOP` - TOP * `TPE` - TPE * `TRL` - TRL * `TRY` - TRY * `TTD` - TTD * `TWD` - TWD * `TZS` - TZS * `UAH` - UAH * `UAK` - UAK * `UGS` - UGS * `UGX` - UGX * `USD` - USD * `USN` - USN * `USS` - USS * `UYI` - UYI * `UYP` - UYP * `UYU` - UYU * `UYW` - UYW * `UZS` - UZS * `VEB` - VEB * `VED` - VED * `VEF` - VEF * `VES` - VES * `VND` - VND * `VNN` - VNN * `VUV` - VUV * `WST` - WST * `XAF` - XAF * `XAG` - XAG * `XAU` - XAU * `XBA` - XBA * `XBB` - XBB * `XBC` - XBC * `XBD` - XBD * `XCD` - XCD * `XDR` - XDR * `XEU` - XEU * `XFO` - XFO * `XFU` - XFU * `XOF` - XOF * `XPD` - XPD * `XPF` - XPF * `XPT` - XPT * `XRE` - XRE * `XSU` - XSU * `XTS` - XTS * `XUA` - XUA * `XXX` - XXX * `YDD` - YDD * `YER` - YER * `YUD` - YUD * `YUM` - YUM * `YUN` - YUN * `YUR` - YUR * `ZAL` - ZAL * `ZAR` - ZAR * `ZMK` - ZMK * `ZMW` - ZMW * `ZRN` - ZRN * `ZRZ` - ZRZ * `ZWD` - ZWD * `ZWL` - ZWL * `ZWR` - ZWR
val date : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | 
val dateGt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | 
val dateGte : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | 
val dateLt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | 
val dateLte : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | 
val dateMonth : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val dateYear : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val locationId : kotlin.Int = 56 // kotlin.Int | 
val locationIdIsnull : kotlin.Boolean = true // kotlin.Boolean | 
val locationOsmId : kotlin.Int = 56 // kotlin.Int | 
val locationOsmType : kotlin.String = locationOsmType_example // kotlin.String | * `NODE` - NODE * `WAY` - WAY * `RELATION` - RELATION
val orderBy : kotlin.String = orderBy_example // kotlin.String | Which field to use when ordering the results.
val owner : kotlin.String = owner_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | A page number within the paginated result set.
val priceCount : kotlin.Int = 56 // kotlin.Int | 
val priceCountGte : kotlin.Int = 56 // kotlin.Int | 
val priceCountLte : kotlin.Int = 56 // kotlin.Int | 
val size : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val type : kotlin.String = type_example // kotlin.String | * `PRICE_TAG` - PRICE_TAG * `RECEIPT` - RECEIPT * `GDPR_REQUEST` - GDPR_REQUEST * `SHOP_IMPORT` - SHOP_IMPORT
try {
    val result : PaginatedProofFullList = apiInstance.proofsList(createdGte, createdLte, currency, date, dateGt, dateGte, dateLt, dateLte, dateMonth, dateYear, locationId, locationIdIsnull, locationOsmId, locationOsmType, orderBy, owner, page, priceCount, priceCountGte, priceCountLte, size, type)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsApi#proofsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsApi#proofsList")
    e.printStackTrace()
}
```

### Parameters
| **createdGte** | **java.time.OffsetDateTime**|  | [optional] |
| **createdLte** | **java.time.OffsetDateTime**|  | [optional] |
| **currency** | **kotlin.String**| * &#x60;ADP&#x60; - ADP * &#x60;AED&#x60; - AED * &#x60;AFA&#x60; - AFA * &#x60;AFN&#x60; - AFN * &#x60;ALK&#x60; - ALK * &#x60;ALL&#x60; - ALL * &#x60;AMD&#x60; - AMD * &#x60;ANG&#x60; - ANG * &#x60;AOA&#x60; - AOA * &#x60;AOK&#x60; - AOK * &#x60;AON&#x60; - AON * &#x60;AOR&#x60; - AOR * &#x60;ARA&#x60; - ARA * &#x60;ARL&#x60; - ARL * &#x60;ARM&#x60; - ARM * &#x60;ARP&#x60; - ARP * &#x60;ARS&#x60; - ARS * &#x60;ATS&#x60; - ATS * &#x60;AUD&#x60; - AUD * &#x60;AWG&#x60; - AWG * &#x60;AZM&#x60; - AZM * &#x60;AZN&#x60; - AZN * &#x60;BAD&#x60; - BAD * &#x60;BAM&#x60; - BAM * &#x60;BAN&#x60; - BAN * &#x60;BBD&#x60; - BBD * &#x60;BDT&#x60; - BDT * &#x60;BEC&#x60; - BEC * &#x60;BEF&#x60; - BEF * &#x60;BEL&#x60; - BEL * &#x60;BGL&#x60; - BGL * &#x60;BGM&#x60; - BGM * &#x60;BGN&#x60; - BGN * &#x60;BGO&#x60; - BGO * &#x60;BHD&#x60; - BHD * &#x60;BIF&#x60; - BIF * &#x60;BMD&#x60; - BMD * &#x60;BND&#x60; - BND * &#x60;BOB&#x60; - BOB * &#x60;BOL&#x60; - BOL * &#x60;BOP&#x60; - BOP * &#x60;BOV&#x60; - BOV * &#x60;BRB&#x60; - BRB * &#x60;BRC&#x60; - BRC * &#x60;BRE&#x60; - BRE * &#x60;BRL&#x60; - BRL * &#x60;BRN&#x60; - BRN * &#x60;BRR&#x60; - BRR * &#x60;BRZ&#x60; - BRZ * &#x60;BSD&#x60; - BSD * &#x60;BTN&#x60; - BTN * &#x60;BUK&#x60; - BUK * &#x60;BWP&#x60; - BWP * &#x60;BYB&#x60; - BYB * &#x60;BYN&#x60; - BYN * &#x60;BYR&#x60; - BYR * &#x60;BZD&#x60; - BZD * &#x60;CAD&#x60; - CAD * &#x60;CDF&#x60; - CDF * &#x60;CHE&#x60; - CHE * &#x60;CHF&#x60; - CHF * &#x60;CHW&#x60; - CHW * &#x60;CLE&#x60; - CLE * &#x60;CLF&#x60; - CLF * &#x60;CLP&#x60; - CLP * &#x60;CNH&#x60; - CNH * &#x60;CNX&#x60; - CNX * &#x60;CNY&#x60; - CNY * &#x60;COP&#x60; - COP * &#x60;COU&#x60; - COU * &#x60;CRC&#x60; - CRC * &#x60;CSD&#x60; - CSD * &#x60;CSK&#x60; - CSK * &#x60;CUC&#x60; - CUC * &#x60;CUP&#x60; - CUP * &#x60;CVE&#x60; - CVE * &#x60;CYP&#x60; - CYP * &#x60;CZK&#x60; - CZK * &#x60;DDM&#x60; - DDM * &#x60;DEM&#x60; - DEM * &#x60;DJF&#x60; - DJF * &#x60;DKK&#x60; - DKK * &#x60;DOP&#x60; - DOP * &#x60;DZD&#x60; - DZD * &#x60;ECS&#x60; - ECS * &#x60;ECV&#x60; - ECV * &#x60;EEK&#x60; - EEK * &#x60;EGP&#x60; - EGP * &#x60;ERN&#x60; - ERN * &#x60;ESA&#x60; - ESA * &#x60;ESB&#x60; - ESB * &#x60;ESP&#x60; - ESP * &#x60;ETB&#x60; - ETB * &#x60;EUR&#x60; - EUR * &#x60;FIM&#x60; - FIM * &#x60;FJD&#x60; - FJD * &#x60;FKP&#x60; - FKP * &#x60;FRF&#x60; - FRF * &#x60;GBP&#x60; - GBP * &#x60;GEK&#x60; - GEK * &#x60;GEL&#x60; - GEL * &#x60;GHC&#x60; - GHC * &#x60;GHS&#x60; - GHS * &#x60;GIP&#x60; - GIP * &#x60;GMD&#x60; - GMD * &#x60;GNF&#x60; - GNF * &#x60;GNS&#x60; - GNS * &#x60;GQE&#x60; - GQE * &#x60;GRD&#x60; - GRD * &#x60;GTQ&#x60; - GTQ * &#x60;GWE&#x60; - GWE * &#x60;GWP&#x60; - GWP * &#x60;GYD&#x60; - GYD * &#x60;HKD&#x60; - HKD * &#x60;HNL&#x60; - HNL * &#x60;HRD&#x60; - HRD * &#x60;HRK&#x60; - HRK * &#x60;HTG&#x60; - HTG * &#x60;HUF&#x60; - HUF * &#x60;IDR&#x60; - IDR * &#x60;IEP&#x60; - IEP * &#x60;ILP&#x60; - ILP * &#x60;ILR&#x60; - ILR * &#x60;ILS&#x60; - ILS * &#x60;INR&#x60; - INR * &#x60;IQD&#x60; - IQD * &#x60;IRR&#x60; - IRR * &#x60;ISJ&#x60; - ISJ * &#x60;ISK&#x60; - ISK * &#x60;ITL&#x60; - ITL * &#x60;JMD&#x60; - JMD * &#x60;JOD&#x60; - JOD * &#x60;JPY&#x60; - JPY * &#x60;KES&#x60; - KES * &#x60;KGS&#x60; - KGS * &#x60;KHR&#x60; - KHR * &#x60;KMF&#x60; - KMF * &#x60;KPW&#x60; - KPW * &#x60;KRH&#x60; - KRH * &#x60;KRO&#x60; - KRO * &#x60;KRW&#x60; - KRW * &#x60;KWD&#x60; - KWD * &#x60;KYD&#x60; - KYD * &#x60;KZT&#x60; - KZT * &#x60;LAK&#x60; - LAK * &#x60;LBP&#x60; - LBP * &#x60;LKR&#x60; - LKR * &#x60;LRD&#x60; - LRD * &#x60;LSL&#x60; - LSL * &#x60;LTL&#x60; - LTL * &#x60;LTT&#x60; - LTT * &#x60;LUC&#x60; - LUC * &#x60;LUF&#x60; - LUF * &#x60;LUL&#x60; - LUL * &#x60;LVL&#x60; - LVL * &#x60;LVR&#x60; - LVR * &#x60;LYD&#x60; - LYD * &#x60;MAD&#x60; - MAD * &#x60;MAF&#x60; - MAF * &#x60;MCF&#x60; - MCF * &#x60;MDC&#x60; - MDC * &#x60;MDL&#x60; - MDL * &#x60;MGA&#x60; - MGA * &#x60;MGF&#x60; - MGF * &#x60;MKD&#x60; - MKD * &#x60;MKN&#x60; - MKN * &#x60;MLF&#x60; - MLF * &#x60;MMK&#x60; - MMK * &#x60;MNT&#x60; - MNT * &#x60;MOP&#x60; - MOP * &#x60;MRO&#x60; - MRO * &#x60;MRU&#x60; - MRU * &#x60;MTL&#x60; - MTL * &#x60;MTP&#x60; - MTP * &#x60;MUR&#x60; - MUR * &#x60;MVP&#x60; - MVP * &#x60;MVR&#x60; - MVR * &#x60;MWK&#x60; - MWK * &#x60;MXN&#x60; - MXN * &#x60;MXP&#x60; - MXP * &#x60;MXV&#x60; - MXV * &#x60;MYR&#x60; - MYR * &#x60;MZE&#x60; - MZE * &#x60;MZM&#x60; - MZM * &#x60;MZN&#x60; - MZN * &#x60;NAD&#x60; - NAD * &#x60;NGN&#x60; - NGN * &#x60;NIC&#x60; - NIC * &#x60;NIO&#x60; - NIO * &#x60;NLG&#x60; - NLG * &#x60;NOK&#x60; - NOK * &#x60;NPR&#x60; - NPR * &#x60;NZD&#x60; - NZD * &#x60;OMR&#x60; - OMR * &#x60;PAB&#x60; - PAB * &#x60;PEI&#x60; - PEI * &#x60;PEN&#x60; - PEN * &#x60;PES&#x60; - PES * &#x60;PGK&#x60; - PGK * &#x60;PHP&#x60; - PHP * &#x60;PKR&#x60; - PKR * &#x60;PLN&#x60; - PLN * &#x60;PLZ&#x60; - PLZ * &#x60;PTE&#x60; - PTE * &#x60;PYG&#x60; - PYG * &#x60;QAR&#x60; - QAR * &#x60;RHD&#x60; - RHD * &#x60;ROL&#x60; - ROL * &#x60;RON&#x60; - RON * &#x60;RSD&#x60; - RSD * &#x60;RUB&#x60; - RUB * &#x60;RUR&#x60; - RUR * &#x60;RWF&#x60; - RWF * &#x60;SAR&#x60; - SAR * &#x60;SBD&#x60; - SBD * &#x60;SCR&#x60; - SCR * &#x60;SDD&#x60; - SDD * &#x60;SDG&#x60; - SDG * &#x60;SDP&#x60; - SDP * &#x60;SEK&#x60; - SEK * &#x60;SGD&#x60; - SGD * &#x60;SHP&#x60; - SHP * &#x60;SIT&#x60; - SIT * &#x60;SKK&#x60; - SKK * &#x60;SLE&#x60; - SLE * &#x60;SLL&#x60; - SLL * &#x60;SOS&#x60; - SOS * &#x60;SRD&#x60; - SRD * &#x60;SRG&#x60; - SRG * &#x60;SSP&#x60; - SSP * &#x60;STD&#x60; - STD * &#x60;STN&#x60; - STN * &#x60;SUR&#x60; - SUR * &#x60;SVC&#x60; - SVC * &#x60;SYP&#x60; - SYP * &#x60;SZL&#x60; - SZL * &#x60;THB&#x60; - THB * &#x60;TJR&#x60; - TJR * &#x60;TJS&#x60; - TJS * &#x60;TMM&#x60; - TMM * &#x60;TMT&#x60; - TMT * &#x60;TND&#x60; - TND * &#x60;TOP&#x60; - TOP * &#x60;TPE&#x60; - TPE * &#x60;TRL&#x60; - TRL * &#x60;TRY&#x60; - TRY * &#x60;TTD&#x60; - TTD * &#x60;TWD&#x60; - TWD * &#x60;TZS&#x60; - TZS * &#x60;UAH&#x60; - UAH * &#x60;UAK&#x60; - UAK * &#x60;UGS&#x60; - UGS * &#x60;UGX&#x60; - UGX * &#x60;USD&#x60; - USD * &#x60;USN&#x60; - USN * &#x60;USS&#x60; - USS * &#x60;UYI&#x60; - UYI * &#x60;UYP&#x60; - UYP * &#x60;UYU&#x60; - UYU * &#x60;UYW&#x60; - UYW * &#x60;UZS&#x60; - UZS * &#x60;VEB&#x60; - VEB * &#x60;VED&#x60; - VED * &#x60;VEF&#x60; - VEF * &#x60;VES&#x60; - VES * &#x60;VND&#x60; - VND * &#x60;VNN&#x60; - VNN * &#x60;VUV&#x60; - VUV * &#x60;WST&#x60; - WST * &#x60;XAF&#x60; - XAF * &#x60;XAG&#x60; - XAG * &#x60;XAU&#x60; - XAU * &#x60;XBA&#x60; - XBA * &#x60;XBB&#x60; - XBB * &#x60;XBC&#x60; - XBC * &#x60;XBD&#x60; - XBD * &#x60;XCD&#x60; - XCD * &#x60;XDR&#x60; - XDR * &#x60;XEU&#x60; - XEU * &#x60;XFO&#x60; - XFO * &#x60;XFU&#x60; - XFU * &#x60;XOF&#x60; - XOF * &#x60;XPD&#x60; - XPD * &#x60;XPF&#x60; - XPF * &#x60;XPT&#x60; - XPT * &#x60;XRE&#x60; - XRE * &#x60;XSU&#x60; - XSU * &#x60;XTS&#x60; - XTS * &#x60;XUA&#x60; - XUA * &#x60;XXX&#x60; - XXX * &#x60;YDD&#x60; - YDD * &#x60;YER&#x60; - YER * &#x60;YUD&#x60; - YUD * &#x60;YUM&#x60; - YUM * &#x60;YUN&#x60; - YUN * &#x60;YUR&#x60; - YUR * &#x60;ZAL&#x60; - ZAL * &#x60;ZAR&#x60; - ZAR * &#x60;ZMK&#x60; - ZMK * &#x60;ZMW&#x60; - ZMW * &#x60;ZRN&#x60; - ZRN * &#x60;ZRZ&#x60; - ZRZ * &#x60;ZWD&#x60; - ZWD * &#x60;ZWL&#x60; - ZWL * &#x60;ZWR&#x60; - ZWR | [optional] [enum: ADP, AED, AFA, AFN, ALK, ALL, AMD, ANG, AOA, AOK, AON, AOR, ARA, ARL, ARM, ARP, ARS, ATS, AUD, AWG, AZM, AZN, BAD, BAM, BAN, BBD, BDT, BEC, BEF, BEL, BGL, BGM, BGN, BGO, BHD, BIF, BMD, BND, BOB, BOL, BOP, BOV, BRB, BRC, BRE, BRL, BRN, BRR, BRZ, BSD, BTN, BUK, BWP, BYB, BYN, BYR, BZD, CAD, CDF, CHE, CHF, CHW, CLE, CLF, CLP, CNH, CNX, CNY, COP, COU, CRC, CSD, CSK, CUC, CUP, CVE, CYP, CZK, DDM, DEM, DJF, DKK, DOP, DZD, ECS, ECV, EEK, EGP, ERN, ESA, ESB, ESP, ETB, EUR, FIM, FJD, FKP, FRF, GBP, GEK, GEL, GHC, GHS, GIP, GMD, GNF, GNS, GQE, GRD, GTQ, GWE, GWP, GYD, HKD, HNL, HRD, HRK, HTG, HUF, IDR, IEP, ILP, ILR, ILS, INR, IQD, IRR, ISJ, ISK, ITL, JMD, JOD, JPY, KES, KGS, KHR, KMF, KPW, KRH, KRO, KRW, KWD, KYD, KZT, LAK, LBP, LKR, LRD, LSL, LTL, LTT, LUC, LUF, LUL, LVL, LVR, LYD, MAD, MAF, MCF, MDC, MDL, MGA, MGF, MKD, MKN, MLF, MMK, MNT, MOP, MRO, MRU, MTL, MTP, MUR, MVP, MVR, MWK, MXN, MXP, MXV, MYR, MZE, MZM, MZN, NAD, NGN, NIC, NIO, NLG, NOK, NPR, NZD, OMR, PAB, PEI, PEN, PES, PGK, PHP, PKR, PLN, PLZ, PTE, PYG, QAR, RHD, ROL, RON, RSD, RUB, RUR, RWF, SAR, SBD, SCR, SDD, SDG, SDP, SEK, SGD, SHP, SIT, SKK, SLE, SLL, SOS, SRD, SRG, SSP, STD, STN, SUR, SVC, SYP, SZL, THB, TJR, TJS, TMM, TMT, TND, TOP, TPE, TRL, TRY, TTD, TWD, TZS, UAH, UAK, UGS, UGX, USD, USN, USS, UYI, UYP, UYU, UYW, UZS, VEB, VED, VEF, VES, VND, VNN, VUV, WST, XAF, XAG, XAU, XBA, XBB, XBC, XBD, XCD, XDR, XEU, XFO, XFU, XOF, XPD, XPF, XPT, XRE, XSU, XTS, XUA, XXX, YDD, YER, YUD, YUM, YUN, YUR, ZAL, ZAR, ZMK, ZMW, ZRN, ZRZ, ZWD, ZWL, ZWR] |
| **date** | **java.time.LocalDate**|  | [optional] |
| **dateGt** | **java.time.LocalDate**|  | [optional] |
| **dateGte** | **java.time.LocalDate**|  | [optional] |
| **dateLt** | **java.time.LocalDate**|  | [optional] |
| **dateLte** | **java.time.LocalDate**|  | [optional] |
| **dateMonth** | **java.math.BigDecimal**|  | [optional] |
| **dateYear** | **java.math.BigDecimal**|  | [optional] |
| **locationId** | **kotlin.Int**|  | [optional] |
| **locationIdIsnull** | **kotlin.Boolean**|  | [optional] |
| **locationOsmId** | **kotlin.Int**|  | [optional] |
| **locationOsmType** | **kotlin.String**| * &#x60;NODE&#x60; - NODE * &#x60;WAY&#x60; - WAY * &#x60;RELATION&#x60; - RELATION | [optional] [enum: NODE, RELATION, WAY] |
| **orderBy** | **kotlin.String**| Which field to use when ordering the results. | [optional] |
| **owner** | **kotlin.String**|  | [optional] |
| **page** | **kotlin.Int**| A page number within the paginated result set. | [optional] |
| **priceCount** | **kotlin.Int**|  | [optional] |
| **priceCountGte** | **kotlin.Int**|  | [optional] |
| **priceCountLte** | **kotlin.Int**|  | [optional] |
| **size** | **kotlin.Int**| Number of results to return per page. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | **kotlin.String**| * &#x60;PRICE_TAG&#x60; - PRICE_TAG * &#x60;RECEIPT&#x60; - RECEIPT * &#x60;GDPR_REQUEST&#x60; - GDPR_REQUEST * &#x60;SHOP_IMPORT&#x60; - SHOP_IMPORT | [optional] [enum: GDPR_REQUEST, PRICE_TAG, RECEIPT, SHOP_IMPORT] |

### Return type

[**PaginatedProofFullList**](PaginatedProofFullList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="proofsPartialUpdate"></a>
# **proofsPartialUpdate**
> ProofUpdate proofsPartialUpdate(id, patchedProofUpdate)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Proof.
val patchedProofUpdate : PatchedProofUpdate =  // PatchedProofUpdate | 
try {
    val result : ProofUpdate = apiInstance.proofsPartialUpdate(id, patchedProofUpdate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsApi#proofsPartialUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsApi#proofsPartialUpdate")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.Int**| A unique integer value identifying this Proof. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **patchedProofUpdate** | [**PatchedProofUpdate**](PatchedProofUpdate.md)|  | [optional] |

### Return type

[**ProofUpdate**](ProofUpdate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="proofsRetrieve"></a>
# **proofsRetrieve**
> ProofFull proofsRetrieve(id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsApi()
val id : kotlin.Int = 56 // kotlin.Int | A unique integer value identifying this Proof.
try {
    val result : ProofFull = apiInstance.proofsRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsApi#proofsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsApi#proofsRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Int**| A unique integer value identifying this Proof. | |

### Return type

[**ProofFull**](ProofFull.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="proofsUploadCreate"></a>
# **proofsUploadCreate**
> ProofFull proofsUploadCreate(file, type, currency, date, locationOsmId, locationOsmType)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsApi()
val file : kotlin.String = file_example // kotlin.String | 
val type : TypeEnum =  // TypeEnum | 
val currency : PatchedPriceUpdateCurrency =  // PatchedPriceUpdateCurrency | 
val date : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | 
val locationOsmId : kotlin.Long = 789 // kotlin.Long | 
val locationOsmType : PriceCreateLocationOsmType =  // PriceCreateLocationOsmType | 
try {
    val result : ProofFull = apiInstance.proofsUploadCreate(file, type, currency, date, locationOsmId, locationOsmType)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsApi#proofsUploadCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsApi#proofsUploadCreate")
    e.printStackTrace()
}
```

### Parameters
| **file** | **kotlin.String**|  | |
| **type** | [**TypeEnum**](TypeEnum.md)|  | [enum: PRICE_TAG, RECEIPT, GDPR_REQUEST, SHOP_IMPORT] |
| **currency** | [**PatchedPriceUpdateCurrency**](PatchedPriceUpdateCurrency.md)|  | [optional] |
| **date** | **java.time.LocalDate**|  | [optional] |
| **locationOsmId** | **kotlin.Long**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locationOsmType** | [**PriceCreateLocationOsmType**](PriceCreateLocationOsmType.md)|  | [optional] |

### Return type

[**ProofFull**](ProofFull.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

