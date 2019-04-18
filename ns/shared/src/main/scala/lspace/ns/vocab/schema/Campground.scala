package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Campground extends OntologyDef(
        iri = "http://schema.org/Campground",
        iris = Set("http://schema.org/Campground"),
        label = "Campground",
        comment = """A camping site, campsite, or campground is a place used for overnight stay in the outdoors. In British English a campsite is an area, usually divided into a number of pitches, where people can camp overnight using tents or camper vans or caravans; this British English use of the word is synonymous with the American English expression campground. In American English the term campsite generally means an area where an individual, family, group, or military unit can pitch a tent or parks a camper; a campground may contain many campsites (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Campsite">http://en.wikipedia.org/wiki/Campsite</a>).
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.""",
        `@extends` = () => List(CivicStructure.ontology, LodgingBusiness.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CivicStructure.Properties with lspace.ns.vocab.schema.LodgingBusiness.Properties{

override lazy val openingHours = lspace.ns.vocab.schema.openingHours.property
override lazy val events = lspace.ns.vocab.schema.events.property
override lazy val slogan = lspace.ns.vocab.schema.slogan.property
override lazy val event = lspace.ns.vocab.schema.event.property
override lazy val logo = lspace.ns.vocab.schema.logo.property
override lazy val telephone = lspace.ns.vocab.schema.telephone.property
override lazy val isicV4 = lspace.ns.vocab.schema.isicV4.property
override lazy val review = lspace.ns.vocab.schema.review.property}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties with lspace.ns.vocab.schema.LodgingBusiness.Properties{

override lazy val openingHours = lspace.ns.vocab.schema.openingHours.property
override lazy val events = lspace.ns.vocab.schema.events.property
override lazy val slogan = lspace.ns.vocab.schema.slogan.property
override lazy val event = lspace.ns.vocab.schema.event.property
override lazy val logo = lspace.ns.vocab.schema.logo.property
override lazy val telephone = lspace.ns.vocab.schema.telephone.property
override lazy val isicV4 = lspace.ns.vocab.schema.isicV4.property
override lazy val review = lspace.ns.vocab.schema.review.property}
}