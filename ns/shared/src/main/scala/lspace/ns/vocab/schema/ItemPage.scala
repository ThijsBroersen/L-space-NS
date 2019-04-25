package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ItemPage
    extends OntologyDef(
      iri = "http://schema.org/ItemPage",
      iris = Set("http://schema.org/ItemPage"),
      label = "ItemPage",
      comment = """A page devoted to a single item, such as a particular product or hotel.""",
      `@extends` = () => List(WebPage.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.WebPage.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.WebPage.Properties {}
}
