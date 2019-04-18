package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object InteractAction
    extends OntologyDef(
      iri = "http://schema.org/InteractAction",
      iris = Set("http://schema.org/InteractAction"),
      label = "InteractAction",
      comment = """The act of interacting with another person or organization.""",
      `@extends` = () => List(Action.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Action.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Action.Properties {}
}
