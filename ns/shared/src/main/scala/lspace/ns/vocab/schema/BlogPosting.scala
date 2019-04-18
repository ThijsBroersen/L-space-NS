package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object BlogPosting
    extends OntologyDef(
      iri = "http://schema.org/BlogPosting",
      iris = Set("http://schema.org/BlogPosting"),
      label = "BlogPosting",
      comment = """A blog post.""",
      `@extends` = () => List(SocialMediaPosting.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.SocialMediaPosting.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.SocialMediaPosting.Properties {}
}
