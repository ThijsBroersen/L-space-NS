package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object IndividualProduct
    extends OntologyDef(
      iri = "http://schema.org/IndividualProduct",
      iris = Set("http://schema.org/IndividualProduct"),
      label = "IndividualProduct",
      comment = """A single, identifiable product instance (e.g. a laptop with a particular serial number).""",
      `@extends` = () => List(Product.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Product.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.Product.Properties {}
}
