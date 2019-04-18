package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object FoodEvent
    extends OntologyDef(
      iri = "http://schema.org/FoodEvent",
      iris = Set("http://schema.org/FoodEvent"),
      label = "FoodEvent",
      comment = """Event type: Food event.""",
      `@extends` = () => List(Event.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Event.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Event.Properties {}
}
