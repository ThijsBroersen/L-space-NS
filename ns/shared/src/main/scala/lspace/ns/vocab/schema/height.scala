package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object height extends PropertyDef(
        iri = "http://schema.org/height",
        iris = Set("http://schema.org/height"),
        label = "height",
        comment = """The height of the item.""",
        `@extends` = () => List(),
        `@range` = () => List(Distance.ontology, QuantitativeValue.ontology)
       ){
}