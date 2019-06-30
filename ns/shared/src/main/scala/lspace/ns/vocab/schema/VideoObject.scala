package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object VideoObject extends OntologyDef(
        iri = "http://schema.org/VideoObject",
        iris = Set("http://schema.org/VideoObject"),
        label = "VideoObject",
        comment = """A video file.""",
        `@extends` = () => List(MediaObject.ontology)
       ){
}