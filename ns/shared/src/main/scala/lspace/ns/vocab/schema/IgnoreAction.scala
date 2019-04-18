package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object IgnoreAction
    extends OntologyDef(
      iri = "http://schema.org/IgnoreAction",
      iris = Set("http://schema.org/IgnoreAction"),
      label = "IgnoreAction",
      comment = """The act of intentionally disregarding the object. An agent ignores an object.""",
      `@extends` = () => List(AssessAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.AssessAction.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.AssessAction.Properties {}
}
