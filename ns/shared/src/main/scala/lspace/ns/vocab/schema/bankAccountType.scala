package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object bankAccountType extends PropertyDef(
        iri = "http://schema.org/bankAccountType",
        iris = Set("http://schema.org/bankAccountType"),
        label = "bankAccountType",
        comment = """The type of a bank account.""",
        `@extends` = () => List(),
        `@range` = () => List(URL.ontology, Text.ontology)
       ){
}