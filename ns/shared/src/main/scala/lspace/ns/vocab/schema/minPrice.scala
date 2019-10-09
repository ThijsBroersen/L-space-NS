package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object minPrice extends PropertyDef(
        iri = "http://schema.org/minPrice",
        iris = Set("http://schema.org/minPrice"),
        label = "minPrice",
        comment = """The lowest price if the price is a range.""",
        `@extends` = List(),
        `@range` = List(`@number`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}