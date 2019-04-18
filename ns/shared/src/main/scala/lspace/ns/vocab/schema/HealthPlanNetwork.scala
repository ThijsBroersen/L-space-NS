package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object HealthPlanNetwork
    extends OntologyDef(
      iri = "http://schema.org/HealthPlanNetwork",
      iris = Set("http://schema.org/HealthPlanNetwork"),
      label = "HealthPlanNetwork",
      comment = """A US-style health insurance plan network.""",
      `@extends` = () => List(Intangible.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Intangible.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Intangible.Properties {}
}
