package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object isPartOf
    extends PropertyDef(
      iri = "http://schema.org/isPartOf",
      iris = Set("http://schema.org/isPartOf"),
      label = "isPartOf",
      comment = """Indicates an item or CreativeWork that this item, or CreativeWork (in some sense), is part of.""",
      `@extends` = () => List(),
      `@range` = () => List(CreativeWork.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
