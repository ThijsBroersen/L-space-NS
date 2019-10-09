package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object isSimilarTo extends PropertyDef(
        iri = "http://schema.org/isSimilarTo",
        iris = Set("http://schema.org/isSimilarTo"),
        label = "isSimilarTo",
        comment = """A pointer to another, functionally similar product (or multiple products).""",
        `@extends` = List(),
        `@range` = List(Service.ontology, Product.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}