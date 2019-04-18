package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object event
    extends PropertyDef(
      iri = "http://schema.org/event",
      iris = Set("http://schema.org/event"),
      label = "event",
      comment = """Upcoming or past event associated with this place, organization, or action.""",
      `@extends` = () => List(),
      `@range` = () => List(Event.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
