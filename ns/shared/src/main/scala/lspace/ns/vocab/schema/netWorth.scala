package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object netWorth extends PropertyDef(
        iri = "http://schema.org/netWorth",
        iris = Set("http://schema.org/netWorth"),
        label = "netWorth",
        comment = """The total financial value of the person as calculated by subtracting assets from liabilities.""",
        `@extends` = List(),
        `@range` = List(MonetaryAmount.ontology, PriceSpecification.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}