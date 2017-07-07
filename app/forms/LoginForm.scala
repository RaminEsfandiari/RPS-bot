package forms

import models.Credentials
import play.api.data._
import play.api.data.Forms._

object LoginForm {

  val loginForm = Form(
    mapping(
      "email" -> text,
      "password" -> text
    )(Credentials.apply)(Credentials.unapply)
  )

}

