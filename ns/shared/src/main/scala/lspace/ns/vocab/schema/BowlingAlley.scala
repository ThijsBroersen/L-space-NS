package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BowlingAlley extends OntologyDef(
        iri = "http://schema.org/BowlingAlley",
        iris = Set("http://schema.org/BowlingAlley"),
        label = "BowlingAlley",
        comment = """A bowling alley.""",
        `@extends` = () => List(SportsActivityLocation.ontology)
       ){
}