package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object VideoGame extends OntologyDef(
        iri = "http://schema.org/VideoGame",
        iris = Set("http://schema.org/VideoGame"),
        label = "VideoGame",
        comment = """A video game is an electronic game that involves human interaction with a user interface to generate visual feedback on a video device.""",
        `@extends` = () => List(Game.ontology, SoftwareApplication.ontology)
       ){
}