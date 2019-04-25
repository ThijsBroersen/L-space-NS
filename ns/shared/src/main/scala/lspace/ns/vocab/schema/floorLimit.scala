package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object floorLimit
    extends PropertyDef(
      iri = "http://schema.org/floorLimit",
      iris = Set("http://schema.org/floorLimit"),
      label = "floorLimit",
      comment = """A floor limit is the amount of money above which credit card transactions must be authorized.""",
      `@extends` = () => List(),
      `@range` = () => List(MonetaryAmount.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
