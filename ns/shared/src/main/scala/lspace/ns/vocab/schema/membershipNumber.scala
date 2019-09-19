package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object membershipNumber extends PropertyDef(
        iri = "http://schema.org/membershipNumber",
        iris = Set("http://schema.org/membershipNumber"),
        label = "membershipNumber",
        comment = """A unique identifier for the membership.""",
        `@extends` = () => List(),
        `@range` = () => List(Text.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}