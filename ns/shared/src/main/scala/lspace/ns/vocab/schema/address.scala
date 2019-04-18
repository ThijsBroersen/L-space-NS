package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object address
    extends PropertyDef(
      iri = "http://schema.org/address",
      iris = Set("http://schema.org/address"),
      label = "address",
      comment = """Physical address of the item.""",
      `@extends` = () => List(),
      `@range` = () => List(PostalAddress.ontology, Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
