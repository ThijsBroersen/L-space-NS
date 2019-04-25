package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LegislativeBuilding
    extends OntologyDef(
      iri = "http://schema.org/LegislativeBuilding",
      iris = Set("http://schema.org/LegislativeBuilding"),
      label = "LegislativeBuilding",
      comment = """A legislative building&#x2014;for example, the state capitol.""",
      `@extends` = () => List(GovernmentBuilding.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.GovernmentBuilding.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.GovernmentBuilding.Properties {}
}
