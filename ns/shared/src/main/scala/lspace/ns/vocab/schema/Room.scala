package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Room extends OntologyDef(
        iri = "http://schema.org/Room",
        iris = Set("http://schema.org/Room"),
        label = "Room",
        comment = """A room is a distinguishable space within a structure, usually separated from other spaces by interior walls. (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Room">http://en.wikipedia.org/wiki/Room</a>).
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.""",
        `@extends` = List(Accommodation.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Accommodation.Properties{

override lazy val amenityFeature = lspace.ns.vocab.schema.amenityFeature.property}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.Accommodation.Properties{

override lazy val amenityFeature = lspace.ns.vocab.schema.amenityFeature.property}
}