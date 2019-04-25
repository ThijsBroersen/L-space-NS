package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object elevation
    extends PropertyDef(
      iri = "http://schema.org/elevation",
      iris = Set("http://schema.org/elevation"),
      label = "elevation",
      comment =
        """The elevation of a location (<a href="https://en.wikipedia.org/wiki/World_Geodetic_System">WGS 84</a>). Values may be of the form 'NUMBER UNIT<em>OF</em>MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.""",
      `@extends` = () => List(),
      `@range` = () => List(Number.ontology, Text.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
