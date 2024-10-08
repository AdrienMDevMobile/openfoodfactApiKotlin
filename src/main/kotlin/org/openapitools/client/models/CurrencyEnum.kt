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
 * * `ADP` - ADP * `AED` - AED * `AFA` - AFA * `AFN` - AFN * `ALK` - ALK * `ALL` - ALL * `AMD` - AMD * `ANG` - ANG * `AOA` - AOA * `AOK` - AOK * `AON` - AON * `AOR` - AOR * `ARA` - ARA * `ARL` - ARL * `ARM` - ARM * `ARP` - ARP * `ARS` - ARS * `ATS` - ATS * `AUD` - AUD * `AWG` - AWG * `AZM` - AZM * `AZN` - AZN * `BAD` - BAD * `BAM` - BAM * `BAN` - BAN * `BBD` - BBD * `BDT` - BDT * `BEC` - BEC * `BEF` - BEF * `BEL` - BEL * `BGL` - BGL * `BGM` - BGM * `BGN` - BGN * `BGO` - BGO * `BHD` - BHD * `BIF` - BIF * `BMD` - BMD * `BND` - BND * `BOB` - BOB * `BOL` - BOL * `BOP` - BOP * `BOV` - BOV * `BRB` - BRB * `BRC` - BRC * `BRE` - BRE * `BRL` - BRL * `BRN` - BRN * `BRR` - BRR * `BRZ` - BRZ * `BSD` - BSD * `BTN` - BTN * `BUK` - BUK * `BWP` - BWP * `BYB` - BYB * `BYN` - BYN * `BYR` - BYR * `BZD` - BZD * `CAD` - CAD * `CDF` - CDF * `CHE` - CHE * `CHF` - CHF * `CHW` - CHW * `CLE` - CLE * `CLF` - CLF * `CLP` - CLP * `CNH` - CNH * `CNX` - CNX * `CNY` - CNY * `COP` - COP * `COU` - COU * `CRC` - CRC * `CSD` - CSD * `CSK` - CSK * `CUC` - CUC * `CUP` - CUP * `CVE` - CVE * `CYP` - CYP * `CZK` - CZK * `DDM` - DDM * `DEM` - DEM * `DJF` - DJF * `DKK` - DKK * `DOP` - DOP * `DZD` - DZD * `ECS` - ECS * `ECV` - ECV * `EEK` - EEK * `EGP` - EGP * `ERN` - ERN * `ESA` - ESA * `ESB` - ESB * `ESP` - ESP * `ETB` - ETB * `EUR` - EUR * `FIM` - FIM * `FJD` - FJD * `FKP` - FKP * `FRF` - FRF * `GBP` - GBP * `GEK` - GEK * `GEL` - GEL * `GHC` - GHC * `GHS` - GHS * `GIP` - GIP * `GMD` - GMD * `GNF` - GNF * `GNS` - GNS * `GQE` - GQE * `GRD` - GRD * `GTQ` - GTQ * `GWE` - GWE * `GWP` - GWP * `GYD` - GYD * `HKD` - HKD * `HNL` - HNL * `HRD` - HRD * `HRK` - HRK * `HTG` - HTG * `HUF` - HUF * `IDR` - IDR * `IEP` - IEP * `ILP` - ILP * `ILR` - ILR * `ILS` - ILS * `INR` - INR * `IQD` - IQD * `IRR` - IRR * `ISJ` - ISJ * `ISK` - ISK * `ITL` - ITL * `JMD` - JMD * `JOD` - JOD * `JPY` - JPY * `KES` - KES * `KGS` - KGS * `KHR` - KHR * `KMF` - KMF * `KPW` - KPW * `KRH` - KRH * `KRO` - KRO * `KRW` - KRW * `KWD` - KWD * `KYD` - KYD * `KZT` - KZT * `LAK` - LAK * `LBP` - LBP * `LKR` - LKR * `LRD` - LRD * `LSL` - LSL * `LTL` - LTL * `LTT` - LTT * `LUC` - LUC * `LUF` - LUF * `LUL` - LUL * `LVL` - LVL * `LVR` - LVR * `LYD` - LYD * `MAD` - MAD * `MAF` - MAF * `MCF` - MCF * `MDC` - MDC * `MDL` - MDL * `MGA` - MGA * `MGF` - MGF * `MKD` - MKD * `MKN` - MKN * `MLF` - MLF * `MMK` - MMK * `MNT` - MNT * `MOP` - MOP * `MRO` - MRO * `MRU` - MRU * `MTL` - MTL * `MTP` - MTP * `MUR` - MUR * `MVP` - MVP * `MVR` - MVR * `MWK` - MWK * `MXN` - MXN * `MXP` - MXP * `MXV` - MXV * `MYR` - MYR * `MZE` - MZE * `MZM` - MZM * `MZN` - MZN * `NAD` - NAD * `NGN` - NGN * `NIC` - NIC * `NIO` - NIO * `NLG` - NLG * `NOK` - NOK * `NPR` - NPR * `NZD` - NZD * `OMR` - OMR * `PAB` - PAB * `PEI` - PEI * `PEN` - PEN * `PES` - PES * `PGK` - PGK * `PHP` - PHP * `PKR` - PKR * `PLN` - PLN * `PLZ` - PLZ * `PTE` - PTE * `PYG` - PYG * `QAR` - QAR * `RHD` - RHD * `ROL` - ROL * `RON` - RON * `RSD` - RSD * `RUB` - RUB * `RUR` - RUR * `RWF` - RWF * `SAR` - SAR * `SBD` - SBD * `SCR` - SCR * `SDD` - SDD * `SDG` - SDG * `SDP` - SDP * `SEK` - SEK * `SGD` - SGD * `SHP` - SHP * `SIT` - SIT * `SKK` - SKK * `SLE` - SLE * `SLL` - SLL * `SOS` - SOS * `SRD` - SRD * `SRG` - SRG * `SSP` - SSP * `STD` - STD * `STN` - STN * `SUR` - SUR * `SVC` - SVC * `SYP` - SYP * `SZL` - SZL * `THB` - THB * `TJR` - TJR * `TJS` - TJS * `TMM` - TMM * `TMT` - TMT * `TND` - TND * `TOP` - TOP * `TPE` - TPE * `TRL` - TRL * `TRY` - TRY * `TTD` - TTD * `TWD` - TWD * `TZS` - TZS * `UAH` - UAH * `UAK` - UAK * `UGS` - UGS * `UGX` - UGX * `USD` - USD * `USN` - USN * `USS` - USS * `UYI` - UYI * `UYP` - UYP * `UYU` - UYU * `UYW` - UYW * `UZS` - UZS * `VEB` - VEB * `VED` - VED * `VEF` - VEF * `VES` - VES * `VND` - VND * `VNN` - VNN * `VUV` - VUV * `WST` - WST * `XAF` - XAF * `XAG` - XAG * `XAU` - XAU * `XBA` - XBA * `XBB` - XBB * `XBC` - XBC * `XBD` - XBD * `XCD` - XCD * `XDR` - XDR * `XEU` - XEU * `XFO` - XFO * `XFU` - XFU * `XOF` - XOF * `XPD` - XPD * `XPF` - XPF * `XPT` - XPT * `XRE` - XRE * `XSU` - XSU * `XTS` - XTS * `XUA` - XUA * `XXX` - XXX * `YDD` - YDD * `YER` - YER * `YUD` - YUD * `YUM` - YUM * `YUN` - YUN * `YUR` - YUR * `ZAL` - ZAL * `ZAR` - ZAR * `ZMK` - ZMK * `ZMW` - ZMW * `ZRN` - ZRN * `ZRZ` - ZRZ * `ZWD` - ZWD * `ZWL` - ZWL * `ZWR` - ZWR
 *
 * Values: ADP,AED,AFA,AFN,ALK,ALL,AMD,ANG,AOA,AOK,AON,AOR,ARA,ARL,ARM,ARP,ARS,ATS,AUD,AWG,AZM,AZN,BAD,BAM,BAN,BBD,BDT,BEC,BEF,BEL,BGL,BGM,BGN,BGO,BHD,BIF,BMD,BND,BOB,BOL,BOP,BOV,BRB,BRC,BRE,BRL,BRN,BRR,BRZ,BSD,BTN,BUK,BWP,BYB,BYN,BYR,BZD,CAD,CDF,CHE,CHF,CHW,CLE,CLF,CLP,CNH,CNX,CNY,COP,COU,CRC,CSD,CSK,CUC,CUP,CVE,CYP,CZK,DDM,DEM,DJF,DKK,DOP,DZD,ECS,ECV,EEK,EGP,ERN,ESA,ESB,ESP,ETB,EUR,FIM,FJD,FKP,FRF,GBP,GEK,GEL,GHC,GHS,GIP,GMD,GNF,GNS,GQE,GRD,GTQ,GWE,GWP,GYD,HKD,HNL,HRD,HRK,HTG,HUF,IDR,IEP,ILP,ILR,ILS,INR,IQD,IRR,ISJ,ISK,ITL,JMD,JOD,JPY,KES,KGS,KHR,KMF,KPW,KRH,KRO,KRW,KWD,KYD,KZT,LAK,LBP,LKR,LRD,LSL,LTL,LTT,LUC,LUF,LUL,LVL,LVR,LYD,MAD,MAF,MCF,MDC,MDL,MGA,MGF,MKD,MKN,MLF,MMK,MNT,MOP,MRO,MRU,MTL,MTP,MUR,MVP,MVR,MWK,MXN,MXP,MXV,MYR,MZE,MZM,MZN,NAD,NGN,NIC,NIO,NLG,NOK,NPR,NZD,OMR,PAB,PEI,PEN,PES,PGK,PHP,PKR,PLN,PLZ,PTE,PYG,QAR,RHD,ROL,RON,RSD,RUB,RUR,RWF,SAR,SBD,SCR,SDD,SDG,SDP,SEK,SGD,SHP,SIT,SKK,SLE,SLL,SOS,SRD,SRG,SSP,STD,STN,SUR,SVC,SYP,SZL,THB,TJR,TJS,TMM,TMT,TND,TOP,TPE,TRL,TRY,TTD,TWD,TZS,UAH,UAK,UGS,UGX,USD,USN,USS,UYI,UYP,UYU,UYW,UZS,VEB,VED,VEF,VES,VND,VNN,VUV,WST,XAF,XAG,XAU,XBA,XBB,XBC,XBD,XCD,XDR,XEU,XFO,XFU,XOF,XPD,XPF,XPT,XRE,XSU,XTS,XUA,XXX,YDD,YER,YUD,YUM,YUN,YUR,ZAL,ZAR,ZMK,ZMW,ZRN,ZRZ,ZWD,ZWL,ZWR
 */

@JsonClass(generateAdapter = false)
enum class CurrencyEnum(val value: kotlin.String) {

    @Json(name = "ADP")
    ADP("ADP"),

    @Json(name = "AED")
    AED("AED"),

    @Json(name = "AFA")
    AFA("AFA"),

    @Json(name = "AFN")
    AFN("AFN"),

    @Json(name = "ALK")
    ALK("ALK"),

    @Json(name = "ALL")
    ALL("ALL"),

    @Json(name = "AMD")
    AMD("AMD"),

    @Json(name = "ANG")
    ANG("ANG"),

    @Json(name = "AOA")
    AOA("AOA"),

    @Json(name = "AOK")
    AOK("AOK"),

    @Json(name = "AON")
    AON("AON"),

    @Json(name = "AOR")
    AOR("AOR"),

    @Json(name = "ARA")
    ARA("ARA"),

    @Json(name = "ARL")
    ARL("ARL"),

    @Json(name = "ARM")
    ARM("ARM"),

    @Json(name = "ARP")
    ARP("ARP"),

    @Json(name = "ARS")
    ARS("ARS"),

    @Json(name = "ATS")
    ATS("ATS"),

    @Json(name = "AUD")
    AUD("AUD"),

    @Json(name = "AWG")
    AWG("AWG"),

    @Json(name = "AZM")
    AZM("AZM"),

    @Json(name = "AZN")
    AZN("AZN"),

    @Json(name = "BAD")
    BAD("BAD"),

    @Json(name = "BAM")
    BAM("BAM"),

    @Json(name = "BAN")
    BAN("BAN"),

    @Json(name = "BBD")
    BBD("BBD"),

    @Json(name = "BDT")
    BDT("BDT"),

    @Json(name = "BEC")
    BEC("BEC"),

    @Json(name = "BEF")
    BEF("BEF"),

    @Json(name = "BEL")
    BEL("BEL"),

    @Json(name = "BGL")
    BGL("BGL"),

    @Json(name = "BGM")
    BGM("BGM"),

    @Json(name = "BGN")
    BGN("BGN"),

    @Json(name = "BGO")
    BGO("BGO"),

    @Json(name = "BHD")
    BHD("BHD"),

    @Json(name = "BIF")
    BIF("BIF"),

    @Json(name = "BMD")
    BMD("BMD"),

    @Json(name = "BND")
    BND("BND"),

    @Json(name = "BOB")
    BOB("BOB"),

    @Json(name = "BOL")
    BOL("BOL"),

    @Json(name = "BOP")
    BOP("BOP"),

    @Json(name = "BOV")
    BOV("BOV"),

    @Json(name = "BRB")
    BRB("BRB"),

    @Json(name = "BRC")
    BRC("BRC"),

    @Json(name = "BRE")
    BRE("BRE"),

    @Json(name = "BRL")
    BRL("BRL"),

    @Json(name = "BRN")
    BRN("BRN"),

    @Json(name = "BRR")
    BRR("BRR"),

    @Json(name = "BRZ")
    BRZ("BRZ"),

    @Json(name = "BSD")
    BSD("BSD"),

    @Json(name = "BTN")
    BTN("BTN"),

    @Json(name = "BUK")
    BUK("BUK"),

    @Json(name = "BWP")
    BWP("BWP"),

    @Json(name = "BYB")
    BYB("BYB"),

    @Json(name = "BYN")
    BYN("BYN"),

    @Json(name = "BYR")
    BYR("BYR"),

    @Json(name = "BZD")
    BZD("BZD"),

    @Json(name = "CAD")
    CAD("CAD"),

    @Json(name = "CDF")
    CDF("CDF"),

    @Json(name = "CHE")
    CHE("CHE"),

    @Json(name = "CHF")
    CHF("CHF"),

    @Json(name = "CHW")
    CHW("CHW"),

    @Json(name = "CLE")
    CLE("CLE"),

    @Json(name = "CLF")
    CLF("CLF"),

    @Json(name = "CLP")
    CLP("CLP"),

    @Json(name = "CNH")
    CNH("CNH"),

    @Json(name = "CNX")
    CNX("CNX"),

    @Json(name = "CNY")
    CNY("CNY"),

    @Json(name = "COP")
    COP("COP"),

    @Json(name = "COU")
    COU("COU"),

    @Json(name = "CRC")
    CRC("CRC"),

    @Json(name = "CSD")
    CSD("CSD"),

    @Json(name = "CSK")
    CSK("CSK"),

    @Json(name = "CUC")
    CUC("CUC"),

    @Json(name = "CUP")
    CUP("CUP"),

    @Json(name = "CVE")
    CVE("CVE"),

    @Json(name = "CYP")
    CYP("CYP"),

    @Json(name = "CZK")
    CZK("CZK"),

    @Json(name = "DDM")
    DDM("DDM"),

    @Json(name = "DEM")
    DEM("DEM"),

    @Json(name = "DJF")
    DJF("DJF"),

    @Json(name = "DKK")
    DKK("DKK"),

    @Json(name = "DOP")
    DOP("DOP"),

    @Json(name = "DZD")
    DZD("DZD"),

    @Json(name = "ECS")
    ECS("ECS"),

    @Json(name = "ECV")
    ECV("ECV"),

    @Json(name = "EEK")
    EEK("EEK"),

    @Json(name = "EGP")
    EGP("EGP"),

    @Json(name = "ERN")
    ERN("ERN"),

    @Json(name = "ESA")
    ESA("ESA"),

    @Json(name = "ESB")
    ESB("ESB"),

    @Json(name = "ESP")
    ESP("ESP"),

    @Json(name = "ETB")
    ETB("ETB"),

    @Json(name = "EUR")
    EUR("EUR"),

    @Json(name = "FIM")
    FIM("FIM"),

    @Json(name = "FJD")
    FJD("FJD"),

    @Json(name = "FKP")
    FKP("FKP"),

    @Json(name = "FRF")
    FRF("FRF"),

    @Json(name = "GBP")
    GBP("GBP"),

    @Json(name = "GEK")
    GEK("GEK"),

    @Json(name = "GEL")
    GEL("GEL"),

    @Json(name = "GHC")
    GHC("GHC"),

    @Json(name = "GHS")
    GHS("GHS"),

    @Json(name = "GIP")
    GIP("GIP"),

    @Json(name = "GMD")
    GMD("GMD"),

    @Json(name = "GNF")
    GNF("GNF"),

    @Json(name = "GNS")
    GNS("GNS"),

    @Json(name = "GQE")
    GQE("GQE"),

    @Json(name = "GRD")
    GRD("GRD"),

    @Json(name = "GTQ")
    GTQ("GTQ"),

    @Json(name = "GWE")
    GWE("GWE"),

    @Json(name = "GWP")
    GWP("GWP"),

    @Json(name = "GYD")
    GYD("GYD"),

    @Json(name = "HKD")
    HKD("HKD"),

    @Json(name = "HNL")
    HNL("HNL"),

    @Json(name = "HRD")
    HRD("HRD"),

    @Json(name = "HRK")
    HRK("HRK"),

    @Json(name = "HTG")
    HTG("HTG"),

    @Json(name = "HUF")
    HUF("HUF"),

    @Json(name = "IDR")
    IDR("IDR"),

    @Json(name = "IEP")
    IEP("IEP"),

    @Json(name = "ILP")
    ILP("ILP"),

    @Json(name = "ILR")
    ILR("ILR"),

    @Json(name = "ILS")
    ILS("ILS"),

    @Json(name = "INR")
    INR("INR"),

    @Json(name = "IQD")
    IQD("IQD"),

    @Json(name = "IRR")
    IRR("IRR"),

    @Json(name = "ISJ")
    ISJ("ISJ"),

    @Json(name = "ISK")
    ISK("ISK"),

    @Json(name = "ITL")
    ITL("ITL"),

    @Json(name = "JMD")
    JMD("JMD"),

    @Json(name = "JOD")
    JOD("JOD"),

    @Json(name = "JPY")
    JPY("JPY"),

    @Json(name = "KES")
    KES("KES"),

    @Json(name = "KGS")
    KGS("KGS"),

    @Json(name = "KHR")
    KHR("KHR"),

    @Json(name = "KMF")
    KMF("KMF"),

    @Json(name = "KPW")
    KPW("KPW"),

    @Json(name = "KRH")
    KRH("KRH"),

    @Json(name = "KRO")
    KRO("KRO"),

    @Json(name = "KRW")
    KRW("KRW"),

    @Json(name = "KWD")
    KWD("KWD"),

    @Json(name = "KYD")
    KYD("KYD"),

    @Json(name = "KZT")
    KZT("KZT"),

    @Json(name = "LAK")
    LAK("LAK"),

    @Json(name = "LBP")
    LBP("LBP"),

    @Json(name = "LKR")
    LKR("LKR"),

    @Json(name = "LRD")
    LRD("LRD"),

    @Json(name = "LSL")
    LSL("LSL"),

    @Json(name = "LTL")
    LTL("LTL"),

    @Json(name = "LTT")
    LTT("LTT"),

    @Json(name = "LUC")
    LUC("LUC"),

    @Json(name = "LUF")
    LUF("LUF"),

    @Json(name = "LUL")
    LUL("LUL"),

    @Json(name = "LVL")
    LVL("LVL"),

    @Json(name = "LVR")
    LVR("LVR"),

    @Json(name = "LYD")
    LYD("LYD"),

    @Json(name = "MAD")
    MAD("MAD"),

    @Json(name = "MAF")
    MAF("MAF"),

    @Json(name = "MCF")
    MCF("MCF"),

    @Json(name = "MDC")
    MDC("MDC"),

    @Json(name = "MDL")
    MDL("MDL"),

    @Json(name = "MGA")
    MGA("MGA"),

    @Json(name = "MGF")
    MGF("MGF"),

    @Json(name = "MKD")
    MKD("MKD"),

    @Json(name = "MKN")
    MKN("MKN"),

    @Json(name = "MLF")
    MLF("MLF"),

    @Json(name = "MMK")
    MMK("MMK"),

    @Json(name = "MNT")
    MNT("MNT"),

    @Json(name = "MOP")
    MOP("MOP"),

    @Json(name = "MRO")
    MRO("MRO"),

    @Json(name = "MRU")
    MRU("MRU"),

    @Json(name = "MTL")
    MTL("MTL"),

    @Json(name = "MTP")
    MTP("MTP"),

    @Json(name = "MUR")
    MUR("MUR"),

    @Json(name = "MVP")
    MVP("MVP"),

    @Json(name = "MVR")
    MVR("MVR"),

    @Json(name = "MWK")
    MWK("MWK"),

    @Json(name = "MXN")
    MXN("MXN"),

    @Json(name = "MXP")
    MXP("MXP"),

    @Json(name = "MXV")
    MXV("MXV"),

    @Json(name = "MYR")
    MYR("MYR"),

    @Json(name = "MZE")
    MZE("MZE"),

    @Json(name = "MZM")
    MZM("MZM"),

    @Json(name = "MZN")
    MZN("MZN"),

    @Json(name = "NAD")
    NAD("NAD"),

    @Json(name = "NGN")
    NGN("NGN"),

    @Json(name = "NIC")
    NIC("NIC"),

    @Json(name = "NIO")
    NIO("NIO"),

    @Json(name = "NLG")
    NLG("NLG"),

    @Json(name = "NOK")
    NOK("NOK"),

    @Json(name = "NPR")
    NPR("NPR"),

    @Json(name = "NZD")
    NZD("NZD"),

    @Json(name = "OMR")
    OMR("OMR"),

    @Json(name = "PAB")
    PAB("PAB"),

    @Json(name = "PEI")
    PEI("PEI"),

    @Json(name = "PEN")
    PEN("PEN"),

    @Json(name = "PES")
    PES("PES"),

    @Json(name = "PGK")
    PGK("PGK"),

    @Json(name = "PHP")
    PHP("PHP"),

    @Json(name = "PKR")
    PKR("PKR"),

    @Json(name = "PLN")
    PLN("PLN"),

    @Json(name = "PLZ")
    PLZ("PLZ"),

    @Json(name = "PTE")
    PTE("PTE"),

    @Json(name = "PYG")
    PYG("PYG"),

    @Json(name = "QAR")
    QAR("QAR"),

    @Json(name = "RHD")
    RHD("RHD"),

    @Json(name = "ROL")
    ROL("ROL"),

    @Json(name = "RON")
    RON("RON"),

    @Json(name = "RSD")
    RSD("RSD"),

    @Json(name = "RUB")
    RUB("RUB"),

    @Json(name = "RUR")
    RUR("RUR"),

    @Json(name = "RWF")
    RWF("RWF"),

    @Json(name = "SAR")
    SAR("SAR"),

    @Json(name = "SBD")
    SBD("SBD"),

    @Json(name = "SCR")
    SCR("SCR"),

    @Json(name = "SDD")
    SDD("SDD"),

    @Json(name = "SDG")
    SDG("SDG"),

    @Json(name = "SDP")
    SDP("SDP"),

    @Json(name = "SEK")
    SEK("SEK"),

    @Json(name = "SGD")
    SGD("SGD"),

    @Json(name = "SHP")
    SHP("SHP"),

    @Json(name = "SIT")
    SIT("SIT"),

    @Json(name = "SKK")
    SKK("SKK"),

    @Json(name = "SLE")
    SLE("SLE"),

    @Json(name = "SLL")
    SLL("SLL"),

    @Json(name = "SOS")
    SOS("SOS"),

    @Json(name = "SRD")
    SRD("SRD"),

    @Json(name = "SRG")
    SRG("SRG"),

    @Json(name = "SSP")
    SSP("SSP"),

    @Json(name = "STD")
    STD("STD"),

    @Json(name = "STN")
    STN("STN"),

    @Json(name = "SUR")
    SUR("SUR"),

    @Json(name = "SVC")
    SVC("SVC"),

    @Json(name = "SYP")
    SYP("SYP"),

    @Json(name = "SZL")
    SZL("SZL"),

    @Json(name = "THB")
    THB("THB"),

    @Json(name = "TJR")
    TJR("TJR"),

    @Json(name = "TJS")
    TJS("TJS"),

    @Json(name = "TMM")
    TMM("TMM"),

    @Json(name = "TMT")
    TMT("TMT"),

    @Json(name = "TND")
    TND("TND"),

    @Json(name = "TOP")
    TOP("TOP"),

    @Json(name = "TPE")
    TPE("TPE"),

    @Json(name = "TRL")
    TRL("TRL"),

    @Json(name = "TRY")
    TRY("TRY"),

    @Json(name = "TTD")
    TTD("TTD"),

    @Json(name = "TWD")
    TWD("TWD"),

    @Json(name = "TZS")
    TZS("TZS"),

    @Json(name = "UAH")
    UAH("UAH"),

    @Json(name = "UAK")
    UAK("UAK"),

    @Json(name = "UGS")
    UGS("UGS"),

    @Json(name = "UGX")
    UGX("UGX"),

    @Json(name = "USD")
    USD("USD"),

    @Json(name = "USN")
    USN("USN"),

    @Json(name = "USS")
    USS("USS"),

    @Json(name = "UYI")
    UYI("UYI"),

    @Json(name = "UYP")
    UYP("UYP"),

    @Json(name = "UYU")
    UYU("UYU"),

    @Json(name = "UYW")
    UYW("UYW"),

    @Json(name = "UZS")
    UZS("UZS"),

    @Json(name = "VEB")
    VEB("VEB"),

    @Json(name = "VED")
    VED("VED"),

    @Json(name = "VEF")
    VEF("VEF"),

    @Json(name = "VES")
    VES("VES"),

    @Json(name = "VND")
    VND("VND"),

    @Json(name = "VNN")
    VNN("VNN"),

    @Json(name = "VUV")
    VUV("VUV"),

    @Json(name = "WST")
    WST("WST"),

    @Json(name = "XAF")
    XAF("XAF"),

    @Json(name = "XAG")
    XAG("XAG"),

    @Json(name = "XAU")
    XAU("XAU"),

    @Json(name = "XBA")
    XBA("XBA"),

    @Json(name = "XBB")
    XBB("XBB"),

    @Json(name = "XBC")
    XBC("XBC"),

    @Json(name = "XBD")
    XBD("XBD"),

    @Json(name = "XCD")
    XCD("XCD"),

    @Json(name = "XDR")
    XDR("XDR"),

    @Json(name = "XEU")
    XEU("XEU"),

    @Json(name = "XFO")
    XFO("XFO"),

    @Json(name = "XFU")
    XFU("XFU"),

    @Json(name = "XOF")
    XOF("XOF"),

    @Json(name = "XPD")
    XPD("XPD"),

    @Json(name = "XPF")
    XPF("XPF"),

    @Json(name = "XPT")
    XPT("XPT"),

    @Json(name = "XRE")
    XRE("XRE"),

    @Json(name = "XSU")
    XSU("XSU"),

    @Json(name = "XTS")
    XTS("XTS"),

    @Json(name = "XUA")
    XUA("XUA"),

    @Json(name = "XXX")
    XXX("XXX"),

    @Json(name = "YDD")
    YDD("YDD"),

    @Json(name = "YER")
    YER("YER"),

    @Json(name = "YUD")
    YUD("YUD"),

    @Json(name = "YUM")
    YUM("YUM"),

    @Json(name = "YUN")
    YUN("YUN"),

    @Json(name = "YUR")
    YUR("YUR"),

    @Json(name = "ZAL")
    ZAL("ZAL"),

    @Json(name = "ZAR")
    ZAR("ZAR"),

    @Json(name = "ZMK")
    ZMK("ZMK"),

    @Json(name = "ZMW")
    ZMW("ZMW"),

    @Json(name = "ZRN")
    ZRN("ZRN"),

    @Json(name = "ZRZ")
    ZRZ("ZRZ"),

    @Json(name = "ZWD")
    ZWD("ZWD"),

    @Json(name = "ZWL")
    ZWL("ZWL"),

    @Json(name = "ZWR")
    ZWR("ZWR");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is CurrencyEnum) "$data" else null

        /**
         * Returns a valid [CurrencyEnum] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): CurrencyEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

