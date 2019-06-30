package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Audiobook extends OntologyDef(
        iri = "http://schema.org/Audiobook",
        iris = Set("http://schema.org/Audiobook"),
        label = "Audiobook",
        comment = """An audiobook.""",
        `@extends` = () => List(AudioObject.ontology, Book.ontology)
       ){
}