package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object geoMidpoint
    extends PropertyDef(
      iri = "http://schema.org/geoMidpoint",
      iris = Set("http://schema.org/geoMidpoint"),
      label = "geoMidpoint",
      comment = """Indicates the GeoCoordinates at the centre of a GeoShape e.g. GeoCircle.""",
      `@extends` = () => List(),
      `@range` = () => List(GeoCoordinates.ontology)
    ) {

  override lazy val properties: List[LProperty] = List()
  trait Properties
}
