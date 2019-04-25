package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object timeRequired
    extends PropertyDef(
      iri = "http://schema.org/timeRequired",
      iris = Set("http://schema.org/timeRequired"),
      label = "timeRequired",
      comment =
        """Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'P30M', 'P1H25M'.""",
      `@extends` = () => List(),
      `@range` = () => List(Duration.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
