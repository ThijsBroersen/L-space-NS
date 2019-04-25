package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Courthouse
    extends OntologyDef(
      iri = "http://schema.org/Courthouse",
      iris = Set("http://schema.org/Courthouse"),
      label = "Courthouse",
      comment = """A courthouse.""",
      `@extends` = () => List(GovernmentBuilding.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.GovernmentBuilding.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.GovernmentBuilding.Properties {}
}
