package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Apartment extends OntologyDef(
        iri = "http://schema.org/Apartment",
        iris = Set("http://schema.org/Apartment"),
        label = "Apartment",
        comment = """An apartment (in American English) or flat (in British English) is a self-contained housing unit (a type of residential real estate) that occupies only part of a building (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Apartment">http://en.wikipedia.org/wiki/Apartment</a>).""",
        `@extends` = () => List(Accommodation.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Accommodation.Properties{
lazy val occupancy = lspace.ns.vocab.schema.occupancy.property
override lazy val amenityFeature = lspace.ns.vocab.schema.amenityFeature.property}
override lazy val properties: List[LProperty] = List(occupancy)
trait Properties extends lspace.ns.vocab.schema.Accommodation.Properties{
lazy val occupancy = lspace.ns.vocab.schema.occupancy.property
override lazy val amenityFeature = lspace.ns.vocab.schema.amenityFeature.property}
}