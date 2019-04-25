package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object seatingType
    extends PropertyDef(
      iri = "http://schema.org/seatingType",
      iris = Set("http://schema.org/seatingType"),
      label = "seatingType",
      comment = """The type/class of the seat.""",
      `@extends` = () => List(),
      `@range` = () => List(QualitativeValue.ontology, Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
