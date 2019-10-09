package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object recourseLoan extends PropertyDef(
        iri = "http://schema.org/recourseLoan",
        iris = Set("http://schema.org/recourseLoan"),
        label = "recourseLoan",
        comment = """The only way you get the money back in the event of default is the security. Recourse is where you still have the opportunity to go back to the borrower for the rest of the money.""",
        `@extends` = List(),
        `@range` = List(`@boolean`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}