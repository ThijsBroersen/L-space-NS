package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ViewAction extends OntologyDef(
        iri = "http://schema.org/ViewAction",
        iris = Set("http://schema.org/ViewAction"),
        label = "ViewAction",
        comment = """The act of consuming static visual content.""",
        `@extends` = () => List(ConsumeAction.ontology)
       ){
}