package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object orderItemNumber extends PropertyDef(
        iri = "http://schema.org/orderItemNumber",
        iris = Set("http://schema.org/orderItemNumber"),
        label = "orderItemNumber",
        comment = """The identifier of the order item.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}