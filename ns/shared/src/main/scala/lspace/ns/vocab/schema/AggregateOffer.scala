package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object AggregateOffer extends OntologyDef(
        iri = "http://schema.org/AggregateOffer",
        iris = Set("http://schema.org/AggregateOffer"),
        label = "AggregateOffer",
        comment = """When a single product is associated with multiple offers (for example, the same pair of shoes is offered by different merchants), then AggregateOffer can be used.""",
        `@extends` = () => List(Offer.ontology)
       ){
}