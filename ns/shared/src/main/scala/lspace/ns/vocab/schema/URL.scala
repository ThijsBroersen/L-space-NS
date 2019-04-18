package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object URL
    extends OntologyDef(
      iri = "http://schema.org/URL",
      iris = Set("http://schema.org/URL"),
      label = "URL",
      comment = """Data type: URL.""",
      `@extends` = () => List(Text.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Text.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Text.Properties {}
}
