package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Question
    extends OntologyDef(
      iri = "http://schema.org/Question",
      iris = Set("http://schema.org/Question"),
      label = "Question",
      comment =
        """A specific question - e.g. from a user seeking answers online, or collected in a Frequently Asked Questions (FAQ) document.""",
      `@extends` = () => List(CreativeWork.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val downvoteCount   = lspace.ns.vocab.schema.downvoteCount.property
    lazy val suggestedAnswer = lspace.ns.vocab.schema.suggestedAnswer.property
    lazy val upvoteCount     = lspace.ns.vocab.schema.upvoteCount.property
    lazy val acceptedAnswer  = lspace.ns.vocab.schema.acceptedAnswer.property
  }
  override lazy val properties: List[LProperty] = List(downvoteCount, suggestedAnswer, upvoteCount, acceptedAnswer)
  trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties {
    lazy val downvoteCount   = lspace.ns.vocab.schema.downvoteCount.property
    lazy val suggestedAnswer = lspace.ns.vocab.schema.suggestedAnswer.property
    lazy val upvoteCount     = lspace.ns.vocab.schema.upvoteCount.property
    lazy val acceptedAnswer  = lspace.ns.vocab.schema.acceptedAnswer.property
  }
}
