package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalSignOrSymptom extends OntologyDef(
        iri = "http://schema.org/MedicalSignOrSymptom",
        iris = Set("http://schema.org/MedicalSignOrSymptom"),
        label = "MedicalSignOrSymptom",
        comment = """Any feature associated or not with a medical condition. In medicine a symptom is generally subjective while a sign is objective.""",
        `@extends` = () => List(MedicalCondition.ontology)
       ){
}