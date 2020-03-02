package Visitantes


import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class PlanTuCur extends Simulation {

  val httpProtocol = http
    .baseUrl("https://ccstore-prod-ze8a.oracleoutsourcing.com")
    .disableAutoReferer
    .userAgentHeader("Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.122 Mobile Safari/537.36")
    .silentResources
  val headers_0 = Map("Sec-Fetch-Dest" -> "image")

  val headers_1 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "none",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_2 = Map(
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/",
    "Sec-Fetch-Dest" -> "style")

  val headers_3 = Map(
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/",
    "Sec-Fetch-Dest" -> "script")

  val headers_10 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCProfileType" -> "storefrontUI")

  val headers_15 = Map(
    "Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/",
    "Sec-Fetch-Dest" -> "style")

  val headers_16 = Map(
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/file/v1672218015625384999/css/base.css?occsite=siteUS",
    "Sec-Fetch-Dest" -> "image")

  val headers_17 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/json",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCPriceListGroup" -> "tarifaCategoriaA",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCViewport" -> "lg",
    "X-CCVisitorId" -> "10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")

  val headers_20 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCPriceListGroup" -> "tarifaCategoriaA",
    "X-CCViewport" -> "lg",
    "X-CCVisitorId" -> "10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6",
    "X-Requested-With" -> "XMLHttpRequest",
    "authorization" -> "Bearer null")

  val headers_27 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/json",
    "Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCPriceListGroup" -> "tarifaCategoriaA",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCViewport" -> "lg",
    "X-CCVisitorId" -> "10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")

  val headers_52 = Map(
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/",
    "Sec-Fetch-Dest" -> "image")

  val headers_57 = Map(
    "Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
    "Referer" -> "https://use.fontawesome.com/releases/v5.6.3/css/all.css",
    "Sec-Fetch-Dest" -> "font")

  val headers_58 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/",
    "Sec-Fetch-Dest" -> "script",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "cross-site")

  val headers_89 = Map(
    "Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/",
    "Sec-Fetch-Dest" -> "image",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_91 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/",
    "Sec-Fetch-Dest" -> "iframe",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "cross-site",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_94 = Map(
    "Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/file/thirdparty/fonts/font-awesome.min.css",
    "Sec-Fetch-Dest" -> "font")

  val headers_100 = Map(
    "Accept" -> "application/json",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/x-www-form-urlencoded",
    "Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-site")

  val headers_101 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/",
    "sec-fetch-dest" -> "image",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_104 = Map(
    "Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/file/v1672218015625384999/css/base.css?occsite=siteUS",
    "Sec-Fetch-Dest" -> "font")

  val headers_112 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "text/plain;charset=UTF-8",
    "Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "cross-site")

  val headers_114 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/json",
    "Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCPriceListGroup" -> "tarifaCategoriaA",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCViewport" -> "lg",
    "X-CCVisitId" -> "692db081:1708a4b478e:-5a28-129.80.155.74",
    "X-CCVisitorId" -> "10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")

  val headers_116 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/json",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCPriceListGroup" -> "tarifaCategoriaA",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCViewport" -> "lg",
    "X-CCVisitId" -> "692db081:1708a4b478e:-5a28-129.80.155.74",
    "X-CCVisitorId" -> "10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")

  val headers_117 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
    "Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-site")

  val headers_175 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/json",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/plan-tu-cur/product/HER-B-RED-DEP-ACO-028",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCPriceListGroup" -> "tarifaCategoriaA",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCViewport" -> "lg",
    "X-CCVisitId" -> "692db081:1708a4b478e:-5a28-129.80.155.74",
    "X-CCVisitorId" -> "10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")

  val headers_176 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/plan-tu-cur/product/HER-B-RED-DEP-ACO-028",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCPriceListGroup" -> "tarifaCategoriaA",
    "X-CCViewport" -> "lg",
    "X-CCVisitId" -> "692db081:1708a4b478e:-5a28-129.80.155.74",
    "X-CCVisitorId" -> "10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6",
    "X-Requested-With" -> "XMLHttpRequest",
    "authorization" -> "Bearer null")

  val headers_179 = Map(
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/plan-tu-cur/product/HER-B-RED-DEP-ACO-028",
    "Sec-Fetch-Dest" -> "script")

  val headers_186 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/plan-tu-cur/product/HER-B-RED-DEP-ACO-028",
    "Sec-Fetch-Dest" -> "iframe",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "cross-site",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_191 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "if-none-match" -> "8dd5359092b2e6296dc231b56e768864",
    "referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/plan-tu-cur/product/HER-B-RED-DEP-ACO-028",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_193 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/plan-tu-cur/product/HER-B-RED-DEP-ACO-028",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_195 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/json",
    "Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/plan-tu-cur/product/HER-B-RED-DEP-ACO-028",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCPriceListGroup" -> "tarifaCategoriaA",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCViewport" -> "lg",
    "X-CCVisitId" -> "692db081:1708a4b478e:-5a28-129.80.155.74",
    "X-CCVisitorId" -> "10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")

  val headers_196 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
    "Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/plan-tu-cur/product/HER-B-RED-DEP-ACO-028",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-site")

  val headers_198 = Map(
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/plan-tu-cur/product/HER-B-RED-DEP-ACO-028",
    "Sec-Fetch-Dest" -> "image")

  val headers_201 = Map(
    "Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/plan-tu-cur/product/HER-B-RED-DEP-ACO-028",
    "Sec-Fetch-Dest" -> "image",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_206 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "text/plain;charset=UTF-8",
    "Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/plan-tu-cur/product/HER-B-RED-DEP-ACO-028",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "cross-site")

  val headers_210 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
    "referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/plan-tu-cur/product/HER-B-RED-DEP-ACO-028",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "cors",
    "sec-fetch-site" -> "cross-site")

  val headers_211 = Map(
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/plan-tu-cur/product/HER-B-RED-DEP-ACO-028",
    "Sec-Fetch-Dest" -> "empty")

  val headers_212 = Map(
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/plan-tu-cur/product/HER-B-RED-DEP-ACO-028",
    "Sec-Fetch-Dest" -> "iframe",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_216 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "if-none-match" -> "-1674006370--gzip",
    "referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/plan-tu-cur/product/HER-B-RED-DEP-ACO-028",
    "sec-fetch-dest" -> "script",
    "sec-fetch-mode" -> "no-cors",
    "sec-fetch-site" -> "cross-site")

  val headers_224 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/plan-tu-cur/product/HER-B-RED-DEP-ACO-028",
    "Sec-Fetch-Dest" -> "script",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "cross-site")

  val headers_228 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/cart",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCPriceListGroup" -> "tarifaCategoriaA",
    "X-CCViewport" -> "lg",
    "X-CCVisitId" -> "692db081:1708a4b478e:-5a28-129.80.155.74",
    "X-CCVisitorId" -> "10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6",
    "X-Requested-With" -> "XMLHttpRequest",
    "authorization" -> "Bearer null")

  val headers_229 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/json",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/cart",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCPriceListGroup" -> "tarifaCategoriaA",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCViewport" -> "lg",
    "X-CCVisitId" -> "692db081:1708a4b478e:-5a28-129.80.155.74",
    "X-CCVisitorId" -> "10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")

  val headers_232 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/cart",
    "Sec-Fetch-Dest" -> "iframe",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "cross-site",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_236 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/cart",
    "Sec-Fetch-Dest" -> "script",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_238 = Map(
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/cart",
    "Sec-Fetch-Dest" -> "image")

  val headers_244 = Map(
    "Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/cart",
    "Sec-Fetch-Dest" -> "image",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin")

  val headers_245 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/cart",
    "Sec-Fetch-Dest" -> "iframe",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_247 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/json",
    "Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/cart",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCPriceListGroup" -> "tarifaCategoriaA",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCViewport" -> "lg",
    "X-CCVisitId" -> "692db081:1708a4b478e:-5a28-129.80.155.74",
    "X-CCVisitorId" -> "10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")

  val headers_248 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "application/x-www-form-urlencoded;charset=UTF-8",
    "Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/cart",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-site")

  val headers_249 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "es-419,es;q=0.9,en;q=0.8,en-US;q=0.7",
    "Content-Type" -> "text/plain;charset=UTF-8",
    "Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
    "Referer" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com/cart",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "cross-site")

  val uri01 = "https://connect.facebook.net/en_US/all.js"
  val uri02 = "https://graph.facebook.com"
  val uri03 = "https://www.google-analytics.com"
  val uri04 = "https://ccexperimentsstatic.oracleoutsourcing.com/js"
  val uri05 = "https://c.oracleinfinity.io/acs"
  val uri06 = "https://ccrules.oracleoutsourcing.com/EERules"
  val uri07 = "https://d.la1-c1-iad.salesforceliveagent.com/chat/rest/System/MultiNoun.jsonp"
  val uri08 = "https://api-public.addthis.com/url/shares.json"
  val uri09 = "https://s7.addthis.com"
  val uri10 = "https://presso.compensar.com/connect/checksession"
  val uri11 = "https://assets.pinterest.com/js"
  val uri12 = "https://www.googletagmanager.com/gtm.js"
  val uri13 = "https://d.la2-c2-ph2.salesforceliveagent.com/chat/rest/Visitor"
  val uri14 = "https://v1.addthisedge.com/live/boost/ra-5d825fc4795b019a/_ate.track.config_resp"
  val uri15 = "https://cloud-commerce-visit.oracleoutsourcing.com/Visit"
  val uri16 = "https://z.moatads.com/addthismoatframe568911941483/moatframe.js"
  val uri17 = "https://m.addthis.com/live/red_lojson/300lo.json"
  val uri18 = "https://dc.oracleinfinity.io/awlorq1lmp/wtid.js"
  val uri19 = "https://recs.atgsvcs.com/pr"
  val uri20 = "https://lh3.googleusercontent.com/-ugbS33w6BNw/AAAAAAAAAAI/AAAAAAAAAAA/AKF05nDZzHCgRlvSLNV29_kdxRKSWqQpnA.CMID/s64-c/photo.jpg"
  val uri22 = "https://use.fontawesome.com/releases/v5.6.3"
  val uri23 = "https://log.pinterest.com"

  val chain_0 = exec(http("request_0")
    .get(uri20)
    .headers(headers_0))

    .exec(http("request_1")
      .get("/")
      .headers(headers_1))
    .exec(http("request_2")
      .get("/file/v7627209366377823290/css/common.css?occsite=siteUS")
      .headers(headers_2))
    .exec(http("request_3")
      .get("/file/v6024536450818749285/storeJS/20.1/require.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_4")
      .get("/css/style.css?bust=20.1")
      .headers(headers_2))
    .exec(http("request_5")
      .get("/file/v1672218015625384999/css/base.css?occsite=siteUS")
      .headers(headers_2))
    .exec(http("request_6")
      .get("/file/v2688663483985954310/storeJS/20.1/cc-ko-oj-extensions.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_7")
      .get("/file/v3766746859409485417/storeJS/20.1/store-libs.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_8")
      .get("/file/v2226235809041286676/storeJS/20.1/main.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_9")
      .get("/file/thirdparty/fonts/font-awesome.min.css")
      .headers(headers_2))
    .exec(http("request_10")
      .get("/ccstoreui/v1/registry")
      .headers(headers_10))

    .exec(http("request_11")
      .get("/file/v8294814849248898388/global/OCS_APPJS_utils.min.js?bust=ODI5NDgxNDg0OTI0ODg5ODM4OA==&bust=20.1")
      .headers(headers_3))
    .exec(http("request_12")
      .get("/file/v7118095340636161936/global/ccCustomBinding.min.js?bust=LTcxMTgwOTUzNDA2MzYxNjE5MzY=&bust=20.1")
      .headers(headers_3))
    .exec(http("request_13")
      .get("/js/oraclejet/js/libs/oj/v2.0.2/resources/nls/es/ojtranslations.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_14")
      .get("/file/thirdparty/libraries/chatScript.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_15")
      .get(uri22 + "/css/all.css")
      .headers(headers_15))
    .exec(http("request_16")
      .get("/file/general/ecommerce-bg-desk.png")
      .headers(headers_16))
    .exec(http("request_17")
      .get("/ccstoreui/v1/publish")
      .headers(headers_17))
    .exec(http("request_18")
      .get("/ccstoreui/v1/pages/home?dataOnly=false&cacheableDataOnly=true&productTypesRequired=true")
      .headers(headers_17))
    .exec(http("request_19")
      .get("/ccstoreui/v1/pages/home?dataOnly=false&currentDataOnly=true")
      .headers(headers_17))
    .exec(http("request_20")
      .get("/ccstoreui/v1/pages/css/home?occsite=siteUS")
      .headers(headers_20))
    .exec(http("request_21")
      .get("/ccstoreui/v1/merchant/eetagdata")
      .headers(headers_17))
    .exec(http("request_22")
      .get("/ccstoreui/v1/pages/layout/home?ccvp=lg")
      .headers(headers_17))
    .exec(http("request_23")
      .get("/file/v1672218015625384999/general/bt-chat-offline.png")
      .headers(headers_16))
    .exec(http("request_24")
      .get("/file/v1672218015625384999/general/bt-inicio.png")
      .headers(headers_16))

    .exec(http("request_25")
      .get(uri04 + "/atgsvcs.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_26")
      .get(uri04 + "/cc-metrics-1.0.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_27")
      .post("/ccstoreui/v1/ccm/page")
      .headers(headers_27)
      .body(StringBody("""{"pageViews":1}""")))

    .exec(http("request_28")
      .get("/ccstoreui/v1/resources/ns.common?locale=es")
      .headers(headers_17))
    .exec(http("request_29")
      .get("/ccstoreui/v1/resources/ns.ccformats?locale=es")
      .headers(headers_17))
    .exec(http("request_30")
      .get("/shared/js/libs/moment/es.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_31")
      .get("/file/v7975151967068321049/widget/OCS_Floating_Cart/js/OCS_Floating_Cart.min.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_32")
      .get("/file/v8048294892630311603/widget/OCS_preHeader/js/OCS_preHeader.min.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_33")
      .get("/file/v5854270749814020852/widget/OCS_header/js/OCS_header.min.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_34")
      .get("/file/v5830247536608372264/widget/OCS_megaMenuHtml/js/OCS_megaMenuHtml.min.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_35")
      .get("/file/v3985327494808631122/widget/OCS_carouselBannerHome/js/OCS_carouselBannerHome.min.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_36")
      .get("/file/v5686076830271975831/widget/OCS_forYourFamily/js/OCS_forYourFamily.min.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_37")
      .get("/file/v6519377692676428878/widget/OCS_featuredProducts/js/OCS_featuredProducts.min.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_38")
      .get("/file/v4299424147478762731/widget/v2/webContent/js/web-content.min.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_39")
      .get("/file/v3411581748891561736/widget/OCS_domicilioCarousel/js/OCS_domicilioCarousel.min.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_40")
      .get("/file/v7472085591089457855/widget/OCS_CollectionCarousel/js/OCS_CollectionCarousel.min.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_41")
      .get("/file/v5240296674007892047/widget/OCS_ubicationCarousel/js/OCS_ubicationCarousel.min.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_42")
      .get("/file/v5882828843088264911/widget/OCS_recommendationLastView/js/OCS_recommendationLastView.min.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_43")
      .get("/file/v9053347190853208161/widget/OCS_preFooter/js/OCS_preFooter.min.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_44")
      .get("/file/v1918426282187516799/widget/OCS_footer/js/OCS_footer.min.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_45")
      .get("/file/v6394550765128936125/widget/recommendationsTracking/js/recsTracking.min.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_46")
      .get("/file/v459662099607091459/widget/Tagmanager/js/OCS_Tagmanager.min.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_47")
      .get("/ccstoreui/v1/currencies")
      .headers(headers_17))
    .exec(http("request_48")
      .get("/ccstoreui/v1/sites/siteUS")
      .headers(headers_17))
    .exec(http("request_49")
      .get("/ccstoreui/v1/itemTypes/commerceItem?includeBase=false&parent=commerceItem")
      .headers(headers_17))
    .exec(http("request_50")
      .get(uri15 + "/js/oracleunifiedvisit.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_51")
      .get("/shared/js/viewModels/integrationViewModel.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_52")
      .get("/file/general/mm-embarazadas.jpg")
      .headers(headers_52))
    .exec(http("request_53")
      .get("/file/general/mm-bebes.jpg")
      .headers(headers_52))
    .exec(http("request_54")
      .get("/file/general/mm-ninos.jpg")
      .headers(headers_52))
    .exec(http("request_55")
      .get("/file/general/mm-adultos.jpg")
      .headers(headers_52))
    .exec(http("request_56")
      .get("/file/general/mm-adulto-mayor.jpg")
      .headers(headers_52))
    .exec(http("request_57")
      .get(uri22 + "/webfonts/fa-solid-900.woff2")
      .headers(headers_57))
    .exec(http("request_58")
      .get(uri07 + "?nouns=VisitorId,Settings&VisitorId.prefix=Visitor&Settings.prefix=Visitor&Settings.buttonIds=[5736A000000H2uD]&Settings.updateBreadcrumb=1&Settings.urlPrefix=undefined&callback=liveagent._.handlePing&deployment_id=5726A000000HI4w&org_id=00D6A000001UfII&version=41")
      .headers(headers_58))
    .exec(http("request_59")
      .get("/ccstore/v1/images/?source=/file//general/banner-mobile-4.jpg&height=720&width=720")
      .headers(headers_52))
    .exec(http("request_60")
      .get("/ccstore/v1/images/?source=/file//general/banner-desktop-4.jpg&height=1280&width=1280")
      .headers(headers_52))
    .exec(http("request_61")
      .get("/ccstore/v1/images/?source=/file//general/banner-desktop-5.jpg&height=1280&width=1280")
      .headers(headers_52))
    .exec(http("request_62")
      .get("/ccstore/v1/images/?source=/file//general/banner-mobile-5.jpg&height=720&width=720")
      .headers(headers_52))
    .exec(http("request_63")
      .get("/ccstore/v1/images/?source=/file//general/banner-desktop-3.jpg&height=1280&width=1280")
      .headers(headers_52))
    .exec(http("request_64")
      .get("/ccstore/v1/images/?source=/file//general/banner-mobile-3.jpg&height=720&width=720")
      .headers(headers_52))
    .exec(http("request_65")
      .get("/ccstore/v1/images/?source=/file/v7994865462345900751/general/promocional-1.png&height=940&width=940")
      .headers(headers_52))
    .exec(http("request_66")
      .get("/ccstore/v1/images/?source=/file/v3112357589051571799/general/promocional-2a.png&height=940&width=940")
      .headers(headers_52))
    .exec(http("request_67")
      .get("/ccstore/v1/images/?source=/file/v6415043445955035207/general/promocional-3a.png&height=940&width=940")
      .headers(headers_52))
    .exec(http("request_68")
      .get("/ccstore/v1/images/?source=/file/v4594434273896912899/general/promocional-4.png&height=940&width=940")
      .headers(headers_52))
    .exec(http("request_69")
      .get("/ccstore/v1/images/?source=/file/v2132449387731998715/general/promocional-2b.jpg&height=940&width=940")
      .headers(headers_52))
    .exec(http("request_70")
      .get("/ccstore/v1/images/?source=/file/v5921655597456327031/general/promocional-3b.jpg&height=940&width=940")
      .headers(headers_52))
    .exec(http("request_71")
      .get("/file/v4221880053423003842/general/elemento-1col-desktop.jpg")
      .headers(headers_52))
    .exec(http("request_72")
      .get("/file/v854153769813325683/general/concertFamily.PNG")
      .headers(headers_52))
    .exec(http("request_73")
      .get("/file/v6991227172284939482/widget/OCS_recommendationLastView/js/recsRequest.min.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_74")
      .get("/js/oraclejet/js/libs/es6-promise/promise-1.0.0.min.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_75")
      .get("/file/general/logo_supersalud.png")
      .headers(headers_52))
    .exec(http("request_76")
      .get("/file/general/logo_supersubsidio.png")
      .headers(headers_52))
    .exec(http("request_77")
      .get("/file/general/logo_certificaciones.png")
      .headers(headers_52))
    .exec(http("request_78")
      .get("/file/general/logo_asocajas.png")
      .headers(headers_52))
    .exec(http("request_79")
      .get("/file/v4976756941189763856/widget/recommendationsTracking/js/recsRequest.min.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_80")
      .get("/file/v147600203412215771/widget/recommendationsTracking/js/gdprConsent.min.js?bust=20.1")
      .headers(headers_3))
    .exec(http("request_81")
      .get(uri12 + "?id=GTM-5LLX3WJ")
      .headers(headers_3))
    .exec(http("request_82")
      .get("/file/general/icono-tarjeta-compensar.png")
      .headers(headers_52))
    .exec(http("request_83")
      .get("/file/general/icono-mastercard.png")
      .headers(headers_52))
    .exec(http("request_84")
      .get("/file/general/icono-visa.png")
      .headers(headers_52))
    .exec(http("request_85")
      .get("/file/general/icono-pse.png")
      .headers(headers_52))
    .exec(http("request_86")
      .get("/file/general/icono-efecty.png")
      .headers(headers_52))
    .exec(http("request_87")
      .get("/file/general/icono-baloto.png")
      .headers(headers_52))
    .exec(http("request_88")
      .get("/ccstoreui/v1/locations?fields=repositoryId%2Cname%2Clatitude%2Clongitude")
      .headers(headers_17))

    .exec(http("request_90")
      .get("/file/general/logo_compensar.png")
      .headers(headers_52))
    .exec(http("request_91")
      .get(uri10)
      .headers(headers_91))
    .exec(http("request_92")
      .get(uri03 + "/analytics.js")
      .headers(headers_3))
    .exec(http("request_93")
      .get("/ccstoreui/v1/merchant/production-Recommendations")
      .headers(headers_17))
    .exec(http("request_94")
      .get("/file/thirdparty/fonts/fontawesome-webfont.woff2?v=4.7.0")
      .headers(headers_94))


  val chain_1 = exec(http("request_96")
    .get(uri05 + "/account/awlorq1lmp/js/gtm/odc.js")
    .headers(headers_58))
    .exec(http("request_97")
      .get("/ccstoreui/v1/products?categoryId=Acueducto-Centro-Narino&includeChildren=true&storePriceListGroupId=tarifaCategoriaA")
      .headers(headers_17))
    .exec(http("request_98")
      .get(uri05 + "/common/js/0.0.17/common.js")
      .headers(headers_58))
    .exec(http("request_99")
      .get(uri05 + "/account/awlorq1lmp/js/gtm/analytics-default/analytics.js")
      .headers(headers_58))
    .exec(http("request_100")
      .get(uri15 + "/unified/v1/visit/pze8a0c0_siteUS/10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6?dnc=1582868756945")
      .headers(headers_100))
    .exec(http("request_101")
      .get(uri03 + "/r/collect?v=1&_v=j81&a=1922263536&t=pageview&_s=1&dl=https%3A%2F%2Fccstore-prod-ze8a.oracleoutsourcing.com%2F&dp=%2F&ul=es-419&de=UTF-8&dt=Compensar&sd=24-bit&sr=1326x293&vp=1326x293&je=0&_u=QACAAEAB~&jid=858738904&gjid=808872675&cid=534504761.1582730497&tid=UA-55690196-3&_gid=328146947.1582730497&_r=1&gtm=2wg2j05LLX3WJ&z=1288496709")
      .headers(headers_101))
    .exec(http("request_102")
      .get(uri13 + "/Settings.jsonp?sid=a3daec59-8201-4392-b40c-76c4254d3458&Settings.prefix=Visitor&Settings.buttonIds=[5736A000000H2uD]&Settings.updateBreadcrumb=1&Settings.urlPrefix=undefined&callback=liveagent._.handlePing&deployment_id=5726A000000HI4w&org_id=00D6A000001UfII&version=41")
      .headers(headers_58))
    .exec(http("request_103")
      .get("/file/general/bg-ubicacion-actual.png")
      .headers(headers_16))
    .exec(http("request_104")
      .get("/file/thirdparty/fontsCompensar/Pacifico-Regular.ttf")
      .headers(headers_104))
    .exec(http("request_105")
      .get("/ccstore/v1/images/?source=/file/v8511933623276628604/products/id76.01-curso-chocolateria-navidena.jpg&height=940&width=940")
      .headers(headers_52))
    .exec(http("request_106")
      .get("/ccstore/v1/images/?source=/file/v326882883134209849/products/id75.01-curso-ceviche.jpg&height=940&width=940")
      .headers(headers_52))
    .exec(http("request_107")
      .get("/ccstore/v1/images/?source=/file/v5420748897259691348/products/id77.01-curso-confiteria.jpg&height=940&width=940")
      .headers(headers_52))
    .exec(http("request_108")
      .get("/ccstore/v1/images/?source=/file/v8935616271219795483/products/id260.01-curso-ballet.jpg&height=940&width=940")
      .headers(headers_52))
    .exec(http("request_109")
      .get("/file/v1568716789352612004/general/sin-imagen.png")
      .headers(headers_52))
    .exec(http("request_110")
      .get("/ccstore/v1/images/?source=/file/v4461208239862289519/products/id17.01-curso-barberia.jpg&height=940&width=940")
      .headers(headers_52))
    .exec(http("request_111")
      .get("/ccstore/v1/images/?source=/file/v4412032949997530732/products/id314.01-turco-masculino.jpg&height=940&width=940")
      .headers(headers_52))
    .exec(http("request_112")
      .post(uri19 + "/view/recommendations/3.0/json/pze8a0c0/10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6?sessionId=15451401994597121250")
      .headers(headers_112)
      .body(StringBody("""{"locale":"es","ccSiteId":"siteUS","ccVisitorId":"10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6","slots":{"wi300014":{"numRecs":"12","rule":["mostRecentlyViewed"],"dataItems":["repositoryid"]}},"view":{"url":"https://ccstore-prod-ze8a.oracleoutsourcing.com/","pageTitle":"Compensar","storeId":"cloudCatalog","excludeDefaultStore":true}}""")))
    .exec(http("request_113")
      .get("/ccstoreui/v1/products?categoryId=TopSeller&includeChildren=true&storePriceListGroupId=tarifaCategoriaA")
      .headers(headers_17))
    .exec(http("request_114")
      .post("/ccstoreui/v1/analytics/visitorsMetric")
      .headers(headers_114)
      .body(StringBody("""{"visitorId":"10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6","visitId":"692db081:1708a4b478e:-5a28-129.80.155.74"}""")))
    .exec(http("request_115")
      .get(uri18 + "?callback=ORA.analytics.dcsRef.dcsGetIdCallback")
      .headers(headers_58))
    .exec(http("request_116")
      .get("/ccstoreui/v1/products?storePriceListGroupId=tarifaCategoriaA&productIds=HER-B-RED-DEP-TER-013%2CHER-B-RED-REC-CUL-004")
      .headers(headers_116))
    .exec(http("request_117")
      .post(uri06 + "/view/rules/3.0/json/pze8a0c0/10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6?sessionId=692db081:1708a4b478e:-5a28-129.80.155.74&E3SessionID=692db081:1708a4b478e:-5a28-129.80.155.74")
      .headers(headers_117)
      .formParam("""{"uoid":"pze8a0c0","layoutId":"homePageLayout","expid":"pze8a0c0","view":{"pageTitle":"Compensar"},"rules":{"spa":"https://ccstore-prod-ze8a.oracleoutsourcing.com/"}}""", ""))

    .exec(http("request_118")
      .get("/img/no-image.jpg")
      .headers(headers_52))
    .exec(http("request_119")
      .get("/ccstore/v1/images/?source=/file/v7624966437761067448/products/id16.01-curso-automaquillaje.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_120")
      .get("/ccstore/v1/images/?source=/file/v8367902852226702007/products/id261.01-curso-baile-infantil.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_121")
      .get("/ccstore/v1/images/?source=/file/v3703418252860892790/products/id317.03-alquiler-tenis.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_122")
      .get("/ccstore/v1/images/?source=/file/v1970207909237919361/products/id90.01-curso-cocina-wok.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_123")
      .get("/ccstore/v1/images/?source=/file/v210063840450847573/products/id108.01-curso-reposteria.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_124")
      .get("/ccstore/v1/images/?source=/file/v3063990268609440374/products/id410.01-pantuflas-desechables.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_125")
      .get("/ccstore/v1/images/?source=/file/v6040807301349787354/products/id389.01-golfito.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_126")
      .get("/ccstore/v1/images/?source=/file/v4427354359826119629/products/id68.01-curso-mandalas.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_127")
      .get("/ccstore/v1/images/?source=/file/v3409537948277907416/products/id72.01-curso-reiki.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_128")
      .get("/ccstore/v1/images/?source=/file/v5139241599744459586/products/id71.01-curso-masajes-orientales.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_129")
      .get("/ccstore/v1/images/?source=/file/v805872148136732074/products/id334.01-cita-deportologo.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_130")
      .get("/ccstore/v1/images/?source=/file/v4713543232822993913/products/id283.01-natacion-ambientacion.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_131")
      .get("/ccstore/v1/images/?source=/file/v6771200632480273973/products/id324.01-alquiler-futbol-once.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_132")
      .get("/ccstore/v1/images/?source=/file/v5805700490918158691/products/id328.01-cancha-multiple.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_133")
      .get("/ccstore/v1/images/?source=/file/v4114342839801336768/products/id318.01-alquiler-voleibol.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_134")
      .get("/ccstore/v1/images/?source=/file/v2795948522667349374/products/id327.01-mesa-pin.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_135")
      .get("/ccstore/v1/images/?source=/file/v4747114914946812623/products/id116.01-cocina-contemporanea.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_136")
      .get("/ccstore/v1/images/?source=/file/v8949520433990424853/products/id102.01-curso-pastas-arroces.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_137")
      .get("/ccstore/v1/images/?source=/file/v4125993808896894775/products/id103.01-cursos-pescados.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_138")
      .get("/ccstore/v1/images/?source=/file/v1885501381938097600/products/id105.01-curso-plancha-parrilla.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_139")
      .get("/ccstore/v1/images/?source=/file/v7804011213948454949/products/id80.02-curso-pequenos-chefs.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_140")
      .get("/ccstore/v1/images/?source=/file/v9158461705445261084/products/id110.01-curso-sushi.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_141")
      .get("/ccstore/v1/images/?source=/file/v8349063735967142932/products/id112.01-curso-quesos-vinos.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_142")
      .get("/ccstore/v1/images/?source=/file/v1259897058456971030/products/id32.01-curso-manicure-pedicure.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_143")
      .get("/ccstore/v1/images/?source=/file/v8265834210654753757/products/id33.01-curso-maquillaje-artistico.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_144")
      .get("/ccstore/v1/images/?source=/file/v8636632739830930617/products/id38.01-curso-peinados-ninas.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_145")
      .get("/ccstore/v1/images/?source=/file/v6288910142295291740/products/id42.01-curso-cepillado.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_146")
      .get("/ccstore/v1/images/?source=/file/v8411751996693919836/products/id46.01-curso-trenzas-basico.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_147")
      .get("/ccstore/v1/images/?source=/file/v5382768309808412047/products/id65.01-curso-perdonandome.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_148")
      .get("/ccstore/v1/images/?source=/file/v8417102411792199853/products/id470.01-curso-code-design.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_149")
      .get("/ccstore/v1/images/?source=/file/v8921235153272347598/products/id471.01-curso-game-design.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_150")
      .get("/ccstore/v1/images/?source=/file/v6740162496807414109/products/id140.01-maquina-fileteadora.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_151")
      .get("/ccstore/v1/images/?source=/file/v8555666754856287725/products/id141.01-maquina-plana.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_152")
      .get("/ccstore/v1/images/?source=/file/v4643664922221086637/products/id390.01-golfito-familiar.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_153")
      .get("/ccstore/v1/images/?source=/file/v5346993423198281465/products/id397.01-bicicleta-acuatica.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_154")
      .get("/ccstore/v1/images/?source=/file/v5959455917469606502/products/id398.01-triciclos.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_155")
      .get("/ccstore/v1/images/?source=/file/v1081928282647308029/products/id400.01-muro-escalar.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_156")
      .get("/ccstore/v1/images/?source=/file/v1240346814639176118/products/id401.01-sala-ensayos.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_157")
      .get("/ccstore/v1/images/?source=/file/v2659656879011164748/products/id405.01-sala-grabacion.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_158")
      .get("/ccstore/v1/images/?source=/file/v5559378892567672683/products/id326.01-cancha-squash.jpg&height=300&width=300")
      .headers(headers_52))
    .exec(http("request_159")
      .get("/ccstore/v1/images/?source=/file/v7236835343465143211/products/id285.01-natacion-espalda.jpg&height=300&width=300")
      .headers(headers_52))

    .exec(http("request_160")
      .get("/ccstore/v1/images/?source=/file/v3703418252860892790/products/id317.03-alquiler-tenis.jpg")
      .headers(headers_52))
    .exec(http("request_161")
      .get("/ccstoreui/v1/products?categoryId=adultosFamily&includeChildren=true&storePriceListGroupId=tarifaCategoriaA")
      .headers(headers_17))

    .exec(http("request_162")
      .get("/ccstoreui/v1/assembler/assemble?Ntt=pl&Ntk=TypeAhead&visitorId=10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6&visitId=692db081%3A1708a4b478e%3A-5a28-129.80.155.74&searchType=typeahead&language=es&path=%2Ftypeahead&redirects=yes&site=default&No=0&Nrpp=5")
      .headers(headers_116))
    .exec(http("request_163")
      .get("/ccstore/v1/images/?source=/file/v8555666754856287725/products/id141.01-maquina-plana.jpg&height=100&width=100")
      .headers(headers_52))
    .exec(http("request_164")
      .get("/ccstore/v1/images/?source=/file/v1885501381938097600/products/id105.01-curso-plancha-parrilla.jpg&height=100&width=100")
      .headers(headers_52))
    .exec(http("request_165")
      .get("/ccstore/v1/images/?source=/file/v9210998254319787427/products/id153.01-iniciacion-plastilina.jpg&height=100&width=100")
      .headers(headers_89))
    .exec(http("request_166")
      .get("/ccstore/v1/images/?source=/file/v3387155928747179425/products/id157.01-modelado-plastilina.jpg&height=100&width=100")
      .headers(headers_89))

    .exec(http("request_167")
      .get("/ccstoreui/v1/assembler/assemble?Ntt=plan&Ntk=TypeAhead&visitorId=10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6&visitId=692db081%3A1708a4b478e%3A-5a28-129.80.155.74&searchType=typeahead&language=es&path=%2Ftypeahead&redirects=yes&site=default&No=0&Nrpp=5")
      .headers(headers_116))
    .exec(http("request_168")
      .get("/ccstore/v1/images/?source=/file/v404094209534323880/products/id331.01-plan-tu-bienestar.jpg&height=100&width=100")
      .headers(headers_52))

    .exec(http("request_169")
      .get("/ccstoreui/v1/assembler/assemble?Ntt=plan&Ntk=TypeAhead&visitorId=10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6&visitId=692db081%3A1708a4b478e%3A-5a28-129.80.155.74&searchType=typeahead&language=es&path=%2Ftypeahead&redirects=yes&site=default&No=0&Nrpp=5")
      .headers(headers_116))

    .exec(http("request_170")
      .get("/ccstoreui/v1/assembler/assemble?Ntt=plan%20t&Ntk=TypeAhead&visitorId=10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6&visitId=692db081%3A1708a4b478e%3A-5a28-129.80.155.74&searchType=typeahead&language=es&path=%2Ftypeahead&redirects=yes&site=default&No=0&Nrpp=5")
      .headers(headers_116))
    .exec(http("request_171")
      .get("/ccstore/v1/images/?source=/file/v3858550628340617687/products/id337.01-plan-tu-cur.jpg&height=100&width=100")
      .headers(headers_52))
    .exec(http("request_172")
      .get("/ccstoreui/v1/assembler/assemble?Ntt=plan%20tu&Ntk=TypeAhead&visitorId=10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6&visitId=692db081%3A1708a4b478e%3A-5a28-129.80.155.74&searchType=typeahead&language=es&path=%2Ftypeahead&redirects=yes&site=default&No=0&Nrpp=5")
      .headers(headers_116))
    .exec(http("request_173")
      .get("/ccstore/v1/images/?source=/file/v8801074458571087310/products/id329.01-plan-tu-equilibrio.jpg&height=100&width=100")
      .headers(headers_89))

    .exec(http("request_174")
      .get("/ccstoreui/v1/assembler/assemble?Ntt=plan%20tu&Ntk=TypeAhead&visitorId=10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6&visitId=692db081%3A1708a4b478e%3A-5a28-129.80.155.74&searchType=typeahead&language=es&path=%2Ftypeahead&redirects=yes&site=default&No=0&Nrpp=5")
      .headers(headers_116))

    .exec(http("request_175")
      .get("/ccstoreui/v1/pages/plan-tu-cur/product/HER-B-RED-DEP-ACO-028?dataOnly=false&currentDataOnly=true")
      .headers(headers_175))
    .exec(http("request_176")
      .get("/ccstoreui/v1/pages/css/plan-tu-cur/product/HER-B-RED-DEP-ACO-028?occsite=siteUS")
      .headers(headers_176))
    .exec(http("request_177")
      .get("/ccstoreui/v1/pages/plan-tu-cur/product/HER-B-RED-DEP-ACO-028?dataOnly=false&cacheableDataOnly=true&productTypesRequired=true")
      .headers(headers_175))
    .exec(http("request_178")
      .get("/ccstoreui/v1/pages/layout/plan-tu-cur/product/HER-B-RED-DEP-ACO-028?ccvp=lg")
      .headers(headers_175))
    .exec(http("request_179")
      .get("/file/v213391945242200072/widget/v5/productSocialMetaTags/js/product-social-meta-tags.min.js?bust=20.1")
      .headers(headers_179))
    .exec(http("request_180")
      .get("/file/v8569848705464500142/widget/notifications/js/notifications-widget.min.js?bust=20.1")
      .headers(headers_179))
    .exec(http("request_181")
      .get("/file/v7428725133430172162/widget/OCS_breadCrumb/js/OCS_breadCrumb.min.js?bust=20.1")
      .headers(headers_179))
    .exec(http("request_182")
      .get("/file/v7452357830531519602/widget/OCS_productDetails/js/OCS_productDetails.min.js?bust=20.1")
      .headers(headers_179))
    .exec(http("request_183")
      .get("/file/v810631028475693063/widget/OCS_tabsProductDetails/js/OCS_tabsProductDetails.min.js?bust=20.1")
      .headers(headers_179))
    .exec(http("request_184")
      .get("/file/v5452838180452016298/widget/OCS_Related_Products/js/OCS_Related_Products.min.js?bust=20.1")
      .headers(headers_179))
    .exec(http("request_185")
      .get("/file/v1531135426181516520/widget/OCS_productAddToSpaceWidget/js/OCS_productAddToSpaceWidget.min.js?bust=20.1")
      .headers(headers_179))
    .exec(http("request_186")
      .get(uri10)
      .headers(headers_186))

  val chain_2 = exec(http("request_187")
    .get("/ccstoreui/v1/itemTypes/sku-PySPlanAfiliacion?includeBase=true&parent=sku")
    .headers(headers_175))
     .exec(http("request_188")
      .get("/shared/js/ccLibs/pinit_sdk.js?bust=20.1")
      .headers(headers_179))
    .exec(http("request_189")
      .get("/shared/js/pageLayout/ProductRetriever.js?bust=20.1")
      .headers(headers_179))
    .exec(http("request_190")
      .get("/shared/js/viewModels/productTypesViewModel.js?bust=20.1")
      .headers(headers_179))
    .exec(http("request_191")
      .get(uri11 + "/pinit.js")
      .headers(headers_191))
    .exec(http("request_192")
      .get("/ccstoreui/v1/collections/rootCategory?catalogId=cloudCatalog&maxLevel=3&expand=childCategories&fields=childCategories(items)")
      .headers(headers_175))
    .exec(http("request_193")
      .get(uri09 + "/js/300/addthis_widget.js?_=1582868754435")
      .headers(headers_193))
    .exec(http("request_194")
      .get(uri01 + "?_=1582868754433")
      .headers(headers_193))
    .exec(http("request_195")
      .post("/ccstoreui/v1/ccm/page")
      .headers(headers_195)
      .body(StringBody("""{"pageViews":1}""")))
    .exec(http("request_196")
      .post(uri06 + "/view/rules/3.0/json/pze8a0c0/10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6?sessionId=692db081:1708a4b478e:-5a28-129.80.155.74&E3SessionID=692db081:1708a4b478e:-5a28-129.80.155.74")
      .headers(headers_196)
      .formParam("""{"uoid":"pze8a0c0","layoutId":"pl3200008","expid":"pze8a0c0","view":{"pageTitle":"Plan Tu CUR"},"rules":{"spa":"https://ccstore-prod-ze8a.oracleoutsourcing.com/plan-tu-cur/product/HER-B-RED-DEP-ACO-028"}}""", ""))
    .exec(http("request_197")
      .get("/ccstoreui/v1/itemTypes/PySPlanAfiliacion?includeBase=true&parent=product")
      .headers(headers_175))
    .exec(http("request_198")
      .get("/ccstore/v1/images/?source=/file/v3858550628340617687/products/id337.01-plan-tu-cur.jpg&height=940&width=940")
      .headers(headers_198))
    .exec(http("request_199")
      .get("/ccstore/v1/images/?source=/file/v4802059468060175560/products/id337.02-plan-tu-cur.jpg&height=100&width=100")
      .headers(headers_198))
    .exec(http("request_200")
      .get("/ccstore/v1/images/?source=/file/v543625056348680793/products/id337.03-plan-tu-cur.jpg&height=100&width=100")
      .headers(headers_198))

    .exec(http("request_202")
      .get("/ccstoreui/v1/products?productIds=HER-B-RED-DEP-TER-096&includeChildSKUsListingIds=true")
      .headers(headers_175))
    .exec(http("request_203")
      .get("/ccstoreui/v1/itemTypes/sku-PySPlanAfiliacion?includeBase=true&parent=sku")
      .headers(headers_175))
    .exec(http("request_204")
      .get("/ccstoreui/v1/stockStatus/HER-B-RED-DEP-ACO-028?skuId=&catalogId=")
      .headers(headers_175))
    .exec(http("request_205")
      .get("/ccstoreui/v1/prices/HER-B-RED-DEP-ACO-028")
      .headers(headers_175))
    .exec(http("request_206")
      .post(uri19 + "/view/3.0/json/pze8a0c0/10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6?sessionId=15451401994597121250")
      .headers(headers_206)
      .body(StringBody("""{"view":{"url":"https://ccstore-prod-ze8a.oracleoutsourcing.com/searchresults?Ntt=ambientacion*&Rdm=109&searchType=simple&type=search&Ns=product.displayName%7C0","pageTitle":"Compensar","storeId":"cloudCatalog","excludeDefaultStore":true,"searchText":"ambientacion*"}}""")))
    .exec(http("request_207")
      .get("/ccstoreui/v1/products/HER-B-RED-DEP-ACO-028?fields=listPrices%2CsalePrices")
      .headers(headers_175))
    .exec(http("request_208")
      .get("/ccstoreui/v1/itemTypes?itemTypeIds=PySMaterial-Articulos")
      .headers(headers_175))
    .exec(http("request_209")
      .get(uri16)
      .headers(headers_179))
    .exec(http("request_210")
      .get(uri01 + "?hash=26431fd46ca490f71cfcd824974fbf13&ua=modern_es6")
      .headers(headers_210))
       .exec(http("request_211")
      .get(uri09 + "/l10n/client.es.min.json")
      .headers(headers_211))
    .exec(http("request_212")
      .get(uri09 + "/static/sh.f48a1a04fe8dbf021b4cda1d.html")
      .headers(headers_212))
    .exec(http("request_213")
      .get("/ccstoreui/v1/stockStatus?products=HER-B-RED-DEP-TER-096&catalogId=")
      .headers(headers_175))
    .exec(http("request_214")
      .get(uri17 + "?si=5e58a92b702b74fd&bkl=0&bl=1&pdt=25650&sid=5e58a92b702b74fd&pub=ra-5d825fc4795b019a&rev=v8.28.3-wp&ln=es&pc=men&cb=0&ab=-&dp=ccstore-prod-ze8a.oracleoutsourcing.com&fp=plan-tu-cur%2Fproduct%2FHER-B-RED-DEP-ACO-028&fr=&of=0&pd=1&irt=1&vcl=1&md=0&ct=1&tct=0&abt=0&cdn=0&pi=1&rb=0&gen=100&chr=UTF-8&mk=Plan%20Tu%20CUR%2CDefault%20Collection%20For%20Products%2CAdultos%2CCursos%2CAcueducto%20Santa%20Luc%C3%ADa&colc=1582868779853&jsl=129&uvs=5e58a92baf268e75000&skipb=1&callback=addthis.cbs.jsonp__341129493610665250")
      .headers(headers_193))
    .exec(http("request_215")
      .get(uri11 + "/pinit_main.js?0.8966839384192944")
      .headers(headers_193))
    .exec(http("request_216")
      .get(uri14)
      .headers(headers_216))
      .exec(http("request_217")
      .get(uri09 + "/static/menu.927732efe97ab2da2183.js")
      .headers(headers_179))
    .exec(http("request_218")
      .get(uri09 + "/static/layers.ab5cd98fe1b9a38a4a9f.js")
      .headers(headers_179))
     .exec(http("request_219")
      .get(uri02 + "/?id=http%3A%2F%2Fccstore-prod-ze8a.oracleoutsourcing.com%2Fplan-tu-cur%2Fproduct%2FHER-B-RED-DEP-ACO-028&fields=og_object%7Bengagement%7D&callback=_ate.cbs.rcb_gvw40")
      .headers(headers_193))
    .exec(http("request_220")
      .get(uri02 + "/?id=https%3A%2F%2Fccstore-prod-ze8a.oracleoutsourcing.com%2Fplan-tu-cur%2Fproduct%2FHER-B-RED-DEP-ACO-028&fields=og_object%7Bengagement%7D&callback=_ate.cbs.rcb_f9ao0")
      .headers(headers_193))
    .exec(http("request_221")
      .get(uri08 + "?url=https%3A%2F%2Fccstore-prod-ze8a.oracleoutsourcing.com%2Fplan-tu-cur%2Fproduct%2FHER-B-RED-DEP-ACO-028&callback=_ate.cbs.rcb_3pno0")
      .headers(headers_193))
    .exec(http("request_222")
      .get(uri08 + "?url=http%3A%2F%2Fccstore-prod-ze8a.oracleoutsourcing.com%2Fplan-tu-cur%2Fproduct%2FHER-B-RED-DEP-ACO-028&callback=_ate.cbs.rcb_i2an0")
      .headers(headers_193))
    .pause(683 milliseconds)
    .exec(http("request_223")
      .get(uri23 + "/?type=pidget&guid=kgq7dm3T1iZY&tv=2019040401&event=init&sub=www&button_count=0&follow_count=0&pin_count=0&profile_count=0&board_count=0&section_count=0&lang=es&nvl=es-419&via=https%3A%2F%2Fccstore-prod-ze8a.oracleoutsourcing.com%2Fplan-tu-cur%2Fproduct%2FHER-B-RED-DEP-ACO-028&callback=PIN_1582868780291.f.callback[0]")
      .headers(headers_193))
    .pause(26)
    .exec(http("request_224")
      .get(uri13 + "/Availability.jsonp?sid=a3daec59-8201-4392-b40c-76c4254d3458&r=183&Availability.prefix=Visitor&Availability.ids=[5736A000000H2uD]&callback=liveagent._.handlePing&deployment_id=5726A000000HI4w&org_id=00D6A000001UfII&version=41")
      .headers(headers_224))
    .pause(15)
    .exec(http("request_225")
      .post("/ccstoreui/v1/orders/price?includeShippingGroups=true")
      .headers(headers_195)
      .body(StringBody("""{"shoppingCart":{"items":[{"productId":"HER-B-RED-DEP-ACU-002","quantity":1,"repositoryId":"","availabilityDate":null,"catRefId":"HER-1-753405","expanded":false,"stockStatus":true,"stockState":"IN_STOCK","commerceItemQuantity":1,"selectedOptions":[{"optionName":"Edad Segmento mínima","optionValue":"84","optionId":"x_seg_references_min","optionValueId":274},{"optionName":"Edad segmento máxima","optionValue":"1188","optionId":"x_seg_references_max","optionValueId":1374},{"optionName":"Genero cursos","optionValue":"Mixto","optionId":"x_gender","optionValueId":3},{"optionName":"Nivel","optionValue":"Ambientación Principiante Adulto","optionId":"x_level","optionValueId":2236},{"optionName":"Año","optionValue":"2020","optionId":"x_year","optionValueId":1},{"optionName":"Hora fin curso","optionValue":"08:00 a.m.","optionId":"x_endTime3","optionValueId":150},{"optionName":"Fecha fin del servicio de curso","optionValue":"22/03","optionId":"x_endDate3","optionValueId":201},{"optionName":"Hora inicio curso","optionValue":"06:30 a.m.","optionId":"x_startTime3","optionValueId":68},{"optionName":"Fecha inicio del servicio de curso","optionValue":"29/02","optionId":"x_startDate3","optionValueId":538},{"optionName":"Sede","optionValue":"CUR - Centro Urbano de Recreación","optionId":"x_headquarter","optionValueId":32},{"optionName":"Día de la semana","optionValue":"sábado | domingo","optionId":"x_timeZone","optionValueId":76}],"detailedItemPriceInfo":[],"detailedRecurringChargeInfo":[],"externalData":[],"addOnItem":false,"_date":null,"_endTimeItem":null,"_startTimeItem":null,"_discount":null,"_weekDays":null,"_headquarters":null,"_subStage":null,"_price":null,"_numberDocument":null,"_stage":null,"_level":null,"_nameServicesPyS":null,"_identificationType":null,"_nameClient":null,"_schedule":null,"_requirements":null,"displayName":"Curso de natación ambientación","invalid":false,"commerceItemId":"ci1582869407184415171","priceListGroupId":"tarifaCategoriaA"}],"coupons":[]},"combineLineItems":"no","payments":[],"_tax":0,"_name":"nombre requerido","_paymentMethod":"Banco","_documentType":"CC","_orderExpirationDate":null,"_orderState":null,"_documentNumber2":null,"_discount":0,"_proveOfPayment":null,"_stateDescription":null,"_acceptanceRequirements":"campo requerido","_subtotal":0,"_total":0,"_phone":0,"_numberQuotation2":null,"_paymentDateTime":null,"_channel":"Virtual","shippingGroups":[{"items":[{"productId":"HER-B-RED-DEP-ACU-002","catRefId":"HER-1-753405","quantity":1,"commerceItemId":"ci1582869407184415171"}],"type":"hardgoodShippingGroup","shippingGroupId":"0"}]}""")))
    .exec(http("request_226")
      .post(uri19 + "/cart/3.0/json/pze8a0c0/10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6?sessionId=15451401994597121250")
      .headers(headers_206)
      .body(StringBody("""{"cart":{"productIds":["HER-B-RED-DEP-ACU-002"],"pricelistGroupId":"tarifaCategoriaA","currencyCode":"COP","totalPrice":74200}}""")))
    .exec(http("request_227")
      .post(uri06 + "/ccEvent/3.0/json/pze8a0c0/10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6?sessionId=692db081:1708a4b478e:-5a28-129.80.155.74&E3SessionID=692db081:1708a4b478e:-5a28-129.80.155.74")
      .headers(headers_196)
      .formParam("""{"uoid":"pze8a0c0","layoutId":"pl3200008","expid":"pze8a0c0","t":1,"d":[{"n":1,"v":"1"},{"n":2,"v":"211300"},{"n":3,"v":"211300"}],"c":"COP"}""", ""))
    .pause(2)
    .exec(http("request_228")
      .get("/ccstoreui/v1/pages/css/cart?occsite=siteUS")
      .headers(headers_228))
    .exec(http("request_229")
      .get("/ccstoreui/v1/pages/cart?dataOnly=false&cacheableDataOnly=true&productTypesRequired=false")
      .headers(headers_229))
    .exec(http("request_230")
      .get("/file/v5504157269434804431/css/shoppingCartSummaryWithShippingPageLayout.css?occsite=siteUS")
      .headers(headers_228))
    .exec(http("request_231")
      .get("/ccstoreui/v1/pages/layout/cart?ccvp=lg")
      .headers(headers_229))
       .exec(http("request_232")
      .get(uri10)
      .headers(headers_232))
    .exec(http("request_233")
      .get("/ccstoreui/v1/products?catalogId=cloudCatalog&productIds=HER-B-RED-DEP-ACO-028&includeHistorical=true&storePriceListGroupId=tarifaCategoriaA&includeChildSKUsListingIds=true")
      .headers(headers_229))
    .exec(http("request_234")
      .get("/ccstoreui/v1/stockStatus?products=HER-B-RED-DEP-ACO-028%3AHER-3-214&catalogId=cloudCatalog&locationIds=")
      .headers(headers_229))
    .exec(http("request_235")
      .get("/ccstoreui/v1/merchant/cloudConfiguration")
      .headers(headers_229))
    .exec(http("request_236")
      .get("/file/v1579341317996287950/widget/OCS_shoppingCart/js/OCS_shoppingCart.min.js?bust=20.1")
      .headers(headers_236))
    .exec(http("request_237")
      .get("/file/v8705593721270137169/widget/OCS_orderSummaryCart/js/OCS_orderSummaryCart.min.js?bust=20.1")
      .headers(headers_236))

    .exec(http("request_238")
      .get("/file/general/icono-mastercard.png")
      .headers(headers_238))
    .exec(http("request_239")
      .get("/file/general/icono-tarjeta-compensar.png")
      .headers(headers_238))
    .exec(http("request_240")
      .get("/file/general/icono-visa.png")
      .headers(headers_238))
    .exec(http("request_241")
      .get("/file/general/icono-pse.png")
      .headers(headers_238))
    .exec(http("request_242")
      .get("/file/general/icono-efecty.png")
      .headers(headers_238))
    .exec(http("request_243")
      .get("/file/general/icono-baloto.png")
      .headers(headers_238))

  .exec(http("request_245")
    .get("/file/v8246111310810215725/widget/OCS_shoppingCart/templates/cpq-reconfig.html")
    .headers(headers_245))
    .exec(http("request_246")
      .get("/img/remove.png")
      .headers(headers_244))
    .exec(http("request_247")
      .post("/ccstoreui/v1/ccm/page")
      .headers(headers_247)
      .body(StringBody("""{"pageViews":1}""")))
    .exec(http("request_248")
      .post(uri06 + "/view/rules/3.0/json/pze8a0c0/10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6?sessionId=692db081:1708a4b478e:-5a28-129.80.155.74&E3SessionID=692db081:1708a4b478e:-5a28-129.80.155.74")
      .headers(headers_248)
      .formParam("""{"uoid":"pze8a0c0","layoutId":"shoppingCartSummaryWithShippingPageLayout","expid":"pze8a0c0","view":{"pageTitle":"Compensar"},"rules":{"spa":"https://ccstore-prod-ze8a.oracleoutsourcing.com/cart"}}""", ""))
    .exec(http("request_249")
      .post(uri19 + "/view/3.0/json/pze8a0c0/10FFTna146OKDtXxKks97uYTe8jFfSyAxgQveZlUiphCvKw61E6?sessionId=15451401994597121250")
      .headers(headers_249)
      .body(StringBody("""{"view":{"url":"https://ccstore-prod-ze8a.oracleoutsourcing.com/curso-de-nataci%C3%B3n-ambientaci%C3%B3n/product/HER-B-RED-DEP-ACU-002","productId":"HER-B-RED-DEP-ACU-002","pageTitle":"Curso de natación ambientación","storeId":"cloudCatalog","excludeDefaultStore":true}}""")))
    .exec(http("request_250")
      .get("/ccstoreui/v1/products?categoryId=losusuariosTambienllevaron&includeChildren=true&storePriceListGroupId=tarifaCategoriaA")
      .headers(headers_229))

    .exec(http("request_251")
      .get("/ccstore/v1/images/?source=/file/v4432236996953464218/products/id416.02-gorro-piscina.jpg&height=300&width=300")
      .headers(headers_238))
    .exec(http("request_252")
      .get("/img/no-image.jpg")
      .headers(headers_238))
    .exec(http("request_253")
      .get("/ccstore/v1/images/?source=/file/v326882883134209849/products/id75.01-curso-ceviche.jpg&height=300&width=300")
      .headers(headers_238))
    .exec(http("request_254")
      .get("/ccstore/v1/images/?source=/file/v5559378892567672683/products/id326.01-cancha-squash.jpg&height=300&width=300")
      .headers(headers_238))
    .exec(http("request_255")
      .get("/ccstore/v1/images/?source=/file/v1301332961100128741/products/id02.01-curso-futbol-masculino.jpg&height=300&width=300")
      .headers(headers_244))

  val scn = scenario("PlanTuCur").exec(
    chain_0, chain_1, chain_2)

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)

 // setUp(scn.inject(constantUsersPerSec(50) during  (120)).protocols(httpProtocol)).maxDuration(120)
}