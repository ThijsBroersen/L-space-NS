package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object IgnoreAction extends OntologyDef(
        iri = "http://schema.org/IgnoreAction",
        iris = Set("http://schema.org/IgnoreAction"),
        label = "IgnoreAction",
        comment = """The act of intentionally disregarding the object. An agent ignores an object.""",
        `@extends` = () => List(AssessAction.ontology)
       ){
}