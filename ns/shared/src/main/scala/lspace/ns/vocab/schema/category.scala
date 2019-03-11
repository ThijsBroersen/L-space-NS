package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object category extends PropertyDef(
        iri = "https://schema.org/category",
        iris = Set("https://schema.org/category"),
        label = "category",
        comment = """A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}