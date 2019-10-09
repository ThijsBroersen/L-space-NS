package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ProductModel extends OntologyDef(
        iri = "http://schema.org/ProductModel",
        iris = Set("http://schema.org/ProductModel"),
        label = "ProductModel",
        comment = """A datasheet or vendor specification of a product (in the sense of a prototypical description).""",
        `@extends` = List(Product.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Product.Properties{
lazy val isVariantOf = lspace.ns.vocab.schema.isVariantOf.property
lazy val predecessorOf = lspace.ns.vocab.schema.predecessorOf.property
lazy val successorOf = lspace.ns.vocab.schema.successorOf.property
}
override lazy val properties: List[LProperty] = List(isVariantOf, predecessorOf, successorOf)
trait Properties extends lspace.ns.vocab.schema.Product.Properties{
lazy val isVariantOf = lspace.ns.vocab.schema.isVariantOf.property
lazy val predecessorOf = lspace.ns.vocab.schema.predecessorOf.property
lazy val successorOf = lspace.ns.vocab.schema.successorOf.property
}
}