package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Bridge
    extends OntologyDef(
      iri = "http://schema.org/Bridge",
      iris = Set("http://schema.org/Bridge"),
      label = "Bridge",
      comment = """A bridge.""",
      `@extends` = () => List(CivicStructure.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CivicStructure.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties {}
}
