package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Comment extends OntologyDef(
        iri = "http://schema.org/Comment",
        iris = Set("http://schema.org/Comment"),
        label = "Comment",
        comment = """A comment on an item - for example, a comment on a blog post. The comment's content is expressed via the <a class="localLink" href="http://schema.org/text">text</a> property, and its topic via <a class="localLink" href="http://schema.org/about">about</a>, properties shared with all CreativeWorks.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}