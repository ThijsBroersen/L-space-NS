package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object releasedEvent extends PropertyDef(
        iri = "http://schema.org/releasedEvent",
        iris = Set("http://schema.org/releasedEvent"),
        label = "releasedEvent",
        comment = """The place and time the release was issued, expressed as a PublicationEvent.""",
        `@extends` = () => List(),
        `@range` = () => List(PublicationEvent.ontology)
       ){
}