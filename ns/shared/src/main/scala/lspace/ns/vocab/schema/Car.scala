package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Car
    extends OntologyDef(
      iri = "http://schema.org/Car",
      iris = Set("http://schema.org/Car"),
      label = "Car",
      comment = """A car is a wheeled, self-powered motor vehicle used for transportation.""",
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
