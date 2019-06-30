package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object InteractAction extends OntologyDef(
        iri = "http://schema.org/InteractAction",
        iris = Set("http://schema.org/InteractAction"),
        label = "InteractAction",
        comment = """The act of interacting with another person or organization.""",
        `@extends` = () => List(Action.ontology)
       ){
}