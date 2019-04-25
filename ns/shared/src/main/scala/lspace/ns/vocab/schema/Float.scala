package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Float
    extends OntologyDef(
      iri = "http://schema.org/Float",
      iris = Set("http://schema.org/Float"),
      label = "Float",
      comment = """Data type: Floating number.""",
      `@extends` = () => List(Number.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Number.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.Number.Properties {}
}
