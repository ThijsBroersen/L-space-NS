package lspace.ns

import lspace.NS
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class DirectorySpec extends AnyWordSpec with Matchers {
  "A Directory" should {
    "have a `lspace:name` property" in {
      Directory.keys.`lspace:name`.iri shouldBe NS.vocab.Lspace + "name"
      new Directory.Properties {}.`lspace:name` shouldBe Directory.keys.`lspace:name`.property
    }
  }
}
