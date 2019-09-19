package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object hasDeliveryMethod extends PropertyDef(
        iri = "http://schema.org/hasDeliveryMethod",
        iris = Set("http://schema.org/hasDeliveryMethod"),
        label = "hasDeliveryMethod",
        comment = """Method used for delivery or shipping.""",
        `@extends` = () => List(),
        `@range` = () => List(DeliveryMethod.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}