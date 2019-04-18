package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object relatedAnatomy
    extends PropertyDef(
      iri = "http://schema.org/relatedAnatomy",
      iris = Set("http://schema.org/relatedAnatomy"),
      label = "relatedAnatomy",
      comment = """Anatomical systems or structures that relate to the superficial anatomy.""",
      `@extends` = () => List(),
      `@range` = () => List(AnatomicalStructure.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
