package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object contentRating extends PropertyDef(
        iri = "http://schema.org/contentRating",
        iris = Set("http://schema.org/contentRating"),
        label = "contentRating",
        comment = """Official rating of a piece of content&#x2014;for example,'MPAA PG-13'.""",
        `@extends` = () => List(),
        `@range` = () => List(Rating.ontology, Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}