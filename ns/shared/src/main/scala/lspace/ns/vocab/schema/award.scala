package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object award
    extends PropertyDef(
      iri = "http://schema.org/award",
      iris = Set("http://schema.org/award"),
      label = "award",
      comment = """An award won by or for this item.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
