package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MedicalProcedure
    extends OntologyDef(
      iri = "http://schema.org/MedicalProcedure",
      iris = Set("http://schema.org/MedicalProcedure"),
      label = "MedicalProcedure",
      comment =
        """A process of care used in either a diagnostic, therapeutic, preventive or palliative capacity that relies on invasive (surgical), non-invasive, or other techniques.""",
      `@extends` = () => List(MedicalEntity.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.MedicalEntity.Properties {
    lazy val bodyLocation  = lspace.ns.vocab.schema.bodyLocation.property
    lazy val indication    = lspace.ns.vocab.schema.indication.property
    lazy val outcome       = lspace.ns.vocab.schema.outcome.property
    lazy val followup      = lspace.ns.vocab.schema.followup.property
    lazy val status        = lspace.ns.vocab.schema.status.property
    lazy val procedureType = lspace.ns.vocab.schema.procedureType.property
    lazy val howPerformed  = lspace.ns.vocab.schema.howPerformed.property
  }
  override lazy val properties: List[Property] =
    List(bodyLocation, indication, outcome, followup, status, procedureType, howPerformed)
  trait Properties extends lspace.ns.vocab.schema.MedicalEntity.Properties {
    lazy val bodyLocation  = lspace.ns.vocab.schema.bodyLocation.property
    lazy val indication    = lspace.ns.vocab.schema.indication.property
    lazy val outcome       = lspace.ns.vocab.schema.outcome.property
    lazy val followup      = lspace.ns.vocab.schema.followup.property
    lazy val status        = lspace.ns.vocab.schema.status.property
    lazy val procedureType = lspace.ns.vocab.schema.procedureType.property
    lazy val howPerformed  = lspace.ns.vocab.schema.howPerformed.property
  }
}
