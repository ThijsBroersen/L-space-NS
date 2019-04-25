package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object renegotiableLoan
    extends PropertyDef(
      iri = "http://schema.org/renegotiableLoan",
      iris = Set("http://schema.org/renegotiableLoan"),
      label = "renegotiableLoan",
      comment = """Whether the terms for payment of interest can be renegotiated during the life of the loan.""",
      `@extends` = () => List(),
      `@range` = () => List(`@boolean`)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
