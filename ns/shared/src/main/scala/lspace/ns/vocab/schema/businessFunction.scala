package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object businessFunction extends PropertyDef(
        iri = "http://schema.org/businessFunction",
        iris = Set("http://schema.org/businessFunction"),
        label = "businessFunction",
        comment = """The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.""",
        `@extends` = () => List(),
        `@range` = () => List(BusinessFunction.ontology)
       ){
}