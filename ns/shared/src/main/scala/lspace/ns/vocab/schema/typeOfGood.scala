package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object typeOfGood
    extends PropertyDef(
      iri = "http://schema.org/typeOfGood",
      iris = Set("http://schema.org/typeOfGood"),
      label = "typeOfGood",
      comment = """The product that this structured value is referring to.""",
      `@extends` = () => List(),
      `@range` = () => List(Service.ontology, Product.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
