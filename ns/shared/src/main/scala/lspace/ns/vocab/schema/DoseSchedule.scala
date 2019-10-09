package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DoseSchedule extends OntologyDef(
        iri = "http://schema.org/DoseSchedule",
        iris = Set("http://schema.org/DoseSchedule"),
        label = "DoseSchedule",
        comment = """A specific dosing schedule for a drug or supplement.""",
        `@extends` = List(MedicalIntangible.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalIntangible.Properties{
lazy val doseUnit = lspace.ns.vocab.schema.doseUnit.property
lazy val doseValue = lspace.ns.vocab.schema.doseValue.property
lazy val frequency = lspace.ns.vocab.schema.frequency.property
lazy val targetPopulation = lspace.ns.vocab.schema.targetPopulation.property
}
override lazy val properties: List[LProperty] = List(doseUnit, doseValue, frequency, targetPopulation)
trait Properties extends lspace.ns.vocab.schema.MedicalIntangible.Properties{
lazy val doseUnit = lspace.ns.vocab.schema.doseUnit.property
lazy val doseValue = lspace.ns.vocab.schema.doseValue.property
lazy val frequency = lspace.ns.vocab.schema.frequency.property
lazy val targetPopulation = lspace.ns.vocab.schema.targetPopulation.property
}
}