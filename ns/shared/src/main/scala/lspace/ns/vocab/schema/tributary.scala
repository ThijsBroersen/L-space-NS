package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object tributary
    extends PropertyDef(
      iri = "http://schema.org/tributary",
      iris = Set("http://schema.org/tributary"),
      label = "tributary",
      comment =
        """The anatomical or organ system that the vein flows into; a larger structure that the vein connects to.""",
      `@extends` = () => List(),
      `@range` = () => List(AnatomicalStructure.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
