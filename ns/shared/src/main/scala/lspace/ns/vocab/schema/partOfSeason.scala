package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object partOfSeason
    extends PropertyDef(
      iri = "http://schema.org/partOfSeason",
      iris = Set("http://schema.org/partOfSeason"),
      label = "partOfSeason",
      comment = """The season to which this episode belongs.""",
      `@extends` = () => List(isPartOf.property),
      `@range` = () => List(CreativeWorkSeason.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.isPartOf.Properties
}
