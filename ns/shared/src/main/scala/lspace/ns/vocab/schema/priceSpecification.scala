package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object priceSpecification extends PropertyDef(
        iri = "http://schema.org/priceSpecification",
        iris = Set("http://schema.org/priceSpecification"),
        label = "priceSpecification",
        comment = """One or more detailed price specifications, indicating the unit price and delivery or payment charges.""",
        `@extends` = () => List(),
        `@range` = () => List(PriceSpecification.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}