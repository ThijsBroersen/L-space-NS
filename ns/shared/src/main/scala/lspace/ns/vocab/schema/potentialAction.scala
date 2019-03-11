package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.structure.{Property, PropertyDef}
object potentialAction extends PropertyDef(
        iri = "https://schema.org/potentialAction",
        iris = Set("https://schema.org/potentialAction"),
        label = "potentialAction",
        comment = """Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.""",
        `@extends` = () => List(),
        `@range` = () => List()
       ){

override lazy val properties: List[Property] = List()
trait Properties 
}