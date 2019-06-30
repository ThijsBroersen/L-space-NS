package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object photo extends PropertyDef(
        iri = "http://schema.org/photo",
        iris = Set("http://schema.org/photo"),
        label = "photo",
        comment = """A photograph of this place.""",
        `@extends` = () => List(image.property),
        `@range` = () => List(Photograph.ontology, ImageObject.ontology)
       ){
}