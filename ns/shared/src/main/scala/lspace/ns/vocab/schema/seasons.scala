package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object seasons
    extends PropertyDef(
      iri = "http://schema.org/seasons",
      iris = Set("http://schema.org/seasons"),
      label = "seasons",
      comment = """A season in a media series.""",
      `@extends` = () => List(),
      `@range` = () => List(CreativeWorkSeason.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
