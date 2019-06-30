package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object NewsArticle extends OntologyDef(
        iri = "http://schema.org/NewsArticle",
        iris = Set("http://schema.org/NewsArticle"),
        label = "NewsArticle",
        comment = """A NewsArticle is an article whose content reports news, or provides background context and supporting materials for understanding the news.<br/><br/>

A more detailed overview of <a href="/docs/news.html">schema.org News markup</a> is also available.""",
        `@extends` = () => List(Article.ontology)
       ){
}