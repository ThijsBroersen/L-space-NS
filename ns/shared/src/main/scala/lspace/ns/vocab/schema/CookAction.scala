package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CookAction extends OntologyDef(
        iri = "http://schema.org/CookAction",
        iris = Set("http://schema.org/CookAction"),
        label = "CookAction",
        comment = """The act of producing/preparing food.""",
        `@extends` = () => List(CreateAction.ontology)
       ){
}