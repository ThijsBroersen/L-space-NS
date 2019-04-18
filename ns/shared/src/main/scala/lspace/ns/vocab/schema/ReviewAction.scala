package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object ReviewAction
    extends OntologyDef(
      iri = "http://schema.org/ReviewAction",
      iris = Set("http://schema.org/ReviewAction"),
      label = "ReviewAction",
      comment =
        """The act of producing a balanced opinion about the object for an audience. An agent reviews an object with participants resulting in a review.""",
      `@extends` = () => List(AssessAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.AssessAction.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.AssessAction.Properties {}
}
