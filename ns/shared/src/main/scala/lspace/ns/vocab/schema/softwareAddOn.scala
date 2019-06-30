package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object softwareAddOn extends PropertyDef(
        iri = "http://schema.org/softwareAddOn",
        iris = Set("http://schema.org/softwareAddOn"),
        label = "softwareAddOn",
        comment = """Additional content for a software application.""",
        `@extends` = () => List(),
        `@range` = () => List(SoftwareApplication.ontology)
       ){
}