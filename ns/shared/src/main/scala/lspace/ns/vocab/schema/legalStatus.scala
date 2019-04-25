package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object legalStatus
    extends PropertyDef(
      iri = "http://schema.org/legalStatus",
      iris = Set("http://schema.org/legalStatus"),
      label = "legalStatus",
      comment = """The drug or supplement's legal status, including any controlled substance schedules that apply.""",
      `@extends` = () => List(),
      `@range` = () => List(DrugLegalStatus.ontology, MedicalEnumeration.ontology, Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
