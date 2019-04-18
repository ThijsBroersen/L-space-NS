package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object VisualArtsEvent
    extends OntologyDef(
      iri = "http://schema.org/VisualArtsEvent",
      iris = Set("http://schema.org/VisualArtsEvent"),
      label = "VisualArtsEvent",
      comment = """Event type: Visual arts event.""",
      `@extends` = () => List(Event.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Event.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Event.Properties {}
}
