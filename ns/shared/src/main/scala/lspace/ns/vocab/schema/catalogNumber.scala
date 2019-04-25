package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object catalogNumber
    extends PropertyDef(
      iri = "http://schema.org/catalogNumber",
      iris = Set("http://schema.org/catalogNumber"),
      label = "catalogNumber",
      comment = """The catalog number for the release.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
