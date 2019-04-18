package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object ProfilePage
    extends OntologyDef(
      iri = "http://schema.org/ProfilePage",
      iris = Set("http://schema.org/ProfilePage"),
      label = "ProfilePage",
      comment = """Web page type: Profile page.""",
      `@extends` = () => List(WebPage.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.WebPage.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.WebPage.Properties {}
}
