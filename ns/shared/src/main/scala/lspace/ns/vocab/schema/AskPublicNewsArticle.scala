package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object AskPublicNewsArticle
    extends OntologyDef(
      iri = "http://schema.org/AskPublicNewsArticle",
      iris = Set("http://schema.org/AskPublicNewsArticle"),
      label = "AskPublicNewsArticle",
      comment =
        """A <a class="localLink" href="http://schema.org/NewsArticle">NewsArticle</a> expressing an open call by a <a class="localLink" href="http://schema.org/NewsMediaOrganization">NewsMediaOrganization</a> asking the public for input, insights, clarifications, anecdotes, documentation, etc., on an issue, for reporting purposes.""",
      `@extends` = () => List(NewsArticle.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.NewsArticle.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.NewsArticle.Properties {}
}
