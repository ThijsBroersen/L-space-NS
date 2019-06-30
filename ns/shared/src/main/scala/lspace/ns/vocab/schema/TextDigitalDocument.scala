package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TextDigitalDocument extends OntologyDef(
        iri = "http://schema.org/TextDigitalDocument",
        iris = Set("http://schema.org/TextDigitalDocument"),
        label = "TextDigitalDocument",
        comment = """A file composed primarily of text.""",
        `@extends` = () => List(DigitalDocument.ontology)
       ){
}