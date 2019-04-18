package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Airline
    extends OntologyDef(
      iri = "http://schema.org/Airline",
      iris = Set("http://schema.org/Airline"),
      label = "Airline",
      comment = """An organization that provides flights for passengers.""",
      `@extends` = () => List(Organization.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Organization.Properties {
    lazy val boardingPolicy = lspace.ns.vocab.schema.boardingPolicy.property
    lazy val iataCode       = lspace.ns.vocab.schema.iataCode.property
  }
  override lazy val properties: List[Property] = List(boardingPolicy, iataCode)
  trait Properties extends lspace.ns.vocab.schema.Organization.Properties {
    lazy val boardingPolicy = lspace.ns.vocab.schema.boardingPolicy.property
    lazy val iataCode       = lspace.ns.vocab.schema.iataCode.property
  }
}
