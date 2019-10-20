package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object cashBack extends PropertyDef(
        iri = "http://schema.org/cashBack",
        iris = Set("http://schema.org/cashBack"),
        label = "cashBack",
        comment = """A cardholder benefit that pays the cardholder a small percentage of their net expenditures.""",
        `@extends` = List(),
        `@range` = List(`@number`, `@boolean`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}