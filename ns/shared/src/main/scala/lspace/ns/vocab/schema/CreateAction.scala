package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object CreateAction
    extends OntologyDef(
      iri = "http://schema.org/CreateAction",
      iris = Set("http://schema.org/CreateAction"),
      label = "CreateAction",
      comment = """The act of deliberately creating/producing/generating/building a result out of the agent.""",
      `@extends` = () => List(Action.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Action.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.Action.Properties {}
}
