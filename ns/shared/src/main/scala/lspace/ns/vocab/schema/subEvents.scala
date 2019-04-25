package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object subEvents
    extends PropertyDef(
      iri = "http://schema.org/subEvents",
      iris = Set("http://schema.org/subEvents"),
      label = "subEvents",
      comment =
        """Events that are a part of this event. For example, a conference event includes many presentations, each subEvents of the conference.""",
      `@extends` = () => List(),
      `@range` = () => List(Event.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
