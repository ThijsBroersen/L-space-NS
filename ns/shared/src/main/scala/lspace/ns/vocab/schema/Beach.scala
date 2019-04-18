package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Beach
    extends OntologyDef(
      iri = "http://schema.org/Beach",
      iris = Set("http://schema.org/Beach"),
      label = "Beach",
      comment = """Beach.""",
      `@extends` = () => List(CivicStructure.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CivicStructure.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties {}
}
