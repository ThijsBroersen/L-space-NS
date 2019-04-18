package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object deliveryAddress
    extends PropertyDef(
      iri = "http://schema.org/deliveryAddress",
      iris = Set("http://schema.org/deliveryAddress"),
      label = "deliveryAddress",
      comment = """Destination address.""",
      `@extends` = () => List(),
      `@range` = () => List(PostalAddress.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
