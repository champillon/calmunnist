package http

import utilities.Json

import scalaj.http.Http

/**
  * Created by champillon on 5/12/2017 AD.
  */
object HttpAction {

  def post(url: String, json: Json, token: String): Boolean =
    Http(s"${url}")
      .header("Content-Type", "application/json")
      .header("TOKEN", token)
      .postData(json.toText)
      .asString
      .code == 200

  def post(url: String, token: String): Boolean =
    Http(s"${url}")
      .header("Content-Type", "application/json")
      .header("TOKEN", token)
      .postData("{}")
      .asString
      .code == 200

  def postReturn[T: Manifest](url: String, json: Json): Option[T] =
    Json.toObject[T](
      Http(s"${url}")
        .header("Content-Type", "application/json")
        .postData(json.toText)
        .asString
        .body)

  def get[T: Manifest](url: String): Option[T] =
    Json.toObject[T](
      Http(s"${url}")
        .header("Content-Type", "application/json")
        .asString
        .body)

  def get[T: Manifest](url: String, token: String): Option[T] =
    Json.toObject[T](
      Http(s"${url}")
        .header("Content-Type", "application/json")
        .header("TOKEN", token)
        .asString
        .body)

}
