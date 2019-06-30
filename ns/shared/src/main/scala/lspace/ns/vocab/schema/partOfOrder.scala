package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object partOfOrder extends PropertyDef(
        iri = "http://schema.org/partOfOrder",
        iris = Set("http://schema.org/partOfOrder"),
        label = "partOfOrder",
        comment = """The overall order the items in this delivery were included in.""",
        `@extends` = () => List(),
        `@range` = () => List(Order.ontology)
       ){
}