package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CreateAction extends OntologyDef(
        iri = "http://schema.org/CreateAction",
        iris = Set("http://schema.org/CreateAction"),
        label = "CreateAction",
        comment = """The act of deliberately creating/producing/generating/building a result out of the agent.""",
        `@extends` = () => List(Action.ontology)
       ){
}