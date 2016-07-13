import controllers.ApplicationController
import org.scalatest.{FlatSpec, Matchers}
import play.api.mvc.Result
import play.api.test.FakeRequest
import play.api.test.Helpers._

import scala.concurrent.Future

class ApplicationControllerSpec extends FlatSpec with Matchers{

  object TestApplicationController extends ApplicationController

  "ApplicationController" should
   "load front page successfully" in {
      val result: Future[Result] = TestApplicationController.get().apply(FakeRequest())
      contentAsString(result) should include("bino1")
   }
}
