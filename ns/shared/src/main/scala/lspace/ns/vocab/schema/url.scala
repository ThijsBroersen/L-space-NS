package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object url extends PropertyDef(
        iri = "http://schema.org/url",
        iris = Set("http://schema.org/url"),
        label = "url",
        comment = """URL of the item.""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology)
       ){
}