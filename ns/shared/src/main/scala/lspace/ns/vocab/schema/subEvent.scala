package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object subEvent
    extends PropertyDef(
      iri = "http://schema.org/subEvent",
      iris = Set("http://schema.org/subEvent"),
      label = "subEvent",
      comment =
        """An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.""",
      `@extends` = () => List(),
      `@range` = () => List(Event.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
