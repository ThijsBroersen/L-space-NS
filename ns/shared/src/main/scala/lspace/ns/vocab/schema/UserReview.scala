package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object UserReview extends OntologyDef(
        iri = "http://schema.org/UserReview",
        iris = Set("http://schema.org/UserReview"),
        label = "UserReview",
        comment = """A review created by an end-user (e.g. consumer, purchaser, attendee etc.), in contrast with <a class="localLink" href="http://schema.org/CriticReview">CriticReview</a>.""",
        `@extends` = () => List(Review.ontology)
       ){
}