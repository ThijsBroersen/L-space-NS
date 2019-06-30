package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Optician extends OntologyDef(
        iri = "http://schema.org/Optician",
        iris = Set("http://schema.org/Optician"),
        label = "Optician",
        comment = """A store that sells reading glasses and similar devices for improving vision.""",
        `@extends` = () => List(MedicalBusiness.ontology)
       ){
}