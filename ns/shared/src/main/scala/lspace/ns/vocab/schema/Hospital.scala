package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Hospital extends OntologyDef(
        iri = "http://schema.org/Hospital",
        iris = Set("http://schema.org/Hospital"),
        label = "Hospital",
        comment = """A hospital.""",
        `@extends` = () => List(MedicalOrganization.ontology, CivicStructure.ontology, EmergencyService.ontology)
       ){
}