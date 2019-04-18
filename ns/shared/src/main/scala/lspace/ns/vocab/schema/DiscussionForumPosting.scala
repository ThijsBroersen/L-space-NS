package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object DiscussionForumPosting
    extends OntologyDef(
      iri = "http://schema.org/DiscussionForumPosting",
      iris = Set("http://schema.org/DiscussionForumPosting"),
      label = "DiscussionForumPosting",
      comment = """A posting to a discussion forum.""",
      `@extends` = () => List(SocialMediaPosting.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.SocialMediaPosting.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.SocialMediaPosting.Properties {}
}
