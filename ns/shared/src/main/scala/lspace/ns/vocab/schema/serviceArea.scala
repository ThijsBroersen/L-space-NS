package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object serviceArea extends PropertyDef(
        iri = "https://schema.org/serviceArea",
        iris = Set("https://schema.org/serviceArea"),
        label = "serviceArea",
        comment = """The geographic area where the service is provided.""",
        `@extends` = () => List(),
        `@range` = () => List(Place)
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}