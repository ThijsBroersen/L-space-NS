package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DefenceEstablishment
    extends OntologyDef(
      iri = "http://schema.org/DefenceEstablishment",
      iris = Set("http://schema.org/DefenceEstablishment"),
      label = "DefenceEstablishment",
      comment = """A defence establishment, such as an army or navy base.""",
      `@extends` = () => List(GovernmentBuilding.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.GovernmentBuilding.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.GovernmentBuilding.Properties {}
}
