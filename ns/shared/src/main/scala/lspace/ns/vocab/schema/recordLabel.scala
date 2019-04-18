package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object recordLabel
    extends PropertyDef(
      iri = "http://schema.org/recordLabel",
      iris = Set("http://schema.org/recordLabel"),
      label = "recordLabel",
      comment = """The label that issued the release.""",
      `@extends` = () => List(),
      `@range` = () => List(Organization.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
