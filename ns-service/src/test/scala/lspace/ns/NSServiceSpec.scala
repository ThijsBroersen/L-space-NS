package lspace.ns

import com.twitter.finagle.http.Status
import io.finch.Input
import org.scalatest.{AsyncWordSpec, BeforeAndAfterAll, Matchers}

class NSServiceSpec extends AsyncWordSpec with Matchers with BeforeAndAfterAll {

  println(NSService.nsService.api.toString)

  import util._
  "The nsService" can {
    "return namespace-resources in applicication/ld+json" in {
      val input = Input
        .get("/File/ext")
        .withHeaders("Accept" -> "application/ld+json")
      val res = NSService.api(input.request)

      res.map { response =>
        val headers = response.headerMap

        response.status shouldBe Status.Ok
        response.contentType shouldBe Some("application/ld+json")
      }
    }
    "return 'application/ld+json' for unsupported Accept-header" in {
      val input = Input
        .get("/File/ext")
        .withHeaders("Accept" -> "weird/type")
      val res = NSService.api(input.request)

      res.map { response =>
        response.status shouldBe Status.Ok
        response.contentType shouldBe Some("application/ld+json")
      }
    }
  }
}
