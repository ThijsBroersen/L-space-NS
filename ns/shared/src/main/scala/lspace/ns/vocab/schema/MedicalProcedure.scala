package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalProcedure extends OntologyDef(
        iri = "http://schema.org/MedicalProcedure",
        iris = Set("http://schema.org/MedicalProcedure"),
        label = "MedicalProcedure",
        comment = """A process of care used in either a diagnostic, therapeutic, preventive or palliative capacity that relies on invasive (surgical), non-invasive, or other techniques.""",
        `@extends` = List(MedicalEntity.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalEntity.Properties{
lazy val bodyLocation = lspace.ns.vocab.schema.bodyLocation.property
lazy val followup = lspace.ns.vocab.schema.followup.property
lazy val howPerformed = lspace.ns.vocab.schema.howPerformed.property
lazy val indication = lspace.ns.vocab.schema.indication.property
lazy val outcome = lspace.ns.vocab.schema.outcome.property
lazy val preparation = lspace.ns.vocab.schema.preparation.property
lazy val procedureType = lspace.ns.vocab.schema.procedureType.property
lazy val status = lspace.ns.vocab.schema.status.property
}
override lazy val properties: List[LProperty] = List(bodyLocation, followup, howPerformed, indication, outcome, preparation, procedureType, status)
trait Properties extends lspace.ns.vocab.schema.MedicalEntity.Properties{
lazy val bodyLocation = lspace.ns.vocab.schema.bodyLocation.property
lazy val followup = lspace.ns.vocab.schema.followup.property
lazy val howPerformed = lspace.ns.vocab.schema.howPerformed.property
lazy val indication = lspace.ns.vocab.schema.indication.property
lazy val outcome = lspace.ns.vocab.schema.outcome.property
lazy val preparation = lspace.ns.vocab.schema.preparation.property
lazy val procedureType = lspace.ns.vocab.schema.procedureType.property
lazy val status = lspace.ns.vocab.schema.status.property
}
}