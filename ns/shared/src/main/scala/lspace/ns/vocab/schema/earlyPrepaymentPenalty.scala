package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object earlyPrepaymentPenalty extends PropertyDef(
        iri = "http://schema.org/earlyPrepaymentPenalty",
        iris = Set("http://schema.org/earlyPrepaymentPenalty"),
        label = "earlyPrepaymentPenalty",
        comment = """The amount to be paid as a penalty in the event of early payment of the loan.""",
        `@extends` = () => List(),
        `@range` = () => List(MonetaryAmount.ontology)
       ){
}