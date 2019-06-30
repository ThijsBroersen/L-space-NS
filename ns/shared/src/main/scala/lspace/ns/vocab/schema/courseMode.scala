package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object courseMode extends PropertyDef(
        iri = "http://schema.org/courseMode",
        iris = Set("http://schema.org/courseMode"),
        label = "courseMode",
        comment = """The medium or means of delivery of the course instance or the mode of study, either as a text label (e.g. "online", "onsite" or "blended"; "synchronous" or "asynchronous"; "full-time" or "part-time") or as a URL reference to a term from a controlled vocabulary (e.g. https://ceds.ed.gov/element/001311#Asynchronous ).""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology, URL.ontology)
       ){
}