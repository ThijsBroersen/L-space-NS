package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object SaleEvent
    extends OntologyDef(
      iri = "http://schema.org/SaleEvent",
      iris = Set("http://schema.org/SaleEvent"),
      label = "SaleEvent",
      comment = """Event type: Sales event.""",
      `@extends` = () => List(Event.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Event.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Event.Properties {}
}
