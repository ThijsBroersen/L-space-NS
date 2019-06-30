package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object WantAction extends OntologyDef(
        iri = "http://schema.org/WantAction",
        iris = Set("http://schema.org/WantAction"),
        label = "WantAction",
        comment = """The act of expressing a desire about the object. An agent wants an object.""",
        `@extends` = () => List(ReactAction.ontology)
       ){
}