package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object TradeAction extends OntologyDef(
        iri = "http://schema.org/TradeAction",
        iris = Set("http://schema.org/TradeAction"),
        label = "TradeAction",
        comment = """The act of participating in an exchange of goods and services for monetary compensation. An agent trades an object, product or service with a participant in exchange for a one time or periodic payment.""",
        `@extends` = () => List(Action.ontology)
       ){
}