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
}