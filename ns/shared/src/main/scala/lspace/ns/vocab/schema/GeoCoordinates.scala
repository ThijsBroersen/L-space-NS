package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object GeoCoordinates extends OntologyDef(
        iri = "http://schema.org/GeoCoordinates",
        iris = Set("http://schema.org/GeoCoordinates"),
        label = "GeoCoordinates",
        comment = """The geographic coordinates of a place or event.""",
        `@extends` = List(StructuredValue.ontology)
       ){
object keys extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val address = lspace.ns.vocab.schema.address.property
lazy val addressCountry = lspace.ns.vocab.schema.addressCountry.property
lazy val elevation = lspace.ns.vocab.schema.elevation.property
lazy val latitude = lspace.ns.vocab.schema.latitude.property
lazy val longitude = lspace.ns.vocab.schema.longitude.property
lazy val postalCode = lspace.ns.vocab.schema.postalCode.property
}
override lazy val properties: List[LProperty] = List(address, addressCountry, elevation, latitude, longitude, postalCode)
trait Properties extends lspace.ns.vocab.schema.StructuredValue.Properties{
lazy val address = lspace.ns.vocab.schema.address.property
lazy val addressCountry = lspace.ns.vocab.schema.addressCountry.property
lazy val elevation = lspace.ns.vocab.schema.elevation.property
lazy val latitude = lspace.ns.vocab.schema.latitude.property
lazy val longitude = lspace.ns.vocab.schema.longitude.property
lazy val postalCode = lspace.ns.vocab.schema.postalCode.property
}
}