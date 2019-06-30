package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MusicVenue extends OntologyDef(
        iri = "http://schema.org/MusicVenue",
        iris = Set("http://schema.org/MusicVenue"),
        label = "MusicVenue",
        comment = """A music venue.""",
        `@extends` = () => List(CivicStructure.ontology)
       ){
}