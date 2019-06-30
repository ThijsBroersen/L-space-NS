package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ScholarlyArticle extends OntologyDef(
        iri = "http://schema.org/ScholarlyArticle",
        iris = Set("http://schema.org/ScholarlyArticle"),
        label = "ScholarlyArticle",
        comment = """A scholarly article.""",
        `@extends` = () => List(Article.ontology)
       ){
}