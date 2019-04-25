package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SubwayStation
    extends OntologyDef(
      iri = "http://schema.org/SubwayStation",
      iris = Set("http://schema.org/SubwayStation"),
      label = "SubwayStation",
      comment = """A subway station.""",
      `@extends` = () => List(CivicStructure.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CivicStructure.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties {}
}
