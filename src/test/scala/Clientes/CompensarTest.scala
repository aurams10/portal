package Clientes

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class CompensarTest extends Simulation {

	val data = csv("data/usuarios.csv").queue

	val httpProtocol = http
		.baseUrl("https://ccstore-prod-ze8a.oracleoutsourcing.com")
		//.inferHtmlResources()
		.acceptHeader("image/webp,*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("es-ES,es;q=0.8,en-US;q=0.5,en;q=0.3")
		.doNotTrackHeader("1")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:73.0) Gecko/20100101 Firefox/73.0")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Accept" -> "*/*",
		"X-CCProfileType" -> "storefrontUI")

	val headers_2 = Map("Accept" -> "text/css,*/*;q=0.1")

	val headers_3 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Content-Type" -> "application/json",
		"X-CCProfileType" -> "storefrontUI",
		"X-CCViewport" -> "md",
		"X-Requested-With" -> "XMLHttpRequest",
		"x-ccsite" -> "siteUS")

	val headers_4 = Map("Accept" -> "*/*")

	val headers_10 = Map(
		"Accept" -> "*/*",
		"X-CCViewport" -> "md",
		"X-Requested-With" -> "XMLHttpRequest",
		"authorization" -> "Bearer null")

	val headers_13 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com")

	val headers_14 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Content-Type" -> "application/json",
		"Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
		"X-CCProfileType" -> "storefrontUI",
		"X-CCViewport" -> "md",
		"X-Requested-With" -> "XMLHttpRequest",
		"x-ccsite" -> "siteUS")

	val headers_57 = Map(
		"Accept" -> "application/json",
		"Content-Type" -> "application/x-www-form-urlencoded",
		"Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com")

	val headers_59 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Content-Type" -> "application/json",
		"Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
		"X-CCProfileType" -> "storefrontUI",
		"X-CCViewport" -> "md",
		"X-CCVisitorId" -> "11ADfOJj8L2DtmwNoH0hODPJlHyENNf772BNfQYzJ1OaMWQE58A",
		"X-Requested-With" -> "XMLHttpRequest",
		"x-ccsite" -> "siteUS")

	val headers_61 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Content-Type" -> "application/json",
		"Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
		"X-CCProfileType" -> "storefrontUI",
		"X-CCViewport" -> "md",
		"X-CCVisitId" -> "-3ee9981a:1707d2bf466:-f2c-129.80.155.73",
		"X-CCVisitorId" -> "11ADfOJj8L2DtmwNoH0hODPJlHyENNf772BNfQYzJ1OaMWQE58A",
		"X-Requested-With" -> "XMLHttpRequest",
		"x-ccsite" -> "siteUS")

	val headers_64 = Map(
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "identity",
		"Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
		"TE" -> "Trailers")

	val headers_66 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Content-Type" -> "application/json",
		"X-CCProfileType" -> "storefrontUI",
		"X-CCViewport" -> "md",
		"X-CCVisitId" -> "-3ee9981a:1707d2bf466:-f2c-129.80.155.73",
		"X-CCVisitorId" -> "11ADfOJj8L2DtmwNoH0hODPJlHyENNf772BNfQYzJ1OaMWQE58A",
		"X-Requested-With" -> "XMLHttpRequest",
		"x-ccsite" -> "siteUS")

	val headers_70 = Map(
		"Accept" -> "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8",
		"Accept-Encoding" -> "identity")

	val headers_75 = Map(
		"Accept" -> "*/*",
		"Content-Type" -> "application/x-www-form-urlencoded;charset=utf-8",
		"Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com")

	val headers_92 = Map(
		"Accept" -> "*/*",
		"Content-Type" -> "text/plain;charset=utf-8",
		"Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com")

	val headers_142 = Map(
		"Accept" -> "*/*",
		"X-CCViewport" -> "md",
		"X-CCVisitId" -> "-3ee9981a:1707d2bf466:-f2c-129.80.155.73",
		"X-CCVisitorId" -> "11ADfOJj8L2DtmwNoH0hODPJlHyENNf772BNfQYzJ1OaMWQE58A",
		"X-Requested-With" -> "XMLHttpRequest",
		"authorization" -> "Bearer null")

	val headers_173 = Map(
		"Accept" -> "*/*",
		"TE" -> "Trailers")

	val headers_181 = Map(
		"Accept" -> "*/*",
		"Content-Type" -> "application/json; charset=utf-8",
		"Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
		"X-Requested-With" -> "XMLHttpRequest")

	val uri01 = "https://ccexperimentsstatic.oracleoutsourcing.com/js"
	val uri02 = "https://c.oracleinfinity.io/acs"
	val uri03 = "https://ccrules.oracleoutsourcing.com/EERules"
	val uri04 = "https://d.la1-c1-iad.salesforceliveagent.com/chat/rest/System/MultiNoun.jsonp"
	val uri05 = "https://image.flaticon.com/icons/png/512/38/38294.png"
	val uri06 = "https://presso.compensar.com/connect/checksession"
	val uri07 = "https://assets.pinterest.com/js"
	val uri08 = "https://www.googletagmanager.com/gtm.js"
	val uri09 = "https://d.la2-c2-ph2.salesforceliveagent.com/chat/rest/Visitor/Settings.jsonp"
	val uri10 = "https://cloud-commerce-visit.oracleoutsourcing.com/Visit"
	val uri11 = "https://recs.atgsvcs.com/pr"
	//val uri11 = "https://recs-stage.atgsvcs.com/pr"
	val uri12 = "https://dc.oracleinfinity.io/awlorq1lmp/wtid.js"
	val uri14 = "https://use.fontawesome.com/releases/v5.6.3"
	val uri15 = "https://log.pinterest.com"

	val scn = scenario("CompensarTest")
		.feed(data)
		.exec(http("request_0")
			.get("/")
			.headers(headers_0)
		)
		.exec(
			http("registry")
				.get("/ccstoreui/v1/registry")
				.headers(headers_1)
				.check(header("ETag").saveAs("registryKey"))
		)
		.exec(
			http("publish")
				.get("/ccstoreui/v1/publish")
				.headers(headers_3)
				.check(header("ETag").saveAs("publishKey"))
		)
		.exec(
			http("request_8")
				.get("/ccstoreui/v1/pages/home?dataOnly=false&currentDataOnly=true")
				.headers(headers_3)
		)
		.exec(
			http("request_9")
				.get("/ccstoreui/v1/pages/home?dataOnly=false&cacheableDataOnly=true&productTypesRequired=true")
				.headers(headers_3)
		)
		.exec(
			http("request_10")
				.get("/ccstoreui/v1/pages/css/home?occsite=siteUS")
				.headers(headers_10)
		)
		.exec(
			http("request_11")
				.get("/ccstoreui/v1/pages/layout/home?ccvp=md")
				.headers(headers_3)
		)

		.exec(
			http("request_20")
				.get("/ccstoreui/v1/sites/siteUS")
				.headers(headers_3)
		)
		.exec(
			http("request_22")
				.get("/ccstoreui/v1/currencies")
				.headers(headers_3)
		)
		.exec(
			http("request_51")
				.get(uri10 + "/js/oracleunifiedvisit.js?bust=20.1")
				.headers(headers_4)
		)
		.exec(
			http("getVisitorId")
				.get(uri10 + "/xd/v1/pze8a0c0_siteUS/xd.js")
				.headers(headers_4)
				.check(regex("(?<=visitorId': \\\")(.*)(?=\\\"}\\))").optional.saveAs("visitorId"))
		)
		.exec {session =>
			val currentTime =  System.currentTimeMillis()
			session.set("dateConsult", currentTime+1)
		}
		.exec {session =>
			val currentTime = session("dateConsult").as[Long]
			session.set("dateConsult", currentTime-1)
		}
		.exec(
			addCookie(
				Cookie("xdpze8a0c0_siteUS",  "${visitorId}%3A${dateCookieConsult}%3A${dateCookieConsult}%3A${dateCookieConsult}%3A1%3A1")
			)
		)
		.exec(
			http("getVisitId")
				.get(uri10 + "/unified/v1/visit/pze8a0c0_siteUS/${visitorId}?dnc=${dateConsult}")
				.headers(headers_57)
				.check(jsonPath("$.visitId").saveAs("visitId"))
		)
		.exec(
			addCookie(
				Cookie("xvpze8a0c0_siteUS",  "${visitId}")
			)
		)
		.exec(
			http("checkSession")
				.get("https://presso.compensar.com/connect/checksession")
		)


		.exec(
			http("get session id")
				.post("https://recs.atgsvcs.com/pr/view/recommendations/3.0/json/pze8a0c0")
		//		.post("https://recs-stage.atgsvcs.com/pr/view/recommendations/3.0/json/pze8a0c0")
				.header("Content-Type", "text/plain;charset=UTF-8")
				.header("Host", "recs.atgsvcs.com")
			//	.header("Host", "recs-stage.atgsvcs.com")
				.header("Origin", "https://ccstore-prod-ze8a.oracleoutsourcing.com")
				.header("Referer", "https://ccstore-prod-ze8a.oracleoutsourcing.com/")
				.body(StringBody("{\"locale\":\"es\",\"ccSiteId\":\"siteUS\",\"ccVisitorId\":\"${visitorId}\",\"slots\":{\"wi300014\":{\"numRecs\":\"12\",\"rule\":[\"mostRecentlyViewed\"],\"dataItems\":[\"repositoryid\"]}},\"view\":{\"url\":\"https://ccstore-prod-ze8a.oracleoutsourcing.com/\",\"pageTitle\":\"Compensar\",\"storeId\":\"cloudCatalog\",\"excludeDefaultStore\":true,\"pricelistGroupId\":\"tarifaCategoriaC\",\"currencyCode\":\"COP\"}}"))
			//	.body(StringBody("{\"locale\":\"es\",\"ccSiteId\":\"siteUS\",\"ccVisitorId\":\"${visitorId}\",\"slots\":{\"wi300014\":{\"numRecs\":\"12\",\"rule\":[\"mostRecentlyViewed\"],\"dataItems\":[\"repositoryid\"]}},\"view\":{\"url\":\"https://ccstore-stage-ze8a.oracleoutsourcing.com/\",\"pageTitle\":\"Compensar DEV\",\"storeId\":\"cloudCatalog\",\"excludeDefaultStore\":true,\"pricelistGroupId\":\"tarifaCategoriaA\",\"currencyCode\":\"COP\"}}"))
				.check(jsonPath("$.tracking.sessionId").saveAs("sessionId"))
		)
		.exec(http("Cargar Producto")
			.get("/alquiler-cancha-de-tenis/product/${product}")
		)
		.exec(http("Consultar disponibilidad")
			.post("/ccstorex/custom/v1/occ/practicalibre/162")
			.body(ElFileBody("bodies/bodyPostConsultItem.json")).asJson
		)
		.exec(http("Consultar precios")
			.post("/ccstoreui/v1/orders/price?includeShippingGroups=true")
			.body(ElFileBody("bodies/bodyPostItemAddCar.json")).asJson
		)
		.exec(
			http("add order")
				.get("/ccstoreui/v1/metadata/order?dynamicOnly=true")
				.header("Content-Type", "application/json")
				.header("X-CCProfileType", "storefrontUI")
				.header("x-ccsite", "siteUS")
				.header("X-CCVisitId", "${visitId}")
				.header("X-CCVisitorId","${visitorId}")
				.header("X-Requested-With", "XMLHttpRequest")
		)
		.exec(
			http("add to car")
			//	.post("https://recs-stage.atgsvcs.com/pr/cart/3.0/json/pze8a0c0/${visitorId}?sessionId=${sessionId}")
				.post("https://recs.atgsvcs.com/pr/cart/3.0/json/pze8a0c0/${visitorId}?sessionId=${sessionId}")
				.header("Content-Type", "text/plain;charset=UTF-8")
				.header("Host", "recs-stage.atgsvcs.com")
				.header("Origin", "https://ccstore-prod-ze8a.oracleoutsourcing.com")
				.header("Referer", "https://ccstore-prod-ze8a.oracleoutsourcing.com/alquiler-cancha-de-tenis/product/${product}")
				.body(StringBody("{\"cart\":{\"productIds\":[\"${productIds}\"],\"pricelistGroupId\":\"tarifaCategoriaA\",\"currencyCode\":\"COP\",\"totalPrice\":7300}}"))
		)
		.exec(
			http("")
				.post("https://ccrules.oracleoutsourcing.com/EERules/ccEvent/3.0/json/pze8a0c0/${visitorId}")
				.header("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8")
				.header("Host", "ccrules.oracleoutsourcing.com")
				.header("Origin", "https://ccstore-prod-ze8a.oracleoutsourcing.com")
				.header("Referer", "https://ccstore-prod-ze8a.oracleoutsourcing.com/alquiler-cancha-de-tenis/product/${product}")
				.queryParam("sessionId","${visitId}")
				.queryParam("E3SessionID","${visitId}")
				.body(StringBody("{\"uoid\":\"pze8a0c0\",\"layoutId\":\"pl3500006\",\"expid\":\"pze8a0c0\",\"t\":1,\"d\":[{\"n\":1,\"v\":\"1\"},{\"n\":2,\"v\":\"7300\"},{\"n\":3,\"v\":\"7300\"}],\"c\":\"COP\"}: "))
		)
		.exec(
			http("Stock Status")
				.get("/ccstoreui/v1/stockStatus")
				.header("Content-Type",	"application/json")
				.header("DNT","1")
				.header("Host", "ccstore-prod-ze8a.oracleoutsourcing.com")
				.header("Referer", "https://ccstore-stage-ze8a.ora…/product/${product}")
				.header("X-CCProfileType","storefrontUI")
				.header("x-ccsite","siteUS")
				.header("X-CCVisitId", "${visitId}")
				.header("X-CCVisitorId","${visitorId}")
				.header("X-Requested-With","XMLHttpRequest")
				.queryParam("products","${products}%3AHER-2-162-jueves-baja")
				.queryParam("catalogId","cloudCatalog")
				.queryParam("locationIds","")
		)
		.exec(
			http("checkout without loging")
				.get("/checkout")
				.header("Host", "ccstore-prod-ze8a.oracleoutsourcing.com")
				.header("Upgrade-Insecure-Requests","1")
		)
		.exec(
			http("registry prelogin")
				.get("/ccstoreui/v1/registry")
				.header("DNT","1")
				.header("Host",	"ccstore-prod-ze8a.oracleoutsourcing.com")
				.header("CCProfileType","storefrontUI")
		)
		.exec(
			http("authorize")
				.get("https://presso.compensar.com/connect/authorize")
				.queryParam("client_id", "https://ccstore-prod-ze8a.oracleoutsourcing.com/")
				.queryParam("redirect_uri", "https://ccstore-prod-ze8a.oracleoutsourcing.com/home")
				.queryParam("response_type", "id_token token")
				.queryParam("scope", "openid profile email")
				.queryParam("nonce", "15826874111990.8915339241699316")
				.queryParam("state", "15826874111990.8722201247611474")
				.check(css("#formLogin", "action").saveAs("urlPostLogin"))
				.check(css("[name=\"__RequestVerificationToken\"]", "value").saveAs("RequestVerificationToken"))
		)
		.exec(

			http("post login")
				.post("https://presso.compensar.com${urlPostLogin}")
				.formParam("__RequestVerificationToken", "${RequestVerificationToken}")
				.formParam("DocumentType", "1")
				.formParam("DocumentID", "${DocumentID}")
				.formParam("Password", "Ab123456")
				.formParam("GoogleCaptchaToken", "")
		)
		.exec(
			http("registry after login")
				.get("/ccstoreui/v1/registry")
				.headers(headers_1)
		)
		.exec(
			http("publish after login")
				.get("/ccstoreui/v1/publish")
				.headers(headers_3)
		)
		.exec(
			http("Home viewport")
				.get("/ccstoreui/v1/pages/layout/home?ccvp=lg")
				.header("x-ccsite","siteUS")
				.header("X-CCViewport" ,"lg")
				.header("X-CCVisitorId","${visitorId}")
				.header("X-Requested-With", "XMLHttpRequest")
		)
		.exec(
			http("Home consult after login")
				.get("/ccstoreui/v1/pages/home?dataOnly=false&cacheableDataOnly=true&productTypesRequired=true")
				.headers(headers_3)
				.header("X-CCVisitorId","${visitorId}")
		)
		.exec(
			http("Home consult 2 after login")
				.get("/ccstoreui/v1/pages/home?dataOnly=false&currentDataOnly=true")
				.headers(headers_3)
				.header("X-CCVisitorId","${visitorId}")
		)
		.exec(
			http("eetagdata")
				.get("/ccstoreui/v1/merchant/eetagdata")
				.headers(headers_3)
				.header("X-CCVisitorId","${visitorId}")
		)
		.exec(
			http("eetagdata")
				.get("/ccstoreui/v1/currencies")
				.headers(headers_3)
				.header("X-CCVisitorId","${visitorId}")
		)
		.exec(
			http("itemTypes/commerceItem")
				.get("/ccstoreui/v1/itemTypes/commerceItem")
				.headers(headers_3)
				.header("X-CCVisitorId","${visitorId}")
				.queryParam("includeBase","false")
				.queryParam("parent","commerceItem")
		)
		.exec(
			http("consult products after login")
				.get("/ccstoreui/v1/products")
				.headers(headers_3)
				.header("X-CCVisitorId","${visitorId}")
				.queryParam("catalogId", "cloudCatalog")
				.queryParam("productIds",	"${productIds}")
				.queryParam("includeHistorical","true")
				.queryParam("storePriceListGroupId", "tarifaCategoriaA")
				.queryParam("includeChildSKUsListingIds","true")
		)
		.exec(
			http("consult stock after login")
				.get("/ccstoreui/v1/stockStatus")
				.headers(headers_3)
				.header("X-CCVisitorId","${visitorId}")
				.queryParam("products",	"${products}:HER-2-162-viernes-baja")
				.queryParam("catalogId", "cloudCatalog")
				.queryParam("locationIds","")
		)
		.exec(
			http("consult visitId after login")
				.get("https://cloud-commerce-visit.oracleoutsourcing.com/Visit/unified/v1/visit/pze8a0c0_siteUS/${visitorId}?dnc=${dateConsult}")
		)
		.exec(
			http("orders/price")
				.post("/ccstoreui/v1/orders/price?includeShippingGroups=true")
				.headers(headers_3)
				.header("X-CCVisitorId","${visitorId}")
				.body(ElFileBody("bodies/bodyPostOrderPrice.json")).asJson
		)
		.exec(
			http("get Data user")
				.post("/ccstorex/custom/v1/sso/facebook/userData2")
				.body(ElFileBody("bodies/bodyPostUserData.json")).asJson
				.check(css("[name=\"SAMLResponse\"]", "value").saveAs("SAMLResponse"))
		)
		.exec(
			http("checksession after login")
				.get("https://presso.compensar.com/connect/checksession")
				.header("Host", "presso.compensar.com")
		)
		.exec(
			http("send SAML")
				.post("/SAML/post")
				.formParam("SAMLResponse","${SAMLResponse}")
				.formParam("RelayState","")
		)
		.exec(
			http("get accestoken")
				.post("/ccstoreui/v1/login/")
				.headers(headers_3)
				.header("X-CCVisitorId","${visitorId}")
				.header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
				.formParam("grant_type","saml_credentials")
				.formParam("saml_response","${SAMLResponse}")
				.check(jsonPath("$.access_token").saveAs("accessToken"))
		)
		.exec(
			addCookie(
				Cookie("oauth_token_secret-storefrontUI",  "${accessToken}")
			)
		)
		.exec(
			addCookie(
				Cookie("atgRecVisitorId",  "${visitorId}")
			)
		)
		.exec(
			http("profiles/current")
				.get("/ccstoreui/v1/profiles/current")
				.headers(headers_3)
				.header("Content-Type","application/json")
				.header("X-CCVisitorId","${visitorId}")
				.header("Host","ccstore-prod-ze8a.oracleoutsourcing.com")
				.header("Referer","https://ccstore-prod-ze8a.oracleoutsourcing.com/")
				.header("Authorization", "Bearer ${accessToken}")
				.check(jsonPath("$.id").saveAs("idRegUser"))
		)
		.exec {session =>
			val currentTime =  System.currentTimeMillis()
			session.set("transactionID", currentTime)
		}
		.exec(
			http("consult user login data")
				.post("/ccstorex/custom/v1/occ/userLoginData")
				.formParam("transactionID","${transactionID}")
				.formParam("documento","${documento}")
				.formParam("tipoDocumento","1")
		)
		.exec(
			http("get token oracle plataform")
				.post("https://ccsocial.oracleoutsourcing.com/swm/rs/v1/users/cc/${idRegUser}")
				.header("X-Requested-With","XMLHttpRequest")
				.header("X-CCTenantId","pze8a0c0")
				//.header("X-CCTenantId","sze8a0c0")
				.header("X-CCIsPreview","false")
				.header("Host","ccsocial.oracleoutsourcing.com")
				.header("Content-Type","application/x-www-form-urlencoded")
				.header("DNT","1")
				.formParam("grant_type", "urn:ietf:params:oauth:grant-type:jwt-bearer")
				.formParam("assertion","${accessToken}")
		)
		.exec(
			http("checkout login ok")
				.get("/checkout")
		)
		.exec(
			http("publish login ok")
				.get("/ccstoreui/v1/publish")
				.headers(headers_3)
				.header("X-CCVisitorId","${visitorId}")
		)
		.exec(
			http("pages/layout/checkout login ok")
				.get("/ccstoreui/v1/pages/layout/checkout?ccvp=lg")
				.headers(headers_3)
				.header("X-CCVisitorId","${visitorId}")
		)
		.exec(
			http("pages/layout/checkout dataOnly=false&cacheableDataOnly=true&productTypesRequired=true login ok")
				.get("/ccstoreui/v1/pages/checkout?dataOnly=false&cacheableDataOnly=true&productTypesRequired=true")
				.headers(headers_3)
				.header("X-CCVisitorId","${visitorId}")
		)
		.exec(
			http("pages/layout/checkout dataOnly=false&currentDataOnly=true login ok")
				.get("/ccstoreui/v1/pages/checkout?dataOnly=false&currentDataOnly=true")
				.headers(headers_3)
				.header("X-CCVisitorId","${visitorId}")
		)
		.exec(
			http("pages/layout/checkout occsite=siteUS login ok")
				.get("/ccstoreui/v1/pages/css/checkout?occsite=siteUS")
				.headers(headers_3)
				.header("X-CCVisitorId","${visitorId}")
		)
		.exec(
			http("eetagdata login ok")
				.get("/ccstoreui/v1/merchant/eetagdata")
				.headers(headers_3)
				.header("X-CCVisitorId","${visitorId}")
		)
		.exec( //order id
			http("ccstoreui/v1/orders/current login ok")
				.post("/ccstoreui/v1/orders/current?includeShippingGroups=false")
				.headers(headers_3)
				.header("X-CCVisitorId","${visitorId}")
				.header("Authorization", "Bearer ${accessToken}")
				.header("Content-Type","application/json")
				.body(ElFileBody("bodies/bodyPostUpdateAddCar.json")).asJson
				.check(status.in(200,201,202,203,204,205,206,207,208,209,304,400))
		)
		.exec(
			http("get token oracle plataform login ok")
				.post("https://ccsocial.oracleoutsourcing.com/swm/rs/v1/users/cc/${idRegUser}")
				.header("X-Requested-With","XMLHttpRequest")
				.header("X-CCTenantId","pze8a0c0")
				.header("X-CCIsPreview","false")
				.header("Host","ccsocial.oracleoutsourcing.com")
				.header("Content-Type","application/x-www-form-urlencoded")
				.header("DNT","1")
				.formParam("grant_type", "urn:ietf:params:oauth:grant-type:jwt-bearer")
				.formParam("assertion","${accessToken}")
		)
		.exec(
			http("current loging ok")
				.post("/ccstoreui/v1/orders/current")
				.headers(headers_3)
				.header("X-CCVisitorId","${visitorId}")
				.header("Authorization", "Bearer ${accessToken}")
				.header("Content-Type","application/json")
				.body(ElFileBody("bodies/bodyPostCurrent.json")).asJson
				.check(status.in(200,201,202,203,204,205,206,207,208,209,304,400))
		)
	/*		.exec(
        http("certificados")
          .post("/ccstorex/custom/v1/occ/certificados/${eDocumntID}")
          //.post("ccstorex/custom/v1/occ/certificados/${DocumentID}")
          .header("Content-Type","application/json; charset=utf-8")
          .header("DNT","1")
          .header("Host","nccstore-stage-ze8a.oracleoutsourcing.com")
          .header("X-Requested-With","XMLHttpRequest")
          .header("Referer","https://ccstore-prod-ze8a.oracleoutsourcing.com/checkout")
      )
  */

	setUp(scn.inject(constantUsersPerSec(2) during  (300)).protocols(httpProtocol)).maxDuration(300)
//	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}