package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object amount
    extends PropertyDef(
      iri = "http://schema.org/amount",
      iris = Set("http://schema.org/amount"),
      label = "amount",
      comment = """The amount of money.""",
      `@extends` = () => List(),
      `@range` = () => List(MonetaryAmount.ontology, Number.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
