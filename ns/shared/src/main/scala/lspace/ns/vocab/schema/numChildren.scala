package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object numChildren
    extends PropertyDef(
      iri = "http://schema.org/numChildren",
      iris = Set("http://schema.org/numChildren"),
      label = "numChildren",
      comment = """The number of children staying in the unit.""",
      `@extends` = () => List(),
      `@range` = () => List(QuantitativeValue.ontology, Integer.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
