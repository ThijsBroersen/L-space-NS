package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object RecyclingCenter extends OntologyDef(
        iri = "http://schema.org/RecyclingCenter",
        iris = Set("http://schema.org/RecyclingCenter"),
        label = "RecyclingCenter",
        comment = """A recycling center.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}