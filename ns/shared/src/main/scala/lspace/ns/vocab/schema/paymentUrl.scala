package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object paymentUrl
    extends PropertyDef(
      iri = "http://schema.org/paymentUrl",
      iris = Set("http://schema.org/paymentUrl"),
      label = "paymentUrl",
      comment = """The URL for sending a payment.""",
      `@extends` = () => List(),
      `@range` = () => List(URL.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
