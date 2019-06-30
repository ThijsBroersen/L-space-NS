package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SportsTeam extends OntologyDef(
        iri = "http://schema.org/SportsTeam",
        iris = Set("http://schema.org/SportsTeam"),
        label = "SportsTeam",
        comment = """Organization: Sports team.""",
        `@extends` = () => List(SportsOrganization.ontology)
       ){
}