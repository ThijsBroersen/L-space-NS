package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object PreOrderAction
    extends OntologyDef(
      iri = "http://schema.org/PreOrderAction",
      iris = Set("http://schema.org/PreOrderAction"),
      label = "PreOrderAction",
      comment = """An agent orders a (not yet released) object/product/service to be delivered/sent.""",
      `@extends` = () => List(TradeAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.TradeAction.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.TradeAction.Properties {}
}
