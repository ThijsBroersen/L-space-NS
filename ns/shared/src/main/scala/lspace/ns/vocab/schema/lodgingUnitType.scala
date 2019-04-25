package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object lodgingUnitType
    extends PropertyDef(
      iri = "http://schema.org/lodgingUnitType",
      iris = Set("http://schema.org/lodgingUnitType"),
      label = "lodgingUnitType",
      comment = """Textual description of the unit type (including suite vs. room, size of bed, etc.).""",
      `@extends` = () => List(),
      `@range` = () => List(QualitativeValue.ontology, Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
