package http

import entities.{User, UserForm}
import org.scalatest.FunSuite
import http.HttpAction._

/**
  * Created by champillon on 2/17/2017 AD.
  */
class HttpActionSpec
  extends FunSuite {

  test("post, return true if success") {
    val user = UserForm(1, "GoT", "u know nothing John Snow.")

    assert(post(url = "http://jsonplaceholder.typicode.com/posts"
      , json = user
      , token = ""))
  }

  test("get, return true if success") {
    val testObject = get[User](
      url = "https://jsonplaceholder.typicode.com/posts/1"
      , token = "")

    assert(testObject.isInstanceOf[Option[User]])
  }
}
