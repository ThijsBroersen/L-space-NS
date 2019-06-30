package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MusicRecording extends OntologyDef(
        iri = "http://schema.org/MusicRecording",
        iris = Set("http://schema.org/MusicRecording"),
        label = "MusicRecording",
        comment = """A music recording (track), usually a single song.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
}