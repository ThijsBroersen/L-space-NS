package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object resultReview extends PropertyDef(
        iri = "http://schema.org/resultReview",
        iris = Set("http://schema.org/resultReview"),
        label = "resultReview",
        comment = """A sub property of result. The review that resulted in the performing of the action.""",
        `@extends` = () => List(result.property),
        `@range` = () => List(Review.ontology)
       ){
}