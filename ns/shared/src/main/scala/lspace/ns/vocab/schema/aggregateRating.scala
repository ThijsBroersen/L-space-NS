package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object aggregateRating extends PropertyDef(
        iri = "https://schema.org/aggregateRating",
        iris = Set("https://schema.org/aggregateRating"),
        label = "aggregateRating",
        comment = """The overall rating, based on a collection of reviews or ratings, of the item.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}