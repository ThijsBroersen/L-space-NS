package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SportsActivityLocation extends OntologyDef(
        iri = "http://schema.org/SportsActivityLocation",
        iris = Set("http://schema.org/SportsActivityLocation"),
        label = "SportsActivityLocation",
        comment = """A sports location, such as a playing field.""",
        `@extends` = () => List(LocalBusiness.ontology)
       ){
}