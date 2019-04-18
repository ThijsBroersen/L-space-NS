package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object EventVenue
    extends OntologyDef(
      iri = "http://schema.org/EventVenue",
      iris = Set("http://schema.org/EventVenue"),
      label = "EventVenue",
      comment = """An event venue.""",
      `@extends` = () => List(CivicStructure.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CivicStructure.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties {}
}
