import controllers.ApplicationController
import org.scalatestplus.play.{OneServerPerSuite, PlaySpec}
import play.api.i18n.Messages
import play.api.i18n.Messages.Implicits._
import play.api.mvc.Result
import play.api.test.FakeRequest
import play.api.test.Helpers._

import scala.concurrent.Future

class ApplicationControllerSpec extends PlaySpec with OneServerPerSuite{

  object testApplicationController extends ApplicationController{

  }

  "ApplicationController" must {

    "load front page successfully" in {
      val result: Future[Result] = testApplicationController.get().apply(FakeRequest())
      contentAsString(result) must include(Messages("home.title"))
    }

    "contain sign in form" in {
      val result: Future[Result] = testApplicationController.get().apply(FakeRequest())
      contentAsString(result) must include(Messages("home.username"))
      contentAsString(result) must include(Messages("home.password"))
    }

  }

}
