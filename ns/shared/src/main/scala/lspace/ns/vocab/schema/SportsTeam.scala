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
object keys extends lspace.ns.vocab.schema.SportsOrganization.Properties{
lazy val coach = lspace.ns.vocab.schema.coach.property
lazy val athlete = lspace.ns.vocab.schema.athlete.property
}
override lazy val properties: List[LProperty] = List(coach, athlete)
trait Properties extends lspace.ns.vocab.schema.SportsOrganization.Properties{
lazy val coach = lspace.ns.vocab.schema.coach.property
lazy val athlete = lspace.ns.vocab.schema.athlete.property
}
}