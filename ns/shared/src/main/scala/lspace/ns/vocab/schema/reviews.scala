package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object reviews extends PropertyDef(
        iri = "http://schema.org/reviews",
        iris = Set("http://schema.org/reviews"),
        label = "reviews",
        comment = """Review of the item.""",
        `@extends` = () => List(),
        `@range` = () => List(Review.ontology)
       ){
}