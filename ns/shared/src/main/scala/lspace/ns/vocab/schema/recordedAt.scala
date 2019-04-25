package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object recordedAt
    extends PropertyDef(
      iri = "http://schema.org/recordedAt",
      iris = Set("http://schema.org/recordedAt"),
      label = "recordedAt",
      comment =
        """The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.""",
      `@extends` = () => List(),
      `@range` = () => List(Event.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
