package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Integer
    extends OntologyDef(
      iri = "http://schema.org/Integer",
      iris = Set("http://schema.org/Integer"),
      label = "Integer",
      comment = """Data type: Integer.""",
      `@extends` = () => List(Number.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Number.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.Number.Properties {}
}
