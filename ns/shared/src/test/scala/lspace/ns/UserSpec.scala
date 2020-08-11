package lspace.ns

import lspace.client.User
import lspace.NS
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class UserSpec extends AnyWordSpec with Matchers {
  "A User" should {
    "have a `lspace:name` property" in {
      User.keys.`lspace:name`.iri shouldBe NS.vocab.Lspace + "name"
      new User.Properties {}.`lspace:name` shouldBe User.keys.`lspace:name`.property
    }
  }
}
