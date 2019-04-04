package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property, PropertyDef}
object postalCode extends PropertyDef(
        iri = "https://schema.org/postalCode",
        iris = Set("https://schema.org/postalCode"),
        label = "postalCode",
        comment = """The postal code. For example, 94043.""",
        `@extends` = () => List(),
        `@range` = () => List(`@string`)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}