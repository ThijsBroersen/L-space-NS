package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object deliveryMethod extends PropertyDef(
        iri = "http://schema.org/deliveryMethod",
        iris = Set("http://schema.org/deliveryMethod"),
        label = "deliveryMethod",
        comment = """A sub property of instrument. The method of delivery.""",
        `@extends` = () => List(instrument.property),
        `@range` = () => List(DeliveryMethod.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.instrument.Properties
}