package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ConsumeAction extends OntologyDef(
        iri = "http://schema.org/ConsumeAction",
        iris = Set("http://schema.org/ConsumeAction"),
        label = "ConsumeAction",
        comment = """The act of ingesting information/resources/food.""",
        `@extends` = () => List(Action.ontology)
       ){
}