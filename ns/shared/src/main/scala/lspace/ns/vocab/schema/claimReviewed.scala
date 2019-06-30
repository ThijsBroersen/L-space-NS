package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object claimReviewed extends PropertyDef(
        iri = "http://schema.org/claimReviewed",
        iris = Set("http://schema.org/claimReviewed"),
        label = "claimReviewed",
        comment = """A short summary of the specific claims reviewed in a ClaimReview.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}