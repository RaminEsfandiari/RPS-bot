package controllers

import play.api.i18n.Messages
import play.api.mvc._

import scala.concurrent.Future


trait ApplicationController extends Controller {

//  val title = Messages("home.title")

  def get = Action.async {
    implicit request => Future.successful(Ok(views.html.index("bino1")))
  }
}

object ApplicationController extends ApplicationController









//  def index = Action {
//    RelativisticModel.select()
//    val energy = scala.util.Properties.envOrElse("ENERGY", "12 GeV")
//    val m = Amount.valueOf(energy).to(KILOGRAM)
//    val testRelativity = s"E=mc^2: $energy = $m"
//    Ok(views.html.index(testRelativity))
//  }
//
//  def db = Action {
//    var out = ""
//    val conn = DB.getConnection()
//    try {
//      val stmt = conn.createStatement
//
//      stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ticks (tick timestamp)")
//      stmt.executeUpdate("INSERT INTO ticks VALUES (now())")
//
//      val rs = stmt.executeQuery("SELECT tick FROM ticks")
//
//      while (rs.next) {
//        out += "Read from DB: " + rs.getTimestamp("tick") + "\n"
//      }
//    } finally {
//      conn.close()
//    }
//    Ok(out)
//  }


