package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ReportedDoseSchedule
    extends OntologyDef(
      iri = "http://schema.org/ReportedDoseSchedule",
      iris = Set("http://schema.org/ReportedDoseSchedule"),
      label = "ReportedDoseSchedule",
      comment = """A patient-reported or observed dosing schedule for a drug or supplement.""",
      `@extends` = () => List(DoseSchedule.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.DoseSchedule.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.DoseSchedule.Properties {}
}
