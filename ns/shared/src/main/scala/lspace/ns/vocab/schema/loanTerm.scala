package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object loanTerm extends PropertyDef(
        iri = "http://schema.org/loanTerm",
        iris = Set("http://schema.org/loanTerm"),
        label = "loanTerm",
        comment = """The duration of the loan or credit agreement.""",
        `@extends` = () => List(duration.property),
        `@range` = () => List(QuantitativeValue.ontology)
       ){
}