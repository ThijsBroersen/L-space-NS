package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object season
    extends PropertyDef(
      iri = "http://schema.org/season",
      iris = Set("http://schema.org/season"),
      label = "season",
      comment = """A season in a media series.""",
      `@extends` = () => List(hasPart.property),
      `@range` = () => List(CreativeWorkSeason.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.hasPart.Properties
}
