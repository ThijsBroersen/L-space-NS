package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object eligibleDuration
    extends PropertyDef(
      iri = "http://schema.org/eligibleDuration",
      iris = Set("http://schema.org/eligibleDuration"),
      label = "eligibleDuration",
      comment = """The duration for which the given offer is valid.""",
      `@extends` = () => List(),
      `@range` = () => List(QuantitativeValue.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
