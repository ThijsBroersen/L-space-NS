package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object costCurrency
    extends PropertyDef(
      iri = "http://schema.org/costCurrency",
      iris = Set("http://schema.org/costCurrency"),
      label = "costCurrency",
      comment = """The currency (in 3-letter of the drug cost. See: http://en.wikipedia.org/wiki/ISO_4217""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
