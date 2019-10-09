package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object predecessorOf extends PropertyDef(
        iri = "http://schema.org/predecessorOf",
        iris = Set("http://schema.org/predecessorOf"),
        label = "predecessorOf",
        comment = """A pointer from a previous, often discontinued variant of the product to its newer variant.""",
        `@extends` = List(),
        `@range` = List(ProductModel.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}