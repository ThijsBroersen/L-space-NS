package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object NoteDigitalDocument extends OntologyDef(
        iri = "http://schema.org/NoteDigitalDocument",
        iris = Set("http://schema.org/NoteDigitalDocument"),
        label = "NoteDigitalDocument",
        comment = """A file containing a note, primarily for the author.""",
        `@extends` = () => List(DigitalDocument.ontology)
       ){
}