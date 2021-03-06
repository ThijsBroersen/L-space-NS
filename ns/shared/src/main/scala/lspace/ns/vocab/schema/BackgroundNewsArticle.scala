package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BackgroundNewsArticle extends OntologyDef(
        iri = "http://schema.org/BackgroundNewsArticle",
        iris = Set("http://schema.org/BackgroundNewsArticle"),
        label = "BackgroundNewsArticle",
        comment = """A <a class="localLink" href="http://schema.org/NewsArticle">NewsArticle</a> providing historical context, definition and detail on a specific topic (aka "explainer" or "backgrounder"). For example, an in-depth article or frequently-asked-questions (<a href="https://en.wikipedia.org/wiki/FAQ">FAQ</a>) document on topics such as Climate Change or the European Union. Other kinds of background material from a non-news setting are often described using <a class="localLink" href="http://schema.org/Book">Book</a> or <a class="localLink" href="http://schema.org/Article">Article</a>, in particular <a class="localLink" href="http://schema.org/ScholarlyArticle">ScholarlyArticle</a>. See also <a class="localLink" href="http://schema.org/NewsArticle">NewsArticle</a> for related vocabulary from a learning/education perspective.""",
        `@extends` = List(NewsArticle.ontology)
       ){
object keys extends lspace.ns.vocab.schema.NewsArticle.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.NewsArticle.Properties{

}
}