package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object LiveBlogPosting
    extends OntologyDef(
      iri = "http://schema.org/LiveBlogPosting",
      iris = Set("http://schema.org/LiveBlogPosting"),
      label = "LiveBlogPosting",
      comment =
        """A blog post intended to provide a rolling textual coverage of an ongoing event through continuous updates.""",
      `@extends` = () => List(BlogPosting.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.BlogPosting.Properties {
    lazy val liveBlogUpdate  = lspace.ns.vocab.schema.liveBlogUpdate.property
    lazy val coverageEndTime = lspace.ns.vocab.schema.coverageEndTime.property
  }
  override lazy val properties: List[Property] = List(liveBlogUpdate, coverageEndTime)
  trait Properties extends lspace.ns.vocab.schema.BlogPosting.Properties {
    lazy val liveBlogUpdate  = lspace.ns.vocab.schema.liveBlogUpdate.property
    lazy val coverageEndTime = lspace.ns.vocab.schema.coverageEndTime.property
  }
}
