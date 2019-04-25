package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object itemShipped
    extends PropertyDef(
      iri = "http://schema.org/itemShipped",
      iris = Set("http://schema.org/itemShipped"),
      label = "itemShipped",
      comment = """Item(s) being shipped.""",
      `@extends` = () => List(),
      `@range` = () => List(Product.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
