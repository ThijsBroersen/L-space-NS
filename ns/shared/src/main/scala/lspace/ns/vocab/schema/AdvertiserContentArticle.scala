package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AdvertiserContentArticle
    extends OntologyDef(
      iri = "http://schema.org/AdvertiserContentArticle",
      iris = Set("http://schema.org/AdvertiserContentArticle"),
      label = "AdvertiserContentArticle",
      comment =
        """An <a class="localLink" href="http://schema.org/Article">Article</a> that an external entity has paid to place or to produce to its specifications. Includes <a href="https://en.wikipedia.org/wiki/Advertorial">advertorials</a>, sponsored content, native advertising and other paid content.""",
      `@extends` = () => List(Article.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Article.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.Article.Properties {}
}
