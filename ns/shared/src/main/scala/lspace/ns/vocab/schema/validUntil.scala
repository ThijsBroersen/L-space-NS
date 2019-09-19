package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object validUntil extends PropertyDef(
        iri = "http://schema.org/validUntil",
        iris = Set("http://schema.org/validUntil"),
        label = "validUntil",
        comment = """The date when the item is no longer valid.""",
        `@extends` = () => List(),
        `@range` = () => List(`@date`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}