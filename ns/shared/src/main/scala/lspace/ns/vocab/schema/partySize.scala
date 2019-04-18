package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object partySize extends PropertyDef(
        iri = "http://schema.org/partySize",
        iris = Set("http://schema.org/partySize"),
        label = "partySize",
        comment = """Number of people the reservation should accommodate.""",
        `@extends` = () => List(),
        `@range` = () => List(QuantitativeValue.ontology, Integer.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}