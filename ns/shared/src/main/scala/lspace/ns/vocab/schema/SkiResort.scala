package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SkiResort extends OntologyDef(
        iri = "http://schema.org/SkiResort",
        iris = Set("http://schema.org/SkiResort"),
        label = "SkiResort",
        comment = """A ski resort.""",
        `@extends` = () => List(SportsActivityLocation.ontology)
       ){
}