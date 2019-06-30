package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ClaimReview extends OntologyDef(
        iri = "http://schema.org/ClaimReview",
        iris = Set("http://schema.org/ClaimReview"),
        label = "ClaimReview",
        comment = """A fact-checking review of claims made (or reported) in some creative work (referenced via itemReviewed).""",
        `@extends` = () => List(Review.ontology)
       ){
}