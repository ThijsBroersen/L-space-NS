package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object availableDeliveryMethod extends PropertyDef(
        iri = "http://schema.org/availableDeliveryMethod",
        iris = Set("http://schema.org/availableDeliveryMethod"),
        label = "availableDeliveryMethod",
        comment = """The delivery method(s) available for this offer.""",
        `@extends` = () => List(),
        `@range` = () => List(DeliveryMethod.ontology)
       ){
}