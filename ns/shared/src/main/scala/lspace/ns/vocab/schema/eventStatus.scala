package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object eventStatus extends PropertyDef(
        iri = "http://schema.org/eventStatus",
        iris = Set("http://schema.org/eventStatus"),
        label = "eventStatus",
        comment = """An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled.""",
        `@extends` = () => List(),
        `@range` = () => List(EventStatusType.ontology)
       ){
}