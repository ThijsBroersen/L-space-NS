package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object isGift extends PropertyDef(
        iri = "http://schema.org/isGift",
        iris = Set("http://schema.org/isGift"),
        label = "isGift",
        comment = """Was the offer accepted as a gift for someone other than the buyer.""",
        `@extends` = () => List(),
        `@range` = () => List(`@boolean`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}