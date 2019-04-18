package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Aquarium
    extends OntologyDef(
      iri = "http://schema.org/Aquarium",
      iris = Set("http://schema.org/Aquarium"),
      label = "Aquarium",
      comment = """Aquarium.""",
      `@extends` = () => List(CivicStructure.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CivicStructure.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.CivicStructure.Properties {}
}
