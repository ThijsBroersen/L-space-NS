package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object Float
    extends OntologyDef(
      iri = "http://schema.org/Float",
      iris = Set("http://schema.org/Float"),
      label = "Float",
      comment = """Data type: Floating number.""",
      `@extends` = () => List(Number.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Number.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Number.Properties {}
}
