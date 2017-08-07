package controllers

import play.api.libs.json.Json
import play.api.mvc.{Action, Controller}

class MoveController extends Controller {

  var mostRecentMove: String = ""

  val ROCK = "Rock"
  val PAPER = "Paper"
  val SCISSORS = "Scissors"

  val list = List(ROCK,PAPER,SCISSORS)
  val r = scala.util.Random

  def move() = Action {
    val m = list(r.nextInt(3))
    lastMove == m
    Ok(Json.toJson(m))
  }

  def lastMove() = Action {
    Ok(Json.toJson(mostRecentMove))
  }
}