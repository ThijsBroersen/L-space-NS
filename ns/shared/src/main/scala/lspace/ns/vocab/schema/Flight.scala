package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Flight extends OntologyDef(
        iri = "http://schema.org/Flight",
        iris = Set("http://schema.org/Flight"),
        label = "Flight",
        comment = """An airline flight.""",
        `@extends` = () => List(Trip.ontology)
       ){
}