package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object ScholarlyArticle
    extends OntologyDef(
      iri = "http://schema.org/ScholarlyArticle",
      iris = Set("http://schema.org/ScholarlyArticle"),
      label = "ScholarlyArticle",
      comment = """A scholarly article.""",
      `@extends` = () => List(Article.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Article.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Article.Properties {}
}
