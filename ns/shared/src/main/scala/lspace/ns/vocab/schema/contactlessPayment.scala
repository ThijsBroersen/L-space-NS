package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object contactlessPayment extends PropertyDef(
        iri = "http://schema.org/contactlessPayment",
        iris = Set("http://schema.org/contactlessPayment"),
        label = "contactlessPayment",
        comment = """A secure method for consumers to purchase products or services via debit, credit or smartcards by using RFID or NFC technology.""",
        `@extends` = List(),
        `@range` = List(`@boolean`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}