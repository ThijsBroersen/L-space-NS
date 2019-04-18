package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object geo
    extends PropertyDef(
      iri = "http://schema.org/geo",
      iris = Set("http://schema.org/geo"),
      label = "geo",
      comment = """The geo coordinates of the place.""",
      `@extends` = () => List(),
      `@range` = () => List(GeoCoordinates.ontology, GeoShape.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
