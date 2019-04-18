package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MusicEvent
    extends OntologyDef(
      iri = "http://schema.org/MusicEvent",
      iris = Set("http://schema.org/MusicEvent"),
      label = "MusicEvent",
      comment = """Event type: Music event.""",
      `@extends` = () => List(Event.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Event.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Event.Properties {}
}
