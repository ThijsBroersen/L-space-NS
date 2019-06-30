package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object includedRiskFactor extends PropertyDef(
        iri = "http://schema.org/includedRiskFactor",
        iris = Set("http://schema.org/includedRiskFactor"),
        label = "includedRiskFactor",
        comment = """A modifiable or non-modifiable risk factor included in the calculation, e.g. age, coexisting condition.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){
}