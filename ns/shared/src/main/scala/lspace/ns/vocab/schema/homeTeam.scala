package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object homeTeam
    extends PropertyDef(
      iri = "http://schema.org/homeTeam",
      iris = Set("http://schema.org/homeTeam"),
      label = "homeTeam",
      comment = """The home team in a sports event.""",
      `@extends` = () => List(competitor.property),
      `@range` = () => List()
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.competitor.Properties
}
