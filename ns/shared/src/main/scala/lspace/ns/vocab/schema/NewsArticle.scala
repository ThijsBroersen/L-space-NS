package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object NewsArticle
    extends OntologyDef(
      iri = "http://schema.org/NewsArticle",
      iris = Set("http://schema.org/NewsArticle"),
      label = "NewsArticle",
      comment =
        """A NewsArticle is an article whose content reports news, or provides background context and supporting materials for understanding the news.<br/><br/>

A more detailed overview of <a href="/docs/news.html">schema.org News markup</a> is also available.""",
      `@extends` = () => List(Article.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Article.Properties {
    lazy val dateline     = lspace.ns.vocab.schema.dateline.property
    lazy val printPage    = lspace.ns.vocab.schema.printPage.property
    lazy val printSection = lspace.ns.vocab.schema.printSection.property
  }
  override lazy val properties: List[LProperty] = List(dateline, printPage, printSection)
  trait Properties extends lspace.ns.vocab.schema.Article.Properties {
    lazy val dateline     = lspace.ns.vocab.schema.dateline.property
    lazy val printPage    = lspace.ns.vocab.schema.printPage.property
    lazy val printSection = lspace.ns.vocab.schema.printSection.property
  }
}
