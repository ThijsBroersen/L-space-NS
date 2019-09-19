package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object HotelRoom extends OntologyDef(
        iri = "http://schema.org/HotelRoom",
        iris = Set("http://schema.org/HotelRoom"),
        label = "HotelRoom",
        comment = """A hotel room is a single room in a hotel.
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.""",
        `@extends` = () => List(Room.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Room.Properties{
lazy val bed = lspace.ns.vocab.schema.bed.property
lazy val occupancy = lspace.ns.vocab.schema.occupancy.property
override lazy val amenityFeature = lspace.ns.vocab.schema.amenityFeature.property}
override lazy val properties: List[LProperty] = List(bed, occupancy)
trait Properties extends lspace.ns.vocab.schema.Room.Properties{
lazy val bed = lspace.ns.vocab.schema.bed.property
lazy val occupancy = lspace.ns.vocab.schema.occupancy.property
override lazy val amenityFeature = lspace.ns.vocab.schema.amenityFeature.property}
}