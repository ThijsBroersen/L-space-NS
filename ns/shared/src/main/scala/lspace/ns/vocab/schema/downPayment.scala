package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object downPayment extends PropertyDef(
        iri = "http://schema.org/downPayment",
        iris = Set("http://schema.org/downPayment"),
        label = "downPayment",
        comment = """a type of payment made in cash during the onset of the purchase of an expensive good/service. The payment typically represents only a percentage of the full purchase price.""",
        `@extends` = List(),
        `@range` = List(`@number`, MonetaryAmount.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}