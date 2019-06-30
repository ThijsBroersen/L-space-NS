package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Residence extends OntologyDef(
        iri = "http://schema.org/Residence",
        iris = Set("http://schema.org/Residence"),
        label = "Residence",
        comment = """The place where a person lives.""",
        `@extends` = () => List(Place.ontology)
       ){
}