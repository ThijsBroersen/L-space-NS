package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Drawing extends OntologyDef(
        iri = "http://schema.org/Drawing",
        iris = Set("http://schema.org/Drawing"),
        label = "Drawing",
        comment = """A picture or diagram made with a pencil, pen, or crayon rather than paint.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}