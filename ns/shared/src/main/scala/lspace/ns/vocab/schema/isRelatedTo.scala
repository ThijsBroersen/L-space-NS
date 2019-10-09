package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object isRelatedTo extends PropertyDef(
        iri = "http://schema.org/isRelatedTo",
        iris = Set("http://schema.org/isRelatedTo"),
        label = "isRelatedTo",
        comment = """A pointer to another, somehow related product (or multiple products).""",
        `@extends` = List(),
        `@range` = List(Product.ontology, Service.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}