package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object artform extends PropertyDef(
        iri = "http://schema.org/artform",
        iris = Set("http://schema.org/artform"),
        label = "artform",
        comment = """e.g. Painting, Drawing, Sculpture, Print, Photograph, Assemblage, Collage, etc.""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology, Text.ontology)
       ){
}