package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GeoShape extends OntologyDef(
        iri = "http://schema.org/GeoShape",
        iris = Set("http://schema.org/GeoShape"),
        label = "GeoShape",
        comment = """The geographic shape of a place. A GeoShape can be described using several properties whose values are based on latitude/longitude pairs. Either whitespace or commas can be used to separate latitude and longitude; whitespace should be used when writing a list of several such points.""",
        `@extends` = () => List(StructuredValue.ontology)
       ){
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val address = lspace.ns.vocab.schema.address.property
lazy val addressCountry = lspace.ns.vocab.schema.addressCountry.property
lazy val box = lspace.ns.vocab.schema.box.property
lazy val circle = lspace.ns.vocab.schema.circle.property
lazy val elevation = lspace.ns.vocab.schema.elevation.property
lazy val line = lspace.ns.vocab.schema.line.property
lazy val polygon = lspace.ns.vocab.schema.polygon.property
lazy val postalCode = lspace.ns.vocab.schema.postalCode.property
}
override lazy val properties: List[LProperty] = List(address, addressCountry, box, circle, elevation, line, polygon, postalCode)
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val address = lspace.ns.vocab.schema.address.property
lazy val addressCountry = lspace.ns.vocab.schema.addressCountry.property
lazy val box = lspace.ns.vocab.schema.box.property
lazy val circle = lspace.ns.vocab.schema.circle.property
lazy val elevation = lspace.ns.vocab.schema.elevation.property
lazy val line = lspace.ns.vocab.schema.line.property
lazy val polygon = lspace.ns.vocab.schema.polygon.property
lazy val postalCode = lspace.ns.vocab.schema.postalCode.property
}
}