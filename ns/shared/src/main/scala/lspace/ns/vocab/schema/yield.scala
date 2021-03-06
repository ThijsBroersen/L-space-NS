package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object `yield` extends PropertyDef(
        iri = "http://schema.org/yield",
        iris = Set("http://schema.org/yield"),
        label = "yield",
        comment = """The quantity that results by performing instructions. For example, a paper airplane, 10 personalized candles.""",
        `@extends` = List(),
        `@range` = List(QuantitativeValue.ontology, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}