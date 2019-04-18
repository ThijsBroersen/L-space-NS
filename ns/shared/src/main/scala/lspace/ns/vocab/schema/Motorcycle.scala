package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Motorcycle
    extends OntologyDef(
      iri = "http://schema.org/Motorcycle",
      iris = Set("http://schema.org/Motorcycle"),
      label = "Motorcycle",
      comment = """A motorcycle or motorbike is a single-track, two-wheeled motor vehicle.""",
      `@extends` = () => List(Vehicle.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Vehicle.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Vehicle.Properties {}
}
