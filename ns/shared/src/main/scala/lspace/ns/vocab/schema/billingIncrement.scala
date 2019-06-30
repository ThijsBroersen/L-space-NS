package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object billingIncrement extends PropertyDef(
        iri = "http://schema.org/billingIncrement",
        iris = Set("http://schema.org/billingIncrement"),
        label = "billingIncrement",
        comment = """This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.""",
        `@extends` = () => List(),
        `@range` = () => List(Number.ontology)
       ){
}