package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object warrantyPromise
    extends PropertyDef(
      iri = "http://schema.org/warrantyPromise",
      iris = Set("http://schema.org/warrantyPromise"),
      label = "warrantyPromise",
      comment = """The warranty promise(s) included in the offer.""",
      `@extends` = () => List(),
      `@range` = () => List(WarrantyPromise.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
