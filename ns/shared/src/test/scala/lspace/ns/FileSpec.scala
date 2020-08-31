package lspace.ns

import lspace.NS
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class FileSpec extends AnyWordSpec with Matchers {
  "A File" should {
    "have a `lspace:name` property" in {
      File.keys.`lspace:name`.iri shouldBe NS.vocab.Lspace + "name"
      new File.Properties {}.`lspace:name` shouldBe File.keys.`lspace:name`.property
    }
  }
}
