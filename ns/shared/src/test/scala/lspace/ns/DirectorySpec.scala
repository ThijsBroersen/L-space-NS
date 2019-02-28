package lspace.ns

import lspace.NS
import org.scalatest.{Matchers, WordSpec}

class DirectorySpec extends WordSpec with Matchers {
  "A Directory" should {
    "have a `lspace:name` property" in {
      Directory.keys.`lspace:name`.iri shouldBe NS.vocab.Lspace + "name"
      new Directory.Properties {}.`lspace:name` shouldBe Directory.keys.`lspace:name`.property
    }
  }
}
