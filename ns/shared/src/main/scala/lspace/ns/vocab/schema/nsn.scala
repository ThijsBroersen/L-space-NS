package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object nsn extends PropertyDef(
        iri = "http://schema.org/nsn",
        iris = Set("http://schema.org/nsn"),
        label = "nsn",
        comment = """Indicates the <a href="https://en.wikipedia.org/wiki/NATO_Stock_Number">NATO stock number</a> (nsn) of a <a class="localLink" href="http://schema.org/Product">Product</a>.""",
        `@extends` = List(identifier.property),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.identifier.Properties
}