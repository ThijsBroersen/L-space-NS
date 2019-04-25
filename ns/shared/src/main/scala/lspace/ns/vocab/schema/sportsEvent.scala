package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object sportsEvent
    extends PropertyDef(
      iri = "http://schema.org/sportsEvent",
      iris = Set("http://schema.org/sportsEvent"),
      label = "sportsEvent",
      comment = """A sub property of location. The sports event where this action occurred.""",
      `@extends` = () => List(location.property),
      `@range` = () => List(SportsEvent.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.location.Properties
}
