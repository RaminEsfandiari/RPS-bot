import controllers.ApplicationController
import org.scalatestplus.play.PlaySpec
import play.api.mvc.Result
import play.api.test.FakeRequest
import play.api.test.Helpers._

import scala.concurrent.Future

class ApplicationControllerSpec extends PlaySpec{

  object TestApplicationController extends ApplicationController{

  }

  "ApplicationController" must {

    "load front page successfully" in {
      val result: Future[Result] = TestApplicationController.get().apply(FakeRequest())
      contentAsString(result) must include("bino1")
    }

  }

}
