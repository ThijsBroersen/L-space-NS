package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object eligibleCustomerType extends PropertyDef(
        iri = "http://schema.org/eligibleCustomerType",
        iris = Set("http://schema.org/eligibleCustomerType"),
        label = "eligibleCustomerType",
        comment = """The type(s) of customers for which the given offer is valid.""",
        `@extends` = () => List(),
        `@range` = () => List(BusinessEntityType.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}