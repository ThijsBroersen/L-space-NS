package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object DisagreeAction
    extends OntologyDef(
      iri = "http://schema.org/DisagreeAction",
      iris = Set("http://schema.org/DisagreeAction"),
      label = "DisagreeAction",
      comment =
        """The act of expressing a difference of opinion with the object. An agent disagrees to/about an object (a proposition, topic or theme) with participants.""",
      `@extends` = () => List(ReactAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.ReactAction.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.ReactAction.Properties {}
}
