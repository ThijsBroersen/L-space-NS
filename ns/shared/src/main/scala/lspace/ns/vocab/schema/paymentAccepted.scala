package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object paymentAccepted extends PropertyDef(
        iri = "http://schema.org/paymentAccepted",
        iris = Set("http://schema.org/paymentAccepted"),
        label = "paymentAccepted",
        comment = """Cash, Credit Card, Cryptocurrency, Local Exchange Tradings System, etc.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){
}