package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object superEvent extends PropertyDef(
        iri = "http://schema.org/superEvent",
        iris = Set("http://schema.org/superEvent"),
        label = "superEvent",
        comment = """An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.""",
        `@extends` = () => List(),
        `@range` = () => List(Event.ontology)
       ){
}