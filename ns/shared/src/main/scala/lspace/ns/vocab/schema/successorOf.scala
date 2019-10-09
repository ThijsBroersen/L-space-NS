package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object successorOf extends PropertyDef(
        iri = "http://schema.org/successorOf",
        iris = Set("http://schema.org/successorOf"),
        label = "successorOf",
        comment = """A pointer from a newer variant of a product  to its previous, often discontinued predecessor.""",
        `@extends` = List(),
        `@range` = List(ProductModel.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}