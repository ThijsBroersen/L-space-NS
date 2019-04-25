package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object warrantyScope
    extends PropertyDef(
      iri = "http://schema.org/warrantyScope",
      iris = Set("http://schema.org/warrantyScope"),
      label = "warrantyScope",
      comment = """The scope of the warranty promise.""",
      `@extends` = () => List(),
      `@range` = () => List(WarrantyScope.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
