package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object LiveBlogPosting extends OntologyDef(
        iri = "http://schema.org/LiveBlogPosting",
        iris = Set("http://schema.org/LiveBlogPosting"),
        label = "LiveBlogPosting",
        comment = """A blog post intended to provide a rolling textual coverage of an ongoing event through continuous updates.""",
        `@extends` = () => List(BlogPosting.ontology)
       ){
}