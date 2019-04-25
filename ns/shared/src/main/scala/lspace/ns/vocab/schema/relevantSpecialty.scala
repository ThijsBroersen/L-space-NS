package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object relevantSpecialty
    extends PropertyDef(
      iri = "http://schema.org/relevantSpecialty",
      iris = Set("http://schema.org/relevantSpecialty"),
      label = "relevantSpecialty",
      comment = """If applicable, a medical specialty in which this entity is relevant.""",
      `@extends` = () => List(),
      `@range` = () => List(MedicalSpecialty.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
