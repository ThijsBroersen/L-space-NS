package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AskPublicNewsArticle extends OntologyDef(
        iri = "http://schema.org/AskPublicNewsArticle",
        iris = Set("http://schema.org/AskPublicNewsArticle"),
        label = "AskPublicNewsArticle",
        comment = """A <a class="localLink" href="http://schema.org/NewsArticle">NewsArticle</a> expressing an open call by a <a class="localLink" href="http://schema.org/NewsMediaOrganization">NewsMediaOrganization</a> asking the public for input, insights, clarifications, anecdotes, documentation, etc., on an issue, for reporting purposes.""",
        `@extends` = () => List(NewsArticle.ontology)
       ){
}