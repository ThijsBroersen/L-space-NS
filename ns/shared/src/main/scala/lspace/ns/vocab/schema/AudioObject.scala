package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AudioObject extends OntologyDef(
        iri = "http://schema.org/AudioObject",
        iris = Set("http://schema.org/AudioObject"),
        label = "AudioObject",
        comment = """An audio file.""",
        `@extends` = () => List(MediaObject.ontology)
       ){
}