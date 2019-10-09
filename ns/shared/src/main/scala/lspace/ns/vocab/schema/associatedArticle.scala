package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object associatedArticle extends PropertyDef(
        iri = "http://schema.org/associatedArticle",
        iris = Set("http://schema.org/associatedArticle"),
        label = "associatedArticle",
        comment = """A NewsArticle associated with the Media Object.""",
        `@extends` = List(),
        `@range` = List(NewsArticle.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}