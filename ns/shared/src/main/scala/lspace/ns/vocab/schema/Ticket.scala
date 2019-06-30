package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Ticket extends OntologyDef(
        iri = "http://schema.org/Ticket",
        iris = Set("http://schema.org/Ticket"),
        label = "Ticket",
        comment = """Used to describe a ticket to an event, a flight, a bus ride, etc.""",
        `@extends` = () => List(Intangible.ontology)
       ){
}