package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DrugPrescriptionStatus extends OntologyDef(
        iri = "http://schema.org/DrugPrescriptionStatus",
        iris = Set("http://schema.org/DrugPrescriptionStatus"),
        label = "DrugPrescriptionStatus",
        comment = """Indicates whether this drug is available by prescription or over-the-counter.""",
        `@extends` = () => List(MedicalEnumeration.ontology)
       ){
}