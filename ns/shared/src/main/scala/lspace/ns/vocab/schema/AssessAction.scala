package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object AssessAction
    extends OntologyDef(
      iri = "http://schema.org/AssessAction",
      iris = Set("http://schema.org/AssessAction"),
      label = "AssessAction",
      comment = """The act of forming one's opinion, reaction or sentiment.""",
      `@extends` = () => List(Action.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Action.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Action.Properties {}
}
