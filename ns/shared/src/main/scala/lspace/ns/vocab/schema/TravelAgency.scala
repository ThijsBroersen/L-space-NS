package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TravelAgency extends OntologyDef(
        iri = "http://schema.org/TravelAgency",
        iris = Set("http://schema.org/TravelAgency"),
        label = "TravelAgency",
        comment = """A travel agency.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}