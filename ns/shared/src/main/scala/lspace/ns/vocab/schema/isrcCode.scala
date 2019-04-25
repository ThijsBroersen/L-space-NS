package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object isrcCode
    extends PropertyDef(
      iri = "http://schema.org/isrcCode",
      iris = Set("http://schema.org/isrcCode"),
      label = "isrcCode",
      comment = """The International Standard Recording Code for the recording.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
