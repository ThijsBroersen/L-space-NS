package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object OrderItem extends OntologyDef(
        iri = "http://schema.org/OrderItem",
        iris = Set("http://schema.org/OrderItem"),
        label = "OrderItem",
        comment = """An order item is a line of an order. It includes the quantity and shipping details of a bought offer.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}