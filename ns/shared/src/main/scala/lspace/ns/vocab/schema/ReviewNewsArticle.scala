package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ReviewNewsArticle extends OntologyDef(
        iri = "http://schema.org/ReviewNewsArticle",
        iris = Set("http://schema.org/ReviewNewsArticle"),
        label = "ReviewNewsArticle",
        comment = """A <a class="localLink" href="http://schema.org/NewsArticle">NewsArticle</a> and <a class="localLink" href="http://schema.org/CriticReview">CriticReview</a> providing a professional critic's assessment of a service, product, performance, or artistic or literary work.""",
        `@extends` = () => List(CriticReview.ontology, NewsArticle.ontology)
       ){
}