package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LiveBlogPosting extends OntologyDef(
        iri = "http://schema.org/LiveBlogPosting",
        iris = Set("http://schema.org/LiveBlogPosting"),
        label = "LiveBlogPosting",
        comment = """A blog post intended to provide a rolling textual coverage of an ongoing event through continuous updates.""",
        `@extends` = List(BlogPosting.ontology)
       ){
object keys extends lspace.ns.vocab.schema.BlogPosting.Properties{
lazy val coverageEndTime = lspace.ns.vocab.schema.coverageEndTime.property
lazy val coverageStartTime = lspace.ns.vocab.schema.coverageStartTime.property
lazy val liveBlogUpdate = lspace.ns.vocab.schema.liveBlogUpdate.property
}
override lazy val properties: List[LProperty] = List(coverageEndTime, coverageStartTime, liveBlogUpdate)
trait Properties extends lspace.ns.vocab.schema.BlogPosting.Properties{
lazy val coverageEndTime = lspace.ns.vocab.schema.coverageEndTime.property
lazy val coverageStartTime = lspace.ns.vocab.schema.coverageStartTime.property
lazy val liveBlogUpdate = lspace.ns.vocab.schema.liveBlogUpdate.property
}
}