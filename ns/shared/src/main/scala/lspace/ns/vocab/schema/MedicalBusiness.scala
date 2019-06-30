package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MedicalBusiness extends OntologyDef(
        iri = "http://schema.org/MedicalBusiness",
        iris = Set("http://schema.org/MedicalBusiness"),
        label = "MedicalBusiness",
        comment = """A particular physical or virtual business of an organization for medical purposes. Examples of MedicalBusiness include differents business run by health professionals.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}