package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WebApplication
    extends OntologyDef(
      iri = "http://schema.org/WebApplication",
      iris = Set("http://schema.org/WebApplication"),
      label = "WebApplication",
      comment = """Web applications.""",
      `@extends` = () => List(SoftwareApplication.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.SoftwareApplication.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.SoftwareApplication.Properties {}
}
