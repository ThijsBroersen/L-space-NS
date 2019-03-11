package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object contentRating extends PropertyDef(
        iri = "https://schema.org/contentRating",
        iris = Set("https://schema.org/contentRating"),
        label = "contentRating",
        comment = """Official rating of a piece of content&#x2014;for example,'MPAA PG-13'.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}