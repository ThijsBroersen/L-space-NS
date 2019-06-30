package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object performerIn extends PropertyDef(
        iri = "http://schema.org/performerIn",
        iris = Set("http://schema.org/performerIn"),
        label = "performerIn",
        comment = """Event that this person is a performer or participant in.""",
        `@extends` = () => List(),
        `@range` = () => List(Event.ontology)
       ){
}