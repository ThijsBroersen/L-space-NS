package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object requiredCollateral extends PropertyDef(
        iri = "http://schema.org/requiredCollateral",
        iris = Set("http://schema.org/requiredCollateral"),
        label = "requiredCollateral",
        comment = """Assets required to secure loan or credit repayments. It may take form of third party pledge, goods, financial instruments (cash, securities, etc.)""",
        `@extends` = () => List(),
        `@range` = () => List(Thing.ontology, Text.ontology)
       ){
}