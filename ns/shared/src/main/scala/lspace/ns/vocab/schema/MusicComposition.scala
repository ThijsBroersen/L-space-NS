package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MusicComposition extends OntologyDef(
        iri = "http://schema.org/MusicComposition",
        iris = Set("http://schema.org/MusicComposition"),
        label = "MusicComposition",
        comment = """A musical composition.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}