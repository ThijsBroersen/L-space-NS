package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object numAdults extends PropertyDef(
        iri = "http://schema.org/numAdults",
        iris = Set("http://schema.org/numAdults"),
        label = "numAdults",
        comment = """The number of adults staying in the unit.""",
        `@extends` = () => List(),
        `@range` = () => List(QuantitativeValue.ontology)
       ){
}