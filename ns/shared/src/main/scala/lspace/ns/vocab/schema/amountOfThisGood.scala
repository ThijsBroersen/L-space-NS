package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object amountOfThisGood extends PropertyDef(
        iri = "http://schema.org/amountOfThisGood",
        iris = Set("http://schema.org/amountOfThisGood"),
        label = "amountOfThisGood",
        comment = """The quantity of the goods included in the offer.""",
        `@extends` = () => List(),
        `@range` = () => List(`@number`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}