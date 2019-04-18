package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object geoCrosses
    extends PropertyDef(
      iri = "http://schema.org/geoCrosses",
      iris = Set("http://schema.org/geoCrosses"),
      label = "geoCrosses",
      comment =
        """Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: "a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them". As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.""",
      `@extends` = () => List(),
      `@range` = () => List(GeospatialGeometry.ontology, Place.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
