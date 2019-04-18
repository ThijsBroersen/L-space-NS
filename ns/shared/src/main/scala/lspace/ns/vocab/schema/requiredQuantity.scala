package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object requiredQuantity extends PropertyDef(
        iri = "http://schema.org/requiredQuantity",
        iris = Set("http://schema.org/requiredQuantity"),
        label = "requiredQuantity",
        comment = """The required quantity of the item(s).""",
        `@extends` = () => List(),
        `@range` = () => List(Number.ontology, Text.ontology, QuantitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}