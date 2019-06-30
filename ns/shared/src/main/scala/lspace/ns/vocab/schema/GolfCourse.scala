package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GolfCourse extends OntologyDef(
        iri = "http://schema.org/GolfCourse",
        iris = Set("http://schema.org/GolfCourse"),
        label = "GolfCourse",
        comment = """A golf course.""",
        `@extends` = () => List(SportsActivityLocation.ontology)
       ){
}