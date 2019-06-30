package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object beforeMedia extends PropertyDef(
        iri = "http://schema.org/beforeMedia",
        iris = Set("http://schema.org/beforeMedia"),
        label = "beforeMedia",
        comment = """A media object representing the circumstances before performing this direction.""",
        `@extends` = () => List(),
        `@range` = () => List(MediaObject.ontology, URL.ontology)
       ){
}