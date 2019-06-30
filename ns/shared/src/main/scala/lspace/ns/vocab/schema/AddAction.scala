package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AddAction extends OntologyDef(
        iri = "http://schema.org/AddAction",
        iris = Set("http://schema.org/AddAction"),
        label = "AddAction",
        comment = """The act of editing by adding an object to a collection.""",
        `@extends` = () => List(UpdateAction.ontology)
       ){
}