package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Embassy
    extends OntologyDef(
      iri = "http://schema.org/Embassy",
      iris = Set("http://schema.org/Embassy"),
      label = "Embassy",
      comment = """An embassy.""",
      `@extends` = () => List(GovernmentBuilding.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.GovernmentBuilding.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.GovernmentBuilding.Properties {}
}
