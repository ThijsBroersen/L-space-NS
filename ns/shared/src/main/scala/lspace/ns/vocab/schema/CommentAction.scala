package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CommentAction extends OntologyDef(
        iri = "http://schema.org/CommentAction",
        iris = Set("http://schema.org/CommentAction"),
        label = "CommentAction",
        comment = """The act of generating a comment about a subject.""",
        `@extends` = () => List(CommunicateAction.ontology)
       ){
}