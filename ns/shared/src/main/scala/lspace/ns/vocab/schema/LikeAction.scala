package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object LikeAction
    extends OntologyDef(
      iri = "http://schema.org/LikeAction",
      iris = Set("http://schema.org/LikeAction"),
      label = "LikeAction",
      comment =
        """The act of expressing a positive sentiment about the object. An agent likes an object (a proposition, topic or theme) with participants.""",
      `@extends` = () => List(ReactAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.ReactAction.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.ReactAction.Properties {}
}
