package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object DeliveryChargeSpecification extends OntologyDef(
        iri = "http://schema.org/DeliveryChargeSpecification",
        iris = Set("http://schema.org/DeliveryChargeSpecification"),
        label = "DeliveryChargeSpecification",
        comment = """The price for the delivery of an offer using a particular delivery method.""",
        `@extends` = () => List(PriceSpecification.ontology)
       ){
}