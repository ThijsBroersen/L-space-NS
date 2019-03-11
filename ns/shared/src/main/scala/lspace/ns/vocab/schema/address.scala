package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object address extends PropertyDef(
        iri = "https://schema.org/address",
        iris = Set("https://schema.org/address"),
        label = "address",
        comment = """Physical address of the item.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}