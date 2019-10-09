package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SportsTeam extends OntologyDef(
        iri = "http://schema.org/SportsTeam",
        iris = Set("http://schema.org/SportsTeam"),
        label = "SportsTeam",
        comment = """Organization: Sports team.""",
        `@extends` = List(SportsOrganization.ontology)
       ){
object keys extends lspace.ns.vocab.schema.SportsOrganization.Properties{
lazy val athlete = lspace.ns.vocab.schema.athlete.property
lazy val coach = lspace.ns.vocab.schema.coach.property
}
override lazy val properties: List[LProperty] = List(athlete, coach)
trait Properties extends lspace.ns.vocab.schema.SportsOrganization.Properties{
lazy val athlete = lspace.ns.vocab.schema.athlete.property
lazy val coach = lspace.ns.vocab.schema.coach.property
}
}