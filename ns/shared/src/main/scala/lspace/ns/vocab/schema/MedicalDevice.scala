package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalDevice extends OntologyDef(
        iri = "http://schema.org/MedicalDevice",
        iris = Set("http://schema.org/MedicalDevice"),
        label = "MedicalDevice",
        comment = """Any object used in a medical capacity, such as to diagnose or treat a patient.""",
        `@extends` = () => List(MedicalEntity.ontology)
       ){
}