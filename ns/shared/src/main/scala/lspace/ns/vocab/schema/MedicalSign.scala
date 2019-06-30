package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalSign extends OntologyDef(
        iri = "http://schema.org/MedicalSign",
        iris = Set("http://schema.org/MedicalSign"),
        label = "MedicalSign",
        comment = """Any physical manifestation of a person's medical condition discoverable by objective diagnostic tests or physical examination.""",
        `@extends` = () => List(MedicalSignOrSymptom.ontology)
       ){
}