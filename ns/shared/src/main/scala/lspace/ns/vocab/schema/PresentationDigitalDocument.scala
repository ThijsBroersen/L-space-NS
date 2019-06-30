package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object PresentationDigitalDocument extends OntologyDef(
        iri = "http://schema.org/PresentationDigitalDocument",
        iris = Set("http://schema.org/PresentationDigitalDocument"),
        label = "PresentationDigitalDocument",
        comment = """A file containing slides or used for a presentation.""",
        `@extends` = () => List(DigitalDocument.ontology)
       ){
}