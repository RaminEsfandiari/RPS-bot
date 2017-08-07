import controllers.MoveController
import org.scalatestplus.play.PlaySpec
import org.scalatestplus.play.guice.GuiceOneAppPerTest
import play.api.libs.json.Json
import play.api.test.FakeRequest
import play.api.test.Helpers.{status, _}

class MoveControllerSpec extends PlaySpec with GuiceOneAppPerTest {

  object TestMoveController extends MoveController

  "Move controller" must {
    "return 200 for a GET" in {
      val request = FakeRequest(GET, "/move").withHeaders("Host" -> "localhost")
      val result = route(app, request).get

      status(result) mustBe OK

    }

    """return "ROCK" as JSON for a GET""" in {
      val request = FakeRequest(GET, "/move").withHeaders("Host" -> "localhost")
      val result = route(app, request).get

      contentType(result) mustBe Some("application/json")
      contentAsString(result) mustBe """"ROCK""""
    }

    "return bot's last move" in {
      val json = """{"lastMove": "PAPER"}"""
      val fakeRequest = FakeRequest(POST, "/move").withHeaders("Host" -> "localhost").withJsonBody(Json.parse(json))
      val result = TestMoveController.lastMove.apply()(fakeRequest)

      status(result) mustBe OK
      contentAsString(result) must contain("paper")
    }
  }
}
