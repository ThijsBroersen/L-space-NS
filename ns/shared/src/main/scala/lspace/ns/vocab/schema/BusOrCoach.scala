package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object BusOrCoach
    extends OntologyDef(
      iri = "http://schema.org/BusOrCoach",
      iris = Set("http://schema.org/BusOrCoach"),
      label = "BusOrCoach",
      comment =
        """A bus (also omnibus or autobus) is a road vehicle designed to carry passengers. Coaches are luxury busses, usually in service for long distance travel.""",
      `@extends` = () => List(Vehicle.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Vehicle.Properties {
    lazy val acrissCode = lspace.ns.vocab.schema.acrissCode.property
  }
  override lazy val properties: List[Property] = List(acrissCode)
  trait Properties extends lspace.ns.vocab.schema.Vehicle.Properties {
    lazy val acrissCode = lspace.ns.vocab.schema.acrissCode.property
  }
}
