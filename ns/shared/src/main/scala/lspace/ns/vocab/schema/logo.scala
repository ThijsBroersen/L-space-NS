package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object logo extends PropertyDef(
        iri = "http://schema.org/logo",
        iris = Set("http://schema.org/logo"),
        label = "logo",
        comment = """An associated logo.""",
        `@extends` = () => List(image.property),
        `@range` = () => List(URL.ontology, ImageObject.ontology)
       ){
}