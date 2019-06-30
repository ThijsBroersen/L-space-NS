package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AssessAction extends OntologyDef(
        iri = "http://schema.org/AssessAction",
        iris = Set("http://schema.org/AssessAction"),
        label = "AssessAction",
        comment = """The act of forming one's opinion, reaction or sentiment.""",
        `@extends` = () => List(Action.ontology)
       ){
}