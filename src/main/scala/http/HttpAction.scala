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
      .code == 201

  def get[T: Manifest](url: String, token: String): Option[T] =
    Json.toObject[T](
      Http(s"${url}")
        .header("Content-Type", "application/json")
        .header("TOKEN", token)
        .asString
        .body)

}
