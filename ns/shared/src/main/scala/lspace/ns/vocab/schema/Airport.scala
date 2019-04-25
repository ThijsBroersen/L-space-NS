package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Airport
    extends OntologyDef(
      iri = "http://schema.org/Airport",
      iris = Set("http://schema.org/Airport"),
      label = "Airport",
      comment = """An airport.""",
      `@extends` = () => List(CivicStructure.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CivicStructure.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties {}
}
