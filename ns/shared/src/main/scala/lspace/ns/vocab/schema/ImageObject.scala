package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ImageObject extends OntologyDef(
        iri = "http://schema.org/ImageObject",
        iris = Set("http://schema.org/ImageObject"),
        label = "ImageObject",
        comment = """An image file.""",
        `@extends` = () => List(MediaObject.ontology)
       ){
}