package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SportsEvent extends OntologyDef(
        iri = "http://schema.org/SportsEvent",
        iris = Set("http://schema.org/SportsEvent"),
        label = "SportsEvent",
        comment = """Event type: Sports event.""",
        `@extends` = List(Event.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Event.Properties{
lazy val awayTeam = lspace.ns.vocab.schema.awayTeam.property
lazy val competitor = lspace.ns.vocab.schema.competitor.property
lazy val homeTeam = lspace.ns.vocab.schema.homeTeam.property
}
override lazy val properties: List[LProperty] = List(awayTeam, competitor, homeTeam)
trait Properties extends lspace.ns.vocab.schema.Event.Properties{
lazy val awayTeam = lspace.ns.vocab.schema.awayTeam.property
lazy val competitor = lspace.ns.vocab.schema.competitor.property
lazy val homeTeam = lspace.ns.vocab.schema.homeTeam.property
}
}