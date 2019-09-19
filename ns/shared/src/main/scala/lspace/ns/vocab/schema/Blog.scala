package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Blog extends OntologyDef(
        iri = "http://schema.org/Blog",
        iris = Set("http://schema.org/Blog"),
        label = "Blog",
        comment = """A blog.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val blogPost = lspace.ns.vocab.schema.blogPost.property
lazy val issn = lspace.ns.vocab.schema.issn.property
}
override lazy val properties: List[LProperty] = List(blogPost, issn)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val blogPost = lspace.ns.vocab.schema.blogPost.property
lazy val issn = lspace.ns.vocab.schema.issn.property
}
}