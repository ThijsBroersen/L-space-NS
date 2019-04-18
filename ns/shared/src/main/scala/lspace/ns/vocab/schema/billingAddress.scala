package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object billingAddress
    extends PropertyDef(
      iri = "http://schema.org/billingAddress",
      iris = Set("http://schema.org/billingAddress"),
      label = "billingAddress",
      comment = """The billing address for the order.""",
      `@extends` = () => List(),
      `@range` = () => List(PostalAddress.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
