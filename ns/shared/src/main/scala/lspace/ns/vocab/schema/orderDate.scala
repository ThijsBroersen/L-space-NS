package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object orderDate extends PropertyDef(
        iri = "http://schema.org/orderDate",
        iris = Set("http://schema.org/orderDate"),
        label = "orderDate",
        comment = """Date order was placed.""",
        `@extends` = () => List(),
        `@range` = () => List(`@datetime`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}