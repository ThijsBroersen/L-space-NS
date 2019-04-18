package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object MedicalWebPage
    extends OntologyDef(
      iri = "http://schema.org/MedicalWebPage",
      iris = Set("http://schema.org/MedicalWebPage"),
      label = "MedicalWebPage",
      comment = """A web page that provides medical information.""",
      `@extends` = () => List(WebPage.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.WebPage.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.WebPage.Properties {}
}
