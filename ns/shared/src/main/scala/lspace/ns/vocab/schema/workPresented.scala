package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object workPresented extends PropertyDef(
        iri = "http://schema.org/workPresented",
        iris = Set("http://schema.org/workPresented"),
        label = "workPresented",
        comment = """The movie presented during this event.""",
        `@extends` = () => List(workFeatured.property),
        `@range` = () => List()
       ){
}