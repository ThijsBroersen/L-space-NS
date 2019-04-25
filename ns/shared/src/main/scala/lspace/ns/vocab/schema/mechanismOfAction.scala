package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object mechanismOfAction
    extends PropertyDef(
      iri = "http://schema.org/mechanismOfAction",
      iris = Set("http://schema.org/mechanismOfAction"),
      label = "mechanismOfAction",
      comment =
        """The specific biochemical interaction through which this drug or supplement produces its pharmacological effect.""",
      `@extends` = () => List(),
      `@range` = () => List(Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
