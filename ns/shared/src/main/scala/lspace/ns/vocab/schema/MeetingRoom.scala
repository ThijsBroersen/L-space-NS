package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MeetingRoom
    extends OntologyDef(
      iri = "http://schema.org/MeetingRoom",
      iris = Set("http://schema.org/MeetingRoom"),
      label = "MeetingRoom",
      comment =
        """A meeting room, conference room, or conference hall is a room provided for singular events such as business conferences and meetings (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Conference_hall">http://en.wikipedia.org/wiki/Conference_hall</a>).
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.""",
      `@extends` = () => List(Room.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Room.Properties {

    override lazy val amenityFeature = lspace.ns.vocab.schema.amenityFeature.property
  }
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Room.Properties {

    override lazy val amenityFeature = lspace.ns.vocab.schema.amenityFeature.property
  }
}
