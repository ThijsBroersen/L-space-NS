package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SportsClub extends OntologyDef(
        iri = "http://schema.org/SportsClub",
        iris = Set("http://schema.org/SportsClub"),
        label = "SportsClub",
        comment = """A sports club.""",
        `@extends` = () => List(SportsActivityLocation.ontology)
       ){
}