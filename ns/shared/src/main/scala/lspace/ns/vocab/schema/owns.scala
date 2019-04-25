package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object owns
    extends PropertyDef(
      iri = "http://schema.org/owns",
      iris = Set("http://schema.org/owns"),
      label = "owns",
      comment = """Products owned by the organization or person.""",
      `@extends` = () => List(),
      `@range` = () => List(Product.ontology, OwnershipInfo.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
