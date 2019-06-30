package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object InstallAction extends OntologyDef(
        iri = "http://schema.org/InstallAction",
        iris = Set("http://schema.org/InstallAction"),
        label = "InstallAction",
        comment = """The act of installing an application.""",
        `@extends` = () => List(ConsumeAction.ontology)
       ){
}