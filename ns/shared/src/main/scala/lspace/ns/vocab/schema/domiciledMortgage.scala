package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object domiciledMortgage extends PropertyDef(
        iri = "http://schema.org/domiciledMortgage",
        iris = Set("http://schema.org/domiciledMortgage"),
        label = "domiciledMortgage",
        comment = """Whether borrower is a resident of the jurisdiction where the property is located.""",
        `@extends` = List(),
        `@range` = List(`@boolean`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}