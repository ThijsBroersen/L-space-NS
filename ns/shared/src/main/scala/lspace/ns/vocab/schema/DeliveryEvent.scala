package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DeliveryEvent extends OntologyDef(
        iri = "http://schema.org/DeliveryEvent",
        iris = Set("http://schema.org/DeliveryEvent"),
        label = "DeliveryEvent",
        comment = """An event involving the delivery of an item.""",
        `@extends` = () => List(Event.ontology)
       ){
}