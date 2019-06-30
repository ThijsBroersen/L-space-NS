package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TennisComplex extends OntologyDef(
        iri = "http://schema.org/TennisComplex",
        iris = Set("http://schema.org/TennisComplex"),
        label = "TennisComplex",
        comment = """A tennis complex.""",
        `@extends` = () => List(SportsActivityLocation.ontology)
       ){
}