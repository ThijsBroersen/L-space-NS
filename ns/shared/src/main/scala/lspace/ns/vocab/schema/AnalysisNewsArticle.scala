package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AnalysisNewsArticle
    extends OntologyDef(
      iri = "http://schema.org/AnalysisNewsArticle",
      iris = Set("http://schema.org/AnalysisNewsArticle"),
      label = "AnalysisNewsArticle",
      comment =
        """An AnalysisNewsArticle is a <a class="localLink" href="http://schema.org/NewsArticle">NewsArticle</a> that, while based on factual reporting, incorporates the expertise of the author/producer, offering interpretations and conclusions.""",
      `@extends` = () => List(NewsArticle.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.NewsArticle.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.NewsArticle.Properties {}
}
