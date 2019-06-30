package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalAudience extends OntologyDef(
        iri = "http://schema.org/MedicalAudience",
        iris = Set("http://schema.org/MedicalAudience"),
        label = "MedicalAudience",
        comment = """Target audiences for medical web pages. Enumerated type.""",
        `@extends` = () => List(MedicalEnumeration.ontology, Audience.ontology, PeopleAudience.ontology)
       ){
}