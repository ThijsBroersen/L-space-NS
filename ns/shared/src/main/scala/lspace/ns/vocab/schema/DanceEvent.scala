package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DanceEvent
    extends OntologyDef(
      iri = "http://schema.org/DanceEvent",
      iris = Set("http://schema.org/DanceEvent"),
      label = "DanceEvent",
      comment = """Event type: A social dance.""",
      `@extends` = () => List(Event.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Event.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.Event.Properties {}
}
