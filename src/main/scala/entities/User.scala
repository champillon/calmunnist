package entities

import utilities.Json

/**
  * Created by champillon on 6/3/2017 AD.
  */
case class User(userId: Int
                , id: Int
                , title: String
                , body: String)
  extends Json

case class UserForm(id: Int
                    , title: String
                    , body: String)
  extends Json