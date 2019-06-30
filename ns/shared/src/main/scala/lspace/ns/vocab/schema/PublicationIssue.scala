package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PublicationIssue extends OntologyDef(
        iri = "http://schema.org/PublicationIssue",
        iris = Set("http://schema.org/PublicationIssue"),
        label = "PublicationIssue",
        comment = """A part of a successively published publication such as a periodical or publication volume, often numbered, usually containing a grouping of works such as articles.<br/><br/>

<a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html">blog post</a>.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}