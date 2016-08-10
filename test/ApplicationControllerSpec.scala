import controllers.ApplicationController
import org.scalatestplus.play.{OneServerPerSuite, PlaySpec}
import play.api.i18n.{MessagesApi, Messages}
import play.api.i18n.Messages.Implicits._
import play.api.mvc.Result
import play.api.test.FakeRequest
import play.api.test.Helpers._
import scala.concurrent.Future

class ApplicationControllerSpec extends PlaySpec with OneServerPerSuite{

  val applicationController = new ApplicationController(app.injector.instanceOf[MessagesApi])

  "ApplicationController" must {

    "load front page successfully" in {
      val result: Future[Result] = applicationController.get().apply(FakeRequest())
      contentAsString(result) must include(Messages("home.title"))
    }

  }

}
