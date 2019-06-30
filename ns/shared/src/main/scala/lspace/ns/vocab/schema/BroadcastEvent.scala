package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object BroadcastEvent extends OntologyDef(
        iri = "http://schema.org/BroadcastEvent",
        iris = Set("http://schema.org/BroadcastEvent"),
        label = "BroadcastEvent",
        comment = """An over the air or online broadcast event.""",
        `@extends` = () => List(PublicationEvent.ontology)
       ){
}