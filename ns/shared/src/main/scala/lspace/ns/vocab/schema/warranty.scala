package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object warranty
    extends PropertyDef(
      iri = "http://schema.org/warranty",
      iris = Set("http://schema.org/warranty"),
      label = "warranty",
      comment = """The warranty promise(s) included in the offer.""",
      `@extends` = () => List(),
      `@range` = () => List(WarrantyPromise.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
