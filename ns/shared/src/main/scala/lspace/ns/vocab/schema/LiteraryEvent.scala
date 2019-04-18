package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object LiteraryEvent
    extends OntologyDef(
      iri = "http://schema.org/LiteraryEvent",
      iris = Set("http://schema.org/LiteraryEvent"),
      label = "LiteraryEvent",
      comment = """Event type: Literary event.""",
      `@extends` = () => List(Event.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Event.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Event.Properties {}
}
