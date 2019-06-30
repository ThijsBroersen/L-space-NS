package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Dentist extends OntologyDef(
        iri = "http://schema.org/Dentist",
        iris = Set("http://schema.org/Dentist"),
        label = "Dentist",
        comment = """A dentist.""",
        `@extends` = () => List(MedicalBusiness.ontology, LocalBusiness.ontology, MedicalOrganization.ontology)
       ){
}