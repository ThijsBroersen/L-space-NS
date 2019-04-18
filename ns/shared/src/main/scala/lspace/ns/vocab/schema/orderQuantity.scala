package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object orderQuantity extends PropertyDef(
        iri = "http://schema.org/orderQuantity",
        iris = Set("http://schema.org/orderQuantity"),
        label = "orderQuantity",
        comment = """The number of the item ordered. If the property is not set, assume the quantity is one.""",
        `@extends` = () => List(),
        `@range` = () => List(Number.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}