package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object UpdateAction
    extends OntologyDef(
      iri = "http://schema.org/UpdateAction",
      iris = Set("http://schema.org/UpdateAction"),
      label = "UpdateAction",
      comment = """The act of managing by changing/editing the state of the object.""",
      `@extends` = () => List(Action.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Action.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Action.Properties {}
}
