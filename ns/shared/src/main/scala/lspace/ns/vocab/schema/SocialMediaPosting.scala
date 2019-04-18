package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object SocialMediaPosting
    extends OntologyDef(
      iri = "http://schema.org/SocialMediaPosting",
      iris = Set("http://schema.org/SocialMediaPosting"),
      label = "SocialMediaPosting",
      comment = """A post to a social media platform, including blog posts, tweets, Facebook posts, etc.""",
      `@extends` = () => List(Article.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Article.Properties {
    lazy val sharedContent = lspace.ns.vocab.schema.sharedContent.property
  }
  override lazy val properties: List[Property] = List(sharedContent)
  trait Properties extends lspace.ns.vocab.schema.Article.Properties {
    lazy val sharedContent = lspace.ns.vocab.schema.sharedContent.property
  }
}
