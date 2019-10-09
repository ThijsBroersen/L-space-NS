package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BusOrCoach extends OntologyDef(
        iri = "http://schema.org/BusOrCoach",
        iris = Set("http://schema.org/BusOrCoach"),
        label = "BusOrCoach",
        comment = """A bus (also omnibus or autobus) is a road vehicle designed to carry passengers. Coaches are luxury busses, usually in service for long distance travel.""",
        `@extends` = List(Vehicle.ontology)
       ){
object keys extends lspace.ns.vocab.schema.Vehicle.Properties{
lazy val acrissCode = lspace.ns.vocab.schema.acrissCode.property
lazy val roofLoad = lspace.ns.vocab.schema.roofLoad.property
override lazy val productionDate = lspace.ns.vocab.schema.productionDate.property
override lazy val purchaseDate = lspace.ns.vocab.schema.purchaseDate.property}
override lazy val properties: List[LProperty] = List(acrissCode, roofLoad)
trait Properties extends lspace.ns.vocab.schema.Vehicle.Properties{
lazy val acrissCode = lspace.ns.vocab.schema.acrissCode.property
lazy val roofLoad = lspace.ns.vocab.schema.roofLoad.property
override lazy val productionDate = lspace.ns.vocab.schema.productionDate.property
override lazy val purchaseDate = lspace.ns.vocab.schema.purchaseDate.property}
}