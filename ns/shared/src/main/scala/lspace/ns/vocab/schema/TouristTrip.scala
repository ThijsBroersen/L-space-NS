package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TouristTrip extends OntologyDef(
        iri = "http://schema.org/TouristTrip",
        iris = Set("http://schema.org/TouristTrip"),
        label = "TouristTrip",
        comment = """A tourist trip. A created itinerary of visits to one or more places of interest (<a class="localLink" href="http://schema.org/TouristAttraction">TouristAttraction</a>/<a class="localLink" href="http://schema.org/TouristDestination">TouristDestination</a>) often linked by a similar theme, geographic area, or interest to a particular <a class="localLink" href="http://schema.org/touristType">touristType</a>. The <a href="http://www2.unwto.org/">UNWTO</a> defines tourism trip as the Trip taken by visitors.
  (See examples below).""",
        `@extends` = () => List(Trip.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Trip.Properties{
lazy val touristType = lspace.ns.vocab.schema.touristType.property
}
override lazy val properties: List[LProperty] = List(touristType)
trait Properties extends lspace.ns.vocab.schema.Trip.Properties{
lazy val touristType = lspace.ns.vocab.schema.touristType.property
}
}