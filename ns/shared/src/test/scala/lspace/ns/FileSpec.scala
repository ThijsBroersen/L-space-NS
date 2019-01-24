package lspace.ns

import lspace.NS.vocab
import org.scalatest.{Matchers, WordSpec}

class FileSpec extends WordSpec with Matchers {
  "A File" should {
    "have a `lspace:name` property" in {
      File.keys.`lspace:name`.iri shouldBe vocab.Lspace + "name"
      new File.Properties {}.`lspace:name` shouldBe File.keys.`lspace:name`.property
    }
  }
}
