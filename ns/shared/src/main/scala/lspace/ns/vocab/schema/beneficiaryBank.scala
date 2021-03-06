package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object beneficiaryBank extends PropertyDef(
        iri = "http://schema.org/beneficiaryBank",
        iris = Set("http://schema.org/beneficiaryBank"),
        label = "beneficiaryBank",
        comment = """A bank or bank’s branch, financial institution or international financial institution operating the beneficiary’s bank account or releasing funds for the beneficiary""",
        `@extends` = List(),
        `@range` = List(BankOrCreditUnion.ontology, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}