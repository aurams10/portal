package Clientes


import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class login extends Simulation {
  val data = csv("data/usr.csv").queue

  val numberUsers = Integer.getInteger("users", 6)
  val totalSeconds = java.lang.Long.getLong("time", 600)
  val maxDuration = java.lang.Long.getLong("max", 120)

  val httpProtocol = http
    .baseUrl("https://ccstore-prod-ze8a.oracleoutsourcing.com")
    .acceptHeader("*/*")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("es-ES,es;q=0.8,en-US;q=0.5,en;q=0.3")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:72.0) Gecko/20100101 Firefox/72.0")

  val headers_0 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_1 = Map("Accept" -> "text/css,*/*;q=0.1")

  val headers_2= Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
    "Origin" -> "https://presso.compensar.com",
    "Upgrade-Insecure-Requests" -> "1")

  val headers_6 = Map(
    "Accept" -> "*/*",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCProfileType" -> "storefrontUI")

  val headers_10 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Content-Type" -> "application/json",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCViewport" -> "lg",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")

  val headers_257 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Content-Type" -> "application/json",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCViewport" -> "lg",
    "X-CCVisitorId" -> "104CBexrstOJ1WttOywJZeD2SrYDYiwY9dMLBmetMDLDm-Y5ACD",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")

  val headers_19 = Map(
    "Pragma" -> "no-cache",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCViewport" -> "lg",
    "X-Requested-With" -> "XMLHttpRequest",
    "authorization" -> "Bearer null")

  val headers_271 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Content-Type" -> "application/json",
    "Origin" -> "https://ccstore-prod-ze8a.oracleoutsourcing.com",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CCProfileType" -> "storefrontUI",
    "X-CCViewport" -> "lg",
    "X-CCVisitorId" -> "104CBexrstOJ1WttOywJZeD2SrYDYiwY9dMLBmetMDLDm-Y5ACD",
    "X-Requested-With" -> "XMLHttpRequest",
    "x-ccsite" -> "siteUS")



  val uri04 = "https://presso.compensar.com"


  val scn = scenario("AUTENTICACION DE USUARIO EN PORTAL E-COMMERCE")
    .feed(data)
    .exec(http("Home")
      .get("/")
      .headers(headers_0)
      .resources(http("Home")
        .get("/file/thirdparty/fonts/font-awesome.min.css")
        .headers(headers_1),
        /*CHEKEAR SESION*/
        http("Home")
          .get(uri04 + "/connect/checksession")
          .headers(headers_0)))

    .exec(http("Pagina Login")
      //.get(uri04 + "/connect/authorize?client_id=https://ccstore-stage-ze8a.oracleoutsourcing.com/home&redirect_uri=https://ccstore-stage-ze8a.oracleoutsourcing.com/home&response_type=id_token%20token&scope=openid%20profile%20email&nonce=15801541163800.6495629771571915&state=15801541163800.876948323061112")
      .get(uri04 + "/connect/authorize?client_id=https://ccstore-prod-ze8a.oracleoutsourcing.com/&redirect_uri=https://ccstore-prod-ze8a.oracleoutsourcing.com/home&response_type=id_token%20token&scope=openid%20profile%20email&nonce=15801541163800.6495629771571915&state=15801541163800.876948323061112")
      .headers(headers_0)
      .check(status is 200)
      .check(css("#formLogin", "action").saveAs("TOKEN"))
      .check(css("[name=\"__RequestVerificationToken\"]", "value").saveAs("VERIFICAR")))



    .exec(http("Login")
      .post(uri04 + """${TOKEN}""")
      .headers(headers_2)
      .formParam("__RequestVerificationToken", """${VERIFICAR}""")
      .formParam("DocumentType", "1")
      .formParam("DocumentID", "${DocumentID}")
      .formParam("Password", "Ab123456")
      .formParam("GoogleCaptchaToken", "")
      .check(status is 200)
      .check(bodyString.saveAs("Response")))
    .exec {session =>
      val DocumentID=   session("DocumentID").as[String]
      println("=============================DATOS DE LA TRANSACCION=============================")
      println("USUARIO: "+ DocumentID)
      println("=================================FIN TRANSACCION=================================")
      session
    }

    .exec(http("Login")
      .get("/ccstoreui/v1/registry")
      .headers(headers_6))

    .exec(http("Login")
      .get("/ccstoreui/v1/publish")
      .headers(headers_10))

    .exec(http("Login")
      .get("/ccstoreui/v1/pages/layout/home?ccvp=lg")
      .headers(headers_257))

    .exec(http("Login")
      .get("/ccstoreui/v1/pages/home?dataOnly=false&cacheableDataOnly=true&productTypesRequired=true")
      .headers(headers_10))
    .exec(http("Login")
      .get("/ccstoreui/v1/pages/home?dataOnly=false&currentDataOnly=true")
      .headers(headers_10))

    .exec(http("Login")
      .get("/ccstoreui/v1/merchant/eetagdata")
      .headers(headers_257))

    .exec(http("Login")
      .post("/ccstoreui/v1/ccm/page")
      .headers(headers_271)
      .body(StringBody("""{"pageViews":1}""")))

    .exec(http("Login")
      .get("/ccstoreui/v1/resources/ns.common?locale=es")
      .headers(headers_10))
    .exec(http("Login")
      .get("/ccstoreui/v1/resources/ns.ccformats?locale=es")
      .headers(headers_257))

    .exec(http("Login")
      .get("/ccstoreui/v1/currencies")
      .headers(headers_10))

    .exec(http("Login")
      .get("/ccstoreui/v1/itemTypes/commerceItem?includeBase=false&parent=commerceItem")
      .headers(headers_10))

    .exec(http("Login")
      .get("/ccstoreui/v1/products?categoryId=TopSeller&includeChildren=true&storePriceListGroupId=tarifaCategoriaA")
      .headers(headers_10))

    .exec(http("Login")
      .get("/ccstoreui/v1/locations?fields=repositoryId%2Cname%2Clatitude%2Clongitude")
      .headers(headers_10))

    .exec(http("Login")
      .get("/ccstoreui/v1/products?categoryId=adultosFamily&includeChildren=true&storePriceListGroupId=tarifaCategoriaA")
      .headers(headers_10))
    .exec {session =>
      val bodyResponse = session("bodyResponse").as[String]
      println(bodyResponse)
      session
    }

  println(s"La cantidad de usuarios para la prueba será de $numberUsers")
  println(s"El tiempo para la prueba sera de $totalSeconds segundos")
 println(s"La duración maxima de la prueba será de $maxDuration segundos")
  setUp(scn.inject(constantConcurrentUsers(numberUsers)during (totalSeconds)).protocols(httpProtocol)).maxDuration(maxDuration)


 // setUp(scn.inject(constantUsersPerSec(3) during  (600)).protocols(httpProtocol)).maxDuration(600)

 // setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}