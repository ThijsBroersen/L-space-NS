package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object GovernmentBuilding
    extends OntologyDef(
      iri = "http://schema.org/GovernmentBuilding",
      iris = Set("http://schema.org/GovernmentBuilding"),
      label = "GovernmentBuilding",
      comment = """A government building.""",
      `@extends` = () => List(CivicStructure.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CivicStructure.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties {}
}
