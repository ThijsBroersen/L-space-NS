package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object OpinionNewsArticle
    extends OntologyDef(
      iri = "http://schema.org/OpinionNewsArticle",
      iris = Set("http://schema.org/OpinionNewsArticle"),
      label = "OpinionNewsArticle",
      comment =
        """An <a class="localLink" href="http://schema.org/OpinionNewsArticle">OpinionNewsArticle</a> is a <a class="localLink" href="http://schema.org/NewsArticle">NewsArticle</a> that primarily expresses opinions rather than journalistic reporting of news and events. For example, a <a class="localLink" href="http://schema.org/NewsArticle">NewsArticle</a> consisting of a column or <a class="localLink" href="http://schema.org/Blog">Blog</a>/<a class="localLink" href="http://schema.org/BlogPosting">BlogPosting</a> entry in the Opinions section of a news publication.""",
      `@extends` = () => List(NewsArticle.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.NewsArticle.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.NewsArticle.Properties {}
}
