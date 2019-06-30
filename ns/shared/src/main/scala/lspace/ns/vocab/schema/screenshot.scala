package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object screenshot extends PropertyDef(
        iri = "http://schema.org/screenshot",
        iris = Set("http://schema.org/screenshot"),
        label = "screenshot",
        comment = """A link to a screenshot image of the app.""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology, ImageObject.ontology)
       ){
}