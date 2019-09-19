package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object totalPaymentDue extends PropertyDef(
        iri = "http://schema.org/totalPaymentDue",
        iris = Set("http://schema.org/totalPaymentDue"),
        label = "totalPaymentDue",
        comment = """The total amount due.""",
        `@extends` = () => List(),
        `@range` = () => List(PriceSpecification.ontology, MonetaryAmount.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}