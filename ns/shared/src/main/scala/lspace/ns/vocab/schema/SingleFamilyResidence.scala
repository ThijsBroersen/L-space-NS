package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SingleFamilyResidence extends OntologyDef(
        iri = "http://schema.org/SingleFamilyResidence",
        iris = Set("http://schema.org/SingleFamilyResidence"),
        label = "SingleFamilyResidence",
        comment = """Residence type: Single-family home.""",
        `@extends` = List(House.ontology)
       ){
object keys extends lspace.ns.vocab.schema.House.Properties{
lazy val occupancy = lspace.ns.vocab.schema.occupancy.property
override lazy val amenityFeature = lspace.ns.vocab.schema.amenityFeature.property}
override lazy val properties: List[LProperty] = List(occupancy)
trait Properties extends lspace.ns.vocab.schema.House.Properties{
lazy val occupancy = lspace.ns.vocab.schema.occupancy.property
override lazy val amenityFeature = lspace.ns.vocab.schema.amenityFeature.property}
}