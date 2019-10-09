package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object transmissionMethod extends PropertyDef(
        iri = "http://schema.org/transmissionMethod",
        iris = Set("http://schema.org/transmissionMethod"),
        label = "transmissionMethod",
        comment = """How the disease spreads, either as a route or vector, for example 'direct contact', 'Aedes aegypti', etc.""",
        `@extends` = List(),
        `@range` = List(`@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}