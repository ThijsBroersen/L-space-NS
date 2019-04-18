package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object discount
    extends PropertyDef(
      iri = "http://schema.org/discount",
      iris = Set("http://schema.org/discount"),
      label = "discount",
      comment = """Any discount applied (to an Order).""",
      `@extends` = () => List(),
      `@range` = () => List(Number.ontology, Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
