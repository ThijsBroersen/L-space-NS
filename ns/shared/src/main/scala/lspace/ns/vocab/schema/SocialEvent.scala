package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SocialEvent extends OntologyDef(
        iri = "http://schema.org/SocialEvent",
        iris = Set("http://schema.org/SocialEvent"),
        label = "SocialEvent",
        comment = """Event type: Social event.""",
        `@extends` = () => List(Event.ontology)
       ){
}