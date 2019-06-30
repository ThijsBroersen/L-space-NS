package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PaintAction extends OntologyDef(
        iri = "http://schema.org/PaintAction",
        iris = Set("http://schema.org/PaintAction"),
        label = "PaintAction",
        comment = """The act of producing a painting, typically with paint and canvas as instruments.""",
        `@extends` = () => List(CreateAction.ontology)
       ){
}