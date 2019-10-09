package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object appliesToDeliveryMethod extends PropertyDef(
        iri = "http://schema.org/appliesToDeliveryMethod",
        iris = Set("http://schema.org/appliesToDeliveryMethod"),
        label = "appliesToDeliveryMethod",
        comment = """The delivery method(s) to which the delivery charge or payment charge specification applies.""",
        `@extends` = List(),
        `@range` = List(DeliveryMethod.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}