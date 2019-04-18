package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object PayAction
    extends OntologyDef(
      iri = "http://schema.org/PayAction",
      iris = Set("http://schema.org/PayAction"),
      label = "PayAction",
      comment = """An agent pays a price to a participant.""",
      `@extends` = () => List(TradeAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.TradeAction.Properties {
    lazy val purpose   = lspace.ns.vocab.schema.purpose.property
    lazy val recipient = lspace.ns.vocab.schema.recipient.property
  }
  override lazy val properties: List[Property] = List(purpose, recipient)
  trait Properties extends lspace.ns.vocab.schema.TradeAction.Properties {
    lazy val purpose   = lspace.ns.vocab.schema.purpose.property
    lazy val recipient = lspace.ns.vocab.schema.recipient.property
  }
}
