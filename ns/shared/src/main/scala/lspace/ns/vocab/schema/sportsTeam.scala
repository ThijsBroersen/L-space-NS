package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object sportsTeam extends PropertyDef(
        iri = "http://schema.org/sportsTeam",
        iris = Set("http://schema.org/sportsTeam"),
        label = "sportsTeam",
        comment = """A sub property of participant. The sports team that participated on this action.""",
        `@extends` = () => List(participant.property),
        `@range` = () => List()
       ){
}