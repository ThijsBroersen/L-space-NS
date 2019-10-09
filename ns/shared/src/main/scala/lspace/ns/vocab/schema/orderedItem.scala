package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object orderedItem extends PropertyDef(
        iri = "http://schema.org/orderedItem",
        iris = Set("http://schema.org/orderedItem"),
        label = "orderedItem",
        comment = """The item ordered.""",
        `@extends` = List(),
        `@range` = List(Product.ontology, OrderItem.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}