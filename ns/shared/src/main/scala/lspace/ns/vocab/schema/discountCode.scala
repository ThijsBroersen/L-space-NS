package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object discountCode extends PropertyDef(
        iri = "http://schema.org/discountCode",
        iris = Set("http://schema.org/discountCode"),
        label = "discountCode",
        comment = """Code used to redeem a discount.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}