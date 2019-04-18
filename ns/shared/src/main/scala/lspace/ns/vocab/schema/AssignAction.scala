package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object AssignAction
    extends OntologyDef(
      iri = "http://schema.org/AssignAction",
      iris = Set("http://schema.org/AssignAction"),
      label = "AssignAction",
      comment = """The act of allocating an action/event/task to some destination (someone or something).""",
      `@extends` = () => List(AllocateAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.AllocateAction.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.AllocateAction.Properties {}
}
