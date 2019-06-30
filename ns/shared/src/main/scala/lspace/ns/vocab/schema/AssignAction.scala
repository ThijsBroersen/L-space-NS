package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AssignAction extends OntologyDef(
        iri = "http://schema.org/AssignAction",
        iris = Set("http://schema.org/AssignAction"),
        label = "AssignAction",
        comment = """The act of allocating an action/event/task to some destination (someone or something).""",
        `@extends` = () => List(AllocateAction.ontology)
       ){
}