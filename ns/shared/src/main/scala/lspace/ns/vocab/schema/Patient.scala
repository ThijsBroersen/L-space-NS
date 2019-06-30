package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Patient extends OntologyDef(
        iri = "http://schema.org/Patient",
        iris = Set("http://schema.org/Patient"),
        label = "Patient",
        comment = """A patient is any person recipient of health care services.""",
        `@extends` = () => List(Person.ontology, MedicalAudience.ontology)
       ){
}