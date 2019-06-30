package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object encodings extends PropertyDef(
        iri = "http://schema.org/encodings",
        iris = Set("http://schema.org/encodings"),
        label = "encodings",
        comment = """A media object that encodes this CreativeWork.""",
        `@extends` = () => List(),
        `@range` = () => List(MediaObject.ontology)
       ){
}