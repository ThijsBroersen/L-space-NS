package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object minimumPaymentDue extends PropertyDef(
        iri = "http://schema.org/minimumPaymentDue",
        iris = Set("http://schema.org/minimumPaymentDue"),
        label = "minimumPaymentDue",
        comment = """The minimum payment required at this time.""",
        `@extends` = List(),
        `@range` = List(PriceSpecification.ontology, MonetaryAmount.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}