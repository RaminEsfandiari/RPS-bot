package controllers

import play.api.libs.json.Json
import play.api.mvc.{Action, Controller}

class MoveController extends Controller {

  var mostRecentMove: String = ""

  def move() = Action {
    lastMove == "ROCK"
    Ok(Json.toJson("ROCK"))
  }

  def lastMove() = Action {
    Ok(Json.toJson(mostRecentMove))
  }
}