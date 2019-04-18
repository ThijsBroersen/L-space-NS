package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object CityHall
    extends OntologyDef(
      iri = "http://schema.org/CityHall",
      iris = Set("http://schema.org/CityHall"),
      label = "CityHall",
      comment = """A city hall.""",
      `@extends` = () => List(GovernmentBuilding.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.GovernmentBuilding.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.GovernmentBuilding.Properties {}
}
