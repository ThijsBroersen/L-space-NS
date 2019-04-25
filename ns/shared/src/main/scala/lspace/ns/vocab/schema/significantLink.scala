package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object significantLink
    extends PropertyDef(
      iri = "http://schema.org/significantLink",
      iris = Set("http://schema.org/significantLink"),
      label = "significantLink",
      comment =
        """One of the more significant URLs on the page. Typically, these are the non-navigation links that are clicked on the most.""",
      `@extends` = () => List(),
      `@range` = () => List(URL.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
