package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object ProductModel
    extends OntologyDef(
      iri = "http://schema.org/ProductModel",
      iris = Set("http://schema.org/ProductModel"),
      label = "ProductModel",
      comment = """A datasheet or vendor specification of a product (in the sense of a prototypical description).""",
      `@extends` = () => List(Product.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Product.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Product.Properties {}
}
