package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object SportsEvent
    extends OntologyDef(
      iri = "http://schema.org/SportsEvent",
      iris = Set("http://schema.org/SportsEvent"),
      label = "SportsEvent",
      comment = """Event type: Sports event.""",
      `@extends` = () => List(Event.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Event.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Event.Properties {}
}
