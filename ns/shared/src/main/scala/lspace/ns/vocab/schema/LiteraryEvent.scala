package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LiteraryEvent
    extends OntologyDef(
      iri = "http://schema.org/LiteraryEvent",
      iris = Set("http://schema.org/LiteraryEvent"),
      label = "LiteraryEvent",
      comment = """Event type: Literary event.""",
      `@extends` = () => List(Event.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Event.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.Event.Properties {}
}
