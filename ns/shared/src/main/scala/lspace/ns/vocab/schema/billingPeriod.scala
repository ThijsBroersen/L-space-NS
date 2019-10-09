package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object billingPeriod extends PropertyDef(
        iri = "http://schema.org/billingPeriod",
        iris = Set("http://schema.org/billingPeriod"),
        label = "billingPeriod",
        comment = """The time interval used to compute the invoice.""",
        `@extends` = List(),
        `@range` = List(Duration.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}