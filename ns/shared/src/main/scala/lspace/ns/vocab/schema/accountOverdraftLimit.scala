package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object accountOverdraftLimit extends PropertyDef(
        iri = "http://schema.org/accountOverdraftLimit",
        iris = Set("http://schema.org/accountOverdraftLimit"),
        label = "accountOverdraftLimit",
        comment = """An overdraft is an extension of credit from a lending institution when an account reaches zero. An overdraft allows the individual to continue withdrawing money even if the account has no funds in it. Basically the bank allows people to borrow a set amount of money.""",
        `@extends` = List(),
        `@range` = List(MonetaryAmount.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}