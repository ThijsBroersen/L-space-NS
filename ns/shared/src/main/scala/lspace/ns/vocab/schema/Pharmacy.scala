package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Pharmacy extends OntologyDef(
        iri = "http://schema.org/Pharmacy",
        iris = Set("http://schema.org/Pharmacy"),
        label = "Pharmacy",
        comment = """A pharmacy or drugstore.""",
        `@extends` = () => List(MedicalBusiness.ontology, MedicalOrganization.ontology)
       ){
}