package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object awayTeam extends PropertyDef(
        iri = "http://schema.org/awayTeam",
        iris = Set("http://schema.org/awayTeam"),
        label = "awayTeam",
        comment = """The away team in a sports event.""",
        `@extends` = List(competitor.property),
        `@range` = List(Person.ontology, SportsTeam.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.competitor.Properties
}