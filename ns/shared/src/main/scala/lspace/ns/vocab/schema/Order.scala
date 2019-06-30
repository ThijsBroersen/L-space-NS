package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Order extends OntologyDef(
        iri = "http://schema.org/Order",
        iris = Set("http://schema.org/Order"),
        label = "Order",
        comment = """An order is a confirmation of a transaction (a receipt), which can contain multiple line items, each represented by an Offer that has been accepted by the customer.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}