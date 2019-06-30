package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalProcedure extends OntologyDef(
        iri = "http://schema.org/MedicalProcedure",
        iris = Set("http://schema.org/MedicalProcedure"),
        label = "MedicalProcedure",
        comment = """A process of care used in either a diagnostic, therapeutic, preventive or palliative capacity that relies on invasive (surgical), non-invasive, or other techniques.""",
        `@extends` = () => List(MedicalEntity.ontology)
       ){
}