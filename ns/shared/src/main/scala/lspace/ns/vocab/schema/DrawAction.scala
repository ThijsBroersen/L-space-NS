package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DrawAction extends OntologyDef(
        iri = "http://schema.org/DrawAction",
        iris = Set("http://schema.org/DrawAction"),
        label = "DrawAction",
        comment = """The act of producing a visual/graphical representation of an object, typically with a pen/pencil and paper as instruments.""",
        `@extends` = () => List(CreateAction.ontology)
       ){
}