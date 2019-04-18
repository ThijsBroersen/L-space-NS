package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object category extends PropertyDef(
        iri = "http://schema.org/category",
        iris = Set("http://schema.org/category"),
        label = "category",
        comment = """A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}