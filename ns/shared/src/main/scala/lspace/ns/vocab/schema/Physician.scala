package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Physician extends OntologyDef(
        iri = "http://schema.org/Physician",
        iris = Set("http://schema.org/Physician"),
        label = "Physician",
        comment = """A doctor's office.""",
        `@extends` = () => List(MedicalOrganization.ontology, MedicalBusiness.ontology)
       ){
}