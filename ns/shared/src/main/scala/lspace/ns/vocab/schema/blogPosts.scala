package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object blogPosts
    extends PropertyDef(
      iri = "http://schema.org/blogPosts",
      iris = Set("http://schema.org/blogPosts"),
      label = "blogPosts",
      comment = """The postings that are part of this blog.""",
      `@extends` = () => List(),
      `@range` = () => List(BlogPosting.ontology)
    ) {

  override lazy val properties: List[Property] = List()
  trait Properties
}
